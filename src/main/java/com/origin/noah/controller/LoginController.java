package com.origin.noah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dengqingling on 2018/5/21
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping()
    public String login() {
        return "login";
    }

    @RequestMapping("/submit")
    public String handleSubmit(HttpServletRequest request,
                                     @RequestParam(value = "userName",required = false)String userName,
                                     @RequestParam(value = "password",required = false)String password) {
        return "list";
    }
}
