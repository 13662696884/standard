package com.ms.user.service.impl;

import com.ms.user.constant.CommonConstant;
import com.ms.user.model.User;
import com.ms.user.model.UserInfo;
import com.ms.user.model.dto.LoginUser;
import com.ms.user.model.dto.UserDto;
import com.ms.user.model.vo.UserVo;
import com.ms.user.service.UserInfoService;
import com.ms.user.service.UserManageService;
import com.ms.user.service.UserService;
import com.ms.user.util.MessageUtil;
import com.ms.user.util.StringUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/23 0023
 */
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    private UserService userService;
    @Autowired
    private UserInfoService userInfoService;

    @Override
    public UserVo register(UserDto userDto) {


        User user = User.builder().
                username(userDto.getUsername())
                .password(userDto.getPassword())
                .payPassword(CommonConstant.DEFAULT_PAY_PASSWORD)
                .mobileNo(userDto.getMobile())
                .status(CommonConstant.NORMAL_STATUS)
                .createDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        user = userService.addUser(user);

        UserVo userVo = UserVo.builder()
                .userId(user.getId())
                .username(userDto.getUsername())
                .build();
        return userVo;
    }

    @Override
    public UserVo login(LoginUser loginUser) {
        if(!userService.checkUserWithUsernameAndPassword(loginUser.getUsername(), loginUser.getPassword())){
            return null;
        }
        User user = userService.findUserByUsername(loginUser.getUsername());
        UserInfo userInfo = userInfoService.findUserInfoByUserId(user.getId());
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);
        BeanUtils.copyProperties(userInfo, userVo);
        return userVo;
    }
}
