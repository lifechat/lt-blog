package com.lefei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lefei.entity.Stu;
import com.lefei.mapper.StuMapper;
import com.lefei.model.vo.StuVO;
import com.lefei.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StuServiceImpl extends ServiceImpl<StuMapper,Stu> implements StuService {

    @Autowired
    private StuMapper stuMapper;
    @Override
    public Stu getStuInfo(int id) {
        return null;
    }

    @Override
    public List<Stu> queryAllStuInfo() {
        return null;
    }

    @Override
    public void saveStu() {

    }

    @Override
    public void updateStu(int id) {

    }

    @Override
    public void deleteStu(int id) {

    }
}
