package com.ms.user.service.impl;

import com.ms.user.model.User;
import com.ms.user.model.UserInfo;
import com.ms.user.model.dto.LoginUser;
import com.ms.user.model.vo.UserVo;
import com.ms.user.repository.UserInfoRepository;
import com.ms.user.repository.UserRepository;
import com.ms.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22 0022
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Boolean checkUser(String username) {
        if(this.findUserByUsername(username) != null) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public Boolean checkUserWithUsernameAndPassword(String username, String password) {
        if(findUserByUsernameAndPassword(username, password) != null) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
