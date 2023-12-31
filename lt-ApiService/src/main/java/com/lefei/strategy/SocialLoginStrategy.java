package com.lefei.strategy;

import com.lefei.model.dto.CodeDTO;

/**
 * 第三方登录策略
 */
public interface SocialLoginStrategy {

    /**
     * 登录
     *
     * @param data 第三方code
     * @return {@link String} Token
     */
    String login(CodeDTO data);
}
