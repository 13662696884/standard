package com.ms.user.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22 0022
 */
@Data
@Builder
public class User {
    private BigInteger id;
    private String username;
    private String password;
    private String payPassword;
    private String mobileNo;
    private String address;
    private String email;
    private int age;
    private byte status;
    private Boolean loginFlag;
    private LocalDateTime lastLoginDate;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
