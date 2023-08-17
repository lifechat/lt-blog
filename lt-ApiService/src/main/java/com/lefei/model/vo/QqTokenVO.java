package com.lefei.model.vo;

import lombok.Data;

/**
 * QQ token信息
 *
 **/
@Data
public class QqTokenVO {

    /**
     * openid
     */
    private String openid;

    /**
     * 客户端id
     */
    private String client_id;
}