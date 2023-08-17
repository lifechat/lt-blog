package com.lefei.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * QQ登录DTO
 *
 **/
@Data
@ApiModel(description = "QQ登录DTO")
public class QqLoginDTO {

    /**
     * openId
     */
    @ApiModelProperty(value = "openId")
    private String openid;

    /**
     * clientId
     */
    @ApiModelProperty(value = "clientId")
    private String client_id;
}