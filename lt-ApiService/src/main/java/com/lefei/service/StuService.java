package com.lefei.service;

import com.lefei.entity.Stu;

import java.util.List;

public interface StuService {

    // 获取单个学生信息
    public Stu getStuInfo(int id);

    // 获取所有学生信息
    public List<Stu> queryAllStuInfo();


    public void saveStu();

    public void updateStu(int id);

    public void deleteStu(int id);
}
