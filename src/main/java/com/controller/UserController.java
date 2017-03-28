package com.controller;

import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eric.sun on 2017/3/22.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/json")
    public String json(){
        userService.addUserWithBackId("aaaa" , "aaaaa");
        return "aaaaaa";
    }

    @RequestMapping("/get")
    public Map get(){
       User user  = userService.getUserInfo("admin");
        Map map = new HashMap();
        map.put("user",user);
        return map;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
