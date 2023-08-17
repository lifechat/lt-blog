package com.lefei.model.vo;

import lombok.Data;

/**
 * QQ用户信息
 *
 **/
@Data
public class QqUserInfoVO {

    /**
     * 用户开放id
     */
    private String openId;

    /**
     * QQ头像
     */
    private String figureurl_qq_1;

    /**
     * 昵称
     */
    private String nickname;
}