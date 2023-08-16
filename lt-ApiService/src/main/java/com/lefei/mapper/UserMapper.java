package com.lefei.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lefei.entity.User;
import com.lefei.model.dto.ConditionDTO;
import com.lefei.model.vo.UserBackVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户 Mapper
 *
 * @author ican
 * @date 2022/12/05 15:28
 **/
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询用户后台数量
     *
     * @param condition 条件
     * @return 用户数量
     */
    Long countUser(@Param("condition") ConditionDTO condition);

    /**
     * 查询后台用户列表
     *
     * @param limit     页码
     * @param size      大小
     * @param condition 条件
     * @return 用户后台列表
     */
    List<UserBackVO> listUserBackVO(@Param("limit") Long limit, @Param("size") Long size, @Param("condition") ConditionDTO condition);
}