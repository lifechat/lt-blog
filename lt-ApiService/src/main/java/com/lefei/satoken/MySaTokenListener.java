package com.lefei.satoken;


import cn.dev33.satoken.listener.SaTokenListener;
import cn.dev33.satoken.stp.SaLoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义侦听器的实现
 */
@Component
public class MySaTokenListener implements SaTokenListener {


    @Autowired
    private HttpServletRequest request;

    /**
     * 每次登录时触发
     */
    @Override
    public void doLogin(String s, Object o, String s1, SaLoginModel saLoginModel) {

    }
    /**
     * 每次注销时触发
     */
    @Override
    public void doLogout(String s, Object o, String s1) {

    }
    /**
     * 每次被踢下线时触发
     */
    @Override
    public void doKickout(String s, Object o, String s1) {

    }
    /**
     * 每次被顶下线时触发
     */
    @Override
    public void doReplaced(String s, Object o, String s1) {

    }
    /**
     * 每次被封禁时触发
     */
    @Override
    public void doDisable(String s, Object o, String s1, int i, long l) {

    }
    /**
     * 每次被解封时触发
     */
    @Override
    public void doUntieDisable(String s, Object o, String s1) {

    }
    /**
     * 每次二级认证时触发
     */
    @Override
    public void doOpenSafe(String s, String s1, String s2, long l) {

    }
    /**
     * 每次退出二级认证时触发
     */
    @Override
    public void doCloseSafe(String s, String s1, String s2) {

    }
    /**
     * 每次创建Session时触发
     */
    @Override
    public void doCreateSession(String s) {

    }
    /**
     * 每次注销Session时触发
     */
    @Override
    public void doLogoutSession(String s) {

    }

    /**
     * 每次Token续期时触发
     */
    @Override
    public void doRenewTimeout(String s, Object o, long l) {

    }
}
