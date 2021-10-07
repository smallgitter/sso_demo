package com.sso.serverdemo.dao;

import com.sso.serverdemo.entity.SysUser;

public interface SysUserDao {
    public SysUser getUser();

    public SysUser login(String userName, String userPassword);
}
