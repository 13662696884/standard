package com.ms.user.controller;

import com.ms.user.constant.CommonConstant;
import com.ms.user.model.dto.LoginUser;
import com.ms.user.model.dto.UserDto;
import com.ms.user.model.vo.UserVo;
import com.ms.user.service.UserManageService;
import com.ms.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22 0022
 */
@Controller
@RequestMapping(CommonConstant.USER_PATH)
public class UserController {

    @Autowired
    private UserManageService userManageService;

    @RequestMapping(CommonConstant.REGISTER_PATH)
    public UserVo register(UserDto userDto) {
        return null;
    }

    @RequestMapping(CommonConstant.LOGIN_PATH)
    public UserVo login(LoginUser userLogin) {
        return userManageService.login(userLogin);
    }

}
