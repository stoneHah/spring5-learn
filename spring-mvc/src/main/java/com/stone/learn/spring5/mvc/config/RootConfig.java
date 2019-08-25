package com.stone.learn.spring5.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author qun.zheng
 * @description: TODO
 * @date 2019-08-2521:32
 */
@Configuration
@ComponentScan(basePackages = "com.stone.learn.spring5.mvc",
    excludeFilters = {
        @Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
    })
public class RootConfig {
}
