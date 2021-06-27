package com.ms.user.model;

import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22 0022
 */
@Data
public class UserInfo {

    private BigInteger id;
    private BigInteger userId;
    private String idCard;
    private Boolean identifiedFlag;
    private LocalDateTime identifiedDate;
    private String mobileNo;
    private String address;
    private String email;
    private int age;

}
