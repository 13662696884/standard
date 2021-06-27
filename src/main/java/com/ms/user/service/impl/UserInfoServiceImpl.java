package com.ms.user.service.impl;

import com.ms.user.model.UserInfo;
import com.ms.user.repository.UserInfoRepository;
import com.ms.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/23 0023
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo addUserInfo(UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }

    @Override
    public UserInfo findUserInfoByUserId(BigInteger userId) {
        return userInfoRepository.findByUserId(userId);
    }
}
