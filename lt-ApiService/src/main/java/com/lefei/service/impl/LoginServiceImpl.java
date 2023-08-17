package com.lefei.service.impl;

import com.lefei.model.dto.CodeDTO;
import com.lefei.model.dto.LoginDTO;
import com.lefei.model.dto.RegisterDTO;
import com.lefei.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * 登录业务接口实现类
 *
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(LoginDTO login) {
        return null;
    }

    @Override
    public void sendCode(String username) {

    }

    @Override
    public void register(RegisterDTO register) {

    }

    @Override
    public String giteeLogin(CodeDTO data) {
        return null;
    }

    @Override
    public String githubLogin(CodeDTO data) {
        return null;
    }

    @Override
    public String qqLogin(CodeDTO data) {
        return null;
    }
}
