package com.origin.noah.controller;

import com.origin.noah.model.domain.UserDO;
import com.origin.noah.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dengqingling on 2018/5/21
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public ModelAndView getUser(HttpServletRequest request, @RequestParam("id")Long id) {
        UserDO userDO = userService.getById(id);
        request.setAttribute("user", userDO);
        return null;
    }

    @RequestMapping(value = "/getUserBean")
    @ResponseBody
    public String getUserBean(HttpServletRequest request) {
        UserDO userDO = new UserDO();
        userDO.setDisplayName("张三");
        return "张三1";
    }
}
