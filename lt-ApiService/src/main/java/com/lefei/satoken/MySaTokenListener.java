package com.lefei.satoken;


import cn.dev33.satoken.listener.SaTokenListener;
import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.SaLoginModel;
import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lefei.entity.User;
import com.lefei.model.vo.OnlineVO;
import com.lefei.utils.IpUtils;
import com.lefei.utils.UserAgentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.lefei.mapper.UserMapper;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;

import static com.lefei.constant.CommonConstant.ONLINE_USER;
import static com.lefei.enums.ZoneEnum.SHANGHAI;

/**
 * 自定义侦听器的实现
 */
@Component
public class MySaTokenListener implements SaTokenListener {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private HttpServletRequest request;

    /**
     * 每次登录时触发
     */
    @Override
    public void doLogin(String loginType, Object loginId, String tokenValue, SaLoginModel loginModel) {
        // 查询用户昵称
        User user = userMapper.selectOne(new LambdaQueryWrapper<User>()
                .select(User::getAvatar, User::getNickname)
                .eq(User::getId, loginId));
        // 解析browser和os
        Map<String, String> userAgentMap = UserAgentUtils.parseOsAndBrowser(request.getHeader("User-Agent"));
        // 获取登录ip地址
        String ipAddress = IpUtils.getIpAddress(request);
        // 获取登录地址
        String ipSource = IpUtils.getIpSource(ipAddress);
        // 获取登录时间
        LocalDateTime loginTime = LocalDateTime.now(ZoneId.of(SHANGHAI.getZone()));
        OnlineVO onlineVO = OnlineVO.builder()
                .id((Integer) loginId)
                .token(tokenValue)
                .avatar(user.getAvatar())
                .nickname(user.getNickname())
                .ipAddress(ipAddress)
                .ipSource(ipSource)
                .os(userAgentMap.get("os"))
                .browser(userAgentMap.get("browser"))
                .loginTime(loginTime)
                .build();
        // 更新用户登录信息
        User newUser = User.builder()
                .id((Integer) loginId)
                .ipAddress(ipAddress)
                .ipSource(ipSource)
                .loginTime(loginTime)
                .build();
        userMapper.updateById(newUser);
        // 用户在线信息存入tokenSession
        SaSession tokenSession = StpUtil.getTokenSessionByToken(tokenValue);
        tokenSession.set(ONLINE_USER, onlineVO);
    }
    /**
     * 每次注销时触发
     */
    @Override
    public void doLogout(String loginType, Object loginId, String tokenValue) {
        // 删除缓存中的用户信息
        StpUtil.logoutByTokenValue(tokenValue);
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
