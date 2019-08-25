package com.stone.learn.spring5.mvc.web.controller;

import com.stone.learn.spring5.mvc.entity.Foo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qun.zheng
 * @description: TODO
 * @date 2019-08-2510:30
 */
@Controller
@RequestMapping("/foo")
public class FooController {

    @GetMapping("/{id}")
    @ResponseBody
    public Foo getFoo(@PathVariable("id") String id) {
        return new Foo(id,"myFoo");
    }

}
