package com.ms.user.service;

import com.ms.user.model.dto.LoginUser;
import com.ms.user.model.dto.UserDto;
import com.ms.user.model.vo.UserVo;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/23 0023
 */
public interface UserManageService {

    /**
     * register
     * @param userDto
     * @return UserVo
     */
    UserVo register(UserDto userDto);

    /**
     * login with username
     * @param loginUser
     * @return UserVo
     */
    UserVo login(LoginUser loginUser);
}
