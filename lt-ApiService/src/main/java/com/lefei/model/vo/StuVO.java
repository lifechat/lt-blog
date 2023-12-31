package com.lefei.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户角色VO
 * @author lefei
 **/
@Data
@ApiModel(description = "测试")
public class StuVO {

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "年龄")
    private Integer age;
}