package com.lefei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lefei.entity.Stu;
import com.lefei.mapper.StuMapper;
import com.lefei.model.dto.StuDTO;
import com.lefei.model.vo.StuVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface StuService extends IService<Stu> {



    // 获取所有学生信息
    List<StuVO> listStuVO();


//    List<StuVO>  selectStuVO(Integer menuId);
}
