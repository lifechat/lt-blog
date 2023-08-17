package com.lefei.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lefei.entity.Stu;
import com.lefei.mapper.StuMapper;
import com.lefei.model.vo.*;
import com.lefei.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StuServiceImpl extends ServiceImpl<StuMapper,Stu> implements StuService {
    @Autowired
    private StuMapper stumapper;

    @Override
    public List<StuVO> listStuVO() {
        return stumapper.selectStuListVO() ;
    }
}
