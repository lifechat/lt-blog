package com.lefei.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lefei.entity.User;

/**
 * 用户业务接口
 **/
public interface UserInfoService extends IService<User> {

    /**
    * 获取后台登录用户信息
    * @return 后台用户信息
    * */
//    Userback
    /**
     * 下线用户
     *
     * @param userInfoId 用户信息id
     */

    void removeOnlineUser(Integer userInfoId);
}
