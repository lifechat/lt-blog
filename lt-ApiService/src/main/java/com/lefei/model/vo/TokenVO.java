package com.lefei.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Token
 *
 */
@Data
@ApiModel(description = "Token")
public class TokenVO {

    /**
     * 访问令牌
     */
    @ApiModelProperty(value = "访问令牌")
    private String access_token;
}
