package com.lefei.controller;

import com.lefei.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class StuController {
    @Autowired
    private StuService stuService;


    @GetMapping("/hello")
    public String Hello() {
        return "Hello,world!";
    }


}
