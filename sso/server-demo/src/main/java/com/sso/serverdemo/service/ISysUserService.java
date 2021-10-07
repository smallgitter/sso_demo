package com.sso.serverdemo.service;

import com.sso.serverdemo.entity.SysUser;

public interface ISysUserService {

    public SysUser getUser();

    public SysUser login(String userName, String userPassword);
}
