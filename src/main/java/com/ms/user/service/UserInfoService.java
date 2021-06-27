package com.ms.user.service;

import com.ms.user.model.UserInfo;

import java.math.BigInteger;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/23 0023
 */
public interface UserInfoService {

    /**
     * add user info
     * @param userInfo
     * @return UserInfo
     */
    UserInfo addUserInfo(UserInfo userInfo);

    /**
     * get user info by user id
     * @param userId
     * @return UserInfo
     */
    UserInfo findUserInfoByUserId(BigInteger userId);
}
