package com.ms.user.model.dto;

import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
 * @author Administrator
 * @Description:
 * @date 2021/6/22 0022
 */
@Data
public class UserDto {
    @Length(min = 1, max = 10)
    private String username;
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,20}")
    private String password;
    @Pattern(regexp = "((13|15|17|18)\\d{9})|(14[57]\\d{8})")
    private String mobile;
    @Pattern(regexp = "\\d{6}")
    private String validateCode;
}
