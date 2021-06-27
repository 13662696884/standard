package com.ms.user.repository;

import com.ms.user.model.User;
import com.ms.user.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22 0022
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, BigInteger> {
    UserInfo findByUserId(BigInteger id);
}
