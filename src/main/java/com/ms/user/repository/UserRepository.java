package com.ms.user.repository;

import com.ms.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22 0022
 */
@Repository
public interface UserRepository extends JpaRepository<User, BigInteger> {
    User findByUsername(String username);
    User findByUsernameAndPassword(String username, String password);
}
