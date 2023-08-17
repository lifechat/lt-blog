//package com.lefei.satoken;
//
//import cn.dev33.satoken.session.SaSession;
//import cn.dev33.satoken.stp.StpInterface;
//import cn.dev33.satoken.stp.StpUtil;
//
//import java.util.List;
//
//public class StpInterfaceImpl implements StpInterface {
//    @Override
//    public List<String> getPermissionList(Object loginId, String loginType) {
//        return null;
//    }
//
//    /**
//     * 返回一个账号所拥有的可用角色标识集合
//     *
//     * @param loginId   登录用户id
//     * @param loginType 登录账号类型
//     * @return 角色集合
//     */
//    @Override
//    public List<String> getRoleList(Object loginId, String loginType) {
//        SaSession session = StpUtil.getSessionBySessionId(loginType);
////        return session.get("Role_list",() -> role);
//    }
//}
