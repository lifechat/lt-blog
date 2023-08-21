package com.lefei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lefei.entity.Friend;
import com.lefei.mapper.FriendMapper;
import com.lefei.model.dto.ConditionDTO;
import com.lefei.model.dto.FriendDTO;
import com.lefei.model.vo.FriendBackVO;
import com.lefei.model.vo.FriendVO;
import com.lefei.model.vo.PageResult;
import com.lefei.service.FriendService;
import com.lefei.utils.BeanCopyUtils;
import com.lefei.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 友链业务接口实现类
 *
 */
@Service
public class FriendServiceImpl extends ServiceImpl<FriendMapper, Friend> implements FriendService {

    @Autowired
    private FriendMapper friendMapper;

    @Override
    public List<FriendVO> listFriendVO() {
        // 查询友链列表
        return friendMapper.selectFriendVOList();
    }

    @Override
    public PageResult<FriendBackVO> listFriendBackVO(ConditionDTO condition) {
        // 查询友链数量
        Long count = friendMapper.selectCount(new LambdaQueryWrapper<Friend>()
                .like(StringUtils.hasText(condition.getKeyword()), Friend::getName, condition.getKeyword())
        );
        if (count == 0) {
            return new PageResult<>();
        }
        // 查询后台友链列表
        List<FriendBackVO> friendBackVOList = friendMapper.selectFriendBackVOList(PageUtils.getLimit(), PageUtils.getSize(), condition.getKeyword());
        return new PageResult<>(friendBackVOList, count);
    }

    @Override
    public void addFriend(FriendDTO friend) {
        // 新友链
        Friend newFriend = BeanCopyUtils.copyBean(friend, Friend.class);
        // 添加友链
        baseMapper.insert(newFriend);
    }

    @Override
    public void updateFriend(FriendDTO friend) {
        // 新友链
        Friend newFriend = BeanCopyUtils.copyBean(friend, Friend.class);
        // 更新友链
        baseMapper.updateById(newFriend);
    }
}




