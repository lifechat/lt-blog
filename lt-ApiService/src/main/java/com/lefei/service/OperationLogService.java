package com.lefei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lefei.entity.OperationLog;
import com.lefei.model.dto.ConditionDTO;
import com.lefei.model.vo.OperationLogVO;
import com.lefei.model.vo.PageResult;

/**
 * 操作日志业务接口
 *
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查看操作日志列表
     *
     * @param condition 条件
     * @return 日志列表
     */
    PageResult<OperationLogVO> listOperationLogVO(ConditionDTO condition);

    /**
     * 保存操作日志
     *
     * @param operationLog 操作日志信息
     */
    void saveOperationLog(OperationLog operationLog);
}
