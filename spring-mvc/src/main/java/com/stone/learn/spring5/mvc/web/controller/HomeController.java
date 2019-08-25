package com.stone.learn.spring5.mvc.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qun.zheng
 * @description: TODO
 * @date 2019-08-2522:10
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
