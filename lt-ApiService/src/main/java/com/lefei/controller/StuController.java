package com.lefei.controller;

import com.lefei.annotation.VisitLogger;
import com.lefei.model.vo.Result;
import com.lefei.model.vo.StuVO;
import com.lefei.service.StuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import java.util.List;


/**
 * 测试接口
 * @author lifechat
 **/
@Api(tags = "学生模块")
@RestController
public class StuController {
    @Autowired
    private StuService stuService;

    /**
     * 查看标签下的文章
     *
     * @param condition 查询条件
     * @return 文章列表
     */
    @VisitLogger(value = "标签文章")
    @ApiOperation(value = "查看标签下的文章")
    @GetMapping("/getStu")
    public Result<List<StuVO>> listStuVO() {
        return Result.success(stuService.listStuVO());
    }
    @GetMapping("/hello")
    public String Hello() {

        return "Hello,world!";
    }


}
