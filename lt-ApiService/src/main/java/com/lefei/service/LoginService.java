package com.lefei.service;

import com.lefei.model.dto.CodeDTO;
import com.lefei.model.dto.LoginDTO;
import com.lefei.model.dto.RegisterDTO;
import org.springframework.stereotype.Service;

/**
 * 登录业务接口
 *
 **/


public interface LoginService {

    /**
     * 用户登录
     *
     * @param login 登录参数
     * @return token
     */
    String login(LoginDTO login);

    /**
     * 发送验证码
     *
     * @param username 用户名
     */
    void sendCode(String username);

    /**
     * 用户注册
     *
     * @param register 注册信息
     */
    void register(RegisterDTO register);

    /**
     * Gitee登录
     *
     * @param data 第三方code
     * @return Token
     */
    String giteeLogin(CodeDTO data);

    /**
     * Github登录
     *
     * @param data 第三方code
     * @return Token
     */
    String githubLogin(CodeDTO data);

    /**
     * QQ登录
     *
     * @param data 第三方code
     * @return token
     */
    String qqLogin(CodeDTO data);
}
