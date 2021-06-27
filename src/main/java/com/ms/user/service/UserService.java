package com.ms.user.service;

import com.ms.user.model.User;
import com.ms.user.model.dto.LoginUser;
import com.ms.user.model.vo.UserVo;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22
 */
public interface UserService {

    /**
     * add user
     * @param user
     * @return User
     */
    User addUser(User user);

    /**
     * find user by username
     * @param username
     * @return User
     */
    User findUserByUsername(String username);

    /**
     * check user whether exist
     * @param username
     * @return Boolean
     */
    Boolean checkUser(String username);

    /**
     * find user by username and password
     * @param username
     * @return User
     */
    User findUserByUsernameAndPassword(String username, String password);

    /**
     * check user with username and password
     * @param username
     * @param password
     * @return Boolean
     */
    Boolean checkUserWithUsernameAndPassword(String username, String password);
}
