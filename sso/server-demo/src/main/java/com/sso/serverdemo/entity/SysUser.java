package com.sso.serverdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {
    private Integer id;

    private String userCode;

    private String userName;

    private String userPassword;

    private String realName;
}
