package com.lefei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lefei.entity.Message;
import com.lefei.model.dto.CheckDTO;
import com.lefei.model.dto.ConditionDTO;
import com.lefei.model.dto.MessageDTO;
import com.lefei.model.vo.MessageBackVO;
import com.lefei.model.vo.MessageVO;
import com.lefei.model.vo.PageResult;

import java.util.List;

/**
 * 留言业务接口
 *
 */
public interface MessageService extends IService<Message> {

    /**
     * 查看留言列表
     *
     * @return 留言列表
     */
    List<MessageVO> listMessageVO();

    /**
     * 查看后台留言列表
     *
     * @param condition 条件
     * @return 后台留言列表
     */
    PageResult<MessageBackVO> listMessageBackVO(ConditionDTO condition);

    /**
     * 添加留言
     *
     * @param message 留言
     */
    void addMessage(MessageDTO message);

    /**
     * 审核留言
     *
     * @param check 审核信息
     */
    void updateMessageCheck(CheckDTO check);
}
