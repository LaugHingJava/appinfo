package com.bdqn.controller.dev;

import com.bdqn.pojo.DevUser;
import com.bdqn.service.AppInfoService;
import com.bdqn.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/devAppInfo")
public class AppinfoController {
    @Resource
    private AppInfoService appInfoService;
    @RequestMapping(value = "/appinfoList")
    public String appInfoList(Model model, HttpSession session){
        DevUser user = (DevUser) session.getAttribute("devUserSession");
        if(user==null){
            model.addAttribute("message","你没有登录");
            return "developer/devLogin";
        }
        PageUtil pageUtil = appInfoService.findAppInfoList(null,null,null,null,null,null,1,1,5);
        model.addAttribute("pageUtil",pageUtil);
        return "developer/appinfoList";
    }
}
