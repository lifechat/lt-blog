package com.lefei.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 登录信息
 *
 **/
@Data
@ApiModel(description = "登录信息")
public class LoginDTO {
    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 用户密码
     */
    @Size(min = 6, message = "密码不能少于6位")
    @ApiModelProperty(value = "用户密码")
    private String password;

}
