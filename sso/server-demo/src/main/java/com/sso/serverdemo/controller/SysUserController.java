package com.sso.serverdemo.controller;

import com.sso.serverdemo.entity.SysUser;
import com.sso.serverdemo.service.ISysUserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@EnableAutoConfiguration
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private ISysUserService sysUserService;

    @RequestMapping("/getUser")
    @ResponseBody
    public SysUser getUser() {
        SysUser user = sysUserService.getUser();
        //user.setUserName("admin");
        return user;
    }

    /***
     * 返回登录页面
     * @return
     */
    @RequestMapping("/getLogin")
    public String getLogin() {
        return "login";
    }

    /***
     * 登录
     * @param user
     * @param mv
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView login(SysUser user, ModelAndView mv, HttpServletRequest request){
        SysUser login = sysUserService.login(user.getUserName(), user.getUserPassword());
        System.out.println(login);
        if (login != null){
            request.getSession().setAttribute("login", login);
            System.out.println("成功！！");
            mv.setViewName("index");
        }else{
            System.out.println("失败！！");
            mv.setViewName("login");
        }
        return mv;
    }
}
