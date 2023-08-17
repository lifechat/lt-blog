package com.lefei.model.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel(description = "学生信息DTO")
public class StuDTO {
    /**
     * 标签id
     */
    @ApiModelProperty(value = "标签id")
    private Integer id;
    /**
     * 标签名
     */
    @NotBlank(message = "名字不能为空")
    @ApiModelProperty(value = "学生姓名")
    private String name;
    /**
     * 标签名
     */
    @NotBlank(message = "年龄不能为空")
    @ApiModelProperty(value = "年龄")
    private Integer age;
}
