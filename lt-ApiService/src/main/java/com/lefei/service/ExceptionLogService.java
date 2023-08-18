package com.lefei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lefei.entity.ExceptionLog;
import com.lefei.model.dto.ConditionDTO;
import com.lefei.model.vo.PageResult;

/**
 * 异常日志业务接口
 *
 * @author ican
 */
public interface ExceptionLogService extends IService<ExceptionLog> {

    /**
     * 查看异常日志列表
     *
     * @param condition 条件
     * @return 日志列表
     */
    PageResult<ExceptionLog> listExceptionLog(ConditionDTO condition);

    /**
     * 保存异常日志
     *
     * @param exceptionLog 异常日志信息
     */
    void saveExceptionLog(ExceptionLog exceptionLog);
}
