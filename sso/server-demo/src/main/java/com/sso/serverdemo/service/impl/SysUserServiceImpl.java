package com.sso.serverdemo.service.impl;

import com.sso.serverdemo.dao.SysUserDao;
import com.sso.serverdemo.entity.SysUser;
import com.sso.serverdemo.service.ISysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sysUserService")
public class SysUserServiceImpl implements ISysUserService {
    @Resource
    private SysUserDao dao;

    @Override
    public SysUser getUser() {
        return dao.getUser();
    }

    @Override
    public SysUser login(String userName, String userPassword) {
        return dao.login(userName, userPassword);
    }
}
