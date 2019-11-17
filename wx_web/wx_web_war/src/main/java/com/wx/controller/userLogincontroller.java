package com.wx.controller;

import com.wx.mappers.Users;
import com.wx.service.service_list;
import com.wx.service.service_list_impl;
import com.wx.service.service_user;
import com.wx.service.service_user_impl;
import jdk.nashorn.internal.parser.JSONParser;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.security.auth.login.FailedLoginException;
import java.io.IOException;

@Controller
@RequestMapping(value="/user", method = RequestMethod.POST)
@SessionAttributes("user")
public class userLogincontroller {
    private static Logger log = LoggerFactory.getLogger(userLogincontroller.class);
    String SUCCESS = "success";String FAIL = "fail";
    @Autowired
    service_user USER_SERVICE;
    //private service_list service;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String do_OpenIDlogin(@RequestParam("userId") String id) {
        try{
            int openid = Integer.parseInt(id);
            Users result = USER_SERVICE.getUserById(openid);
            return SUCCESS;
        }catch (Exception e) {
            return FAIL;
        }

    }
}
