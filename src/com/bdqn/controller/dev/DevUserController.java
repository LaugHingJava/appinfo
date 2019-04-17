package com.bdqn.controller.dev;

import com.bdqn.pojo.DevUser;
import com.bdqn.service.DevUserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/devUser")
public class DevUserController {
    @Resource
    private DevUserService devUserService;
    @RequestMapping(value = "/devLogin")
    public String login(){
        return "/developer/devLogin";
    }
    @RequestMapping(value = "/devDoLogin")
    public String login(@RequestParam("devCode")String devCode, @RequestParam("devPassword")String devPassword, Model model, HttpSession session){
        DevUser user=devUserService.devUserLogin(devCode,devPassword);
        if(user==null){
            model.addAttribute("message","用户密码不正确");
            return "developer/devLogin";
        }
        session.setAttribute("devUserSession",user);
        return "developer/main";
    }


    @RequestMapping(value = "/devLoginOut")
    public String loginOut(HttpSession session){
        session.removeAttribute("devUserSession");
        return "developer/devLogin";
    }




}
