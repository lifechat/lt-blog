package com.lefei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lefei.entity.Stu;
import com.lefei.model.dto.StuDTO;
import com.lefei.model.vo.StuVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuMapper extends BaseMapper<Stu> {


    /**
     * 查询标签列表
     *
     * @return 标签列表
     */
    List<StuVO>  selectStuListVO();

    /**
     * 根据学生id 查询
     */

    StuDTO selectStuById(@Param("id") Integer id);
}
