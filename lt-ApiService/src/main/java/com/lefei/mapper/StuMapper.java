package com.lefei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lefei.entity.Stu;
import com.lefei.model.vo.StuVO;

import java.util.List;

public interface StuMapper extends BaseMapper<Stu> {


    /**
     * 查询标签列表
     *
     * @return 标签列表
     */
    List<StuVO>  selectStuList();
}
