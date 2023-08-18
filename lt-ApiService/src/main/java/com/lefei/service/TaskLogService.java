package com.lefei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lefei.entity.TaskLog;
import com.lefei.model.dto.ConditionDTO;
import com.lefei.model.vo.PageResult;
import com.lefei.model.vo.TaskLogVO;

/**
 * 定时任务日志业务接口
 *
 * @author ican
 */
public interface TaskLogService extends IService<TaskLog> {

    /**
     * 查看后台定时任务日志
     *
     * @param condition 条件
     * @return 后台定时任务日志
     */
    PageResult<TaskLogVO> listTaskLog(ConditionDTO condition);

    /**
     * 清空定时任务日志
     */
    void clearTaskLog();
}
