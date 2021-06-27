package com.ms.user.model.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22 0022
 */
@Data
@Builder
@NoArgsConstructor
public class UserVo {
    private BigInteger userId;
    private String username;
    private int status;
    private Boolean loginFlag;
    private LocalDateTime lastLoginDate;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

}
