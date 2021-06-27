package com.ms.user.model.dto;

import lombok.Data;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22 0022
 */
@Data
public class LoginUser {
    private String username;
    private String password;
    private String validateCode;
}
