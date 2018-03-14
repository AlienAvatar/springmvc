package com.springmvc.controller;

import com.springmvc.service.IAvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private IAvatarService iAvatarService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Hello Avatar";
    }

    @RequestMapping(value = "/avatar",method = RequestMethod.GET)
    @ResponseBody
    public String selectAvatar(){
        return iAvatarService.listAvatar().toString();
    }
}
