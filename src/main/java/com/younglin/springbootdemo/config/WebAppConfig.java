package com.younglin.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Override  //註冊虛擬路徑 /images/** 代表images底下檔案及多層資料夾內都可以讀取到
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**", "/manager/img/**").addResourceLocations("file:/C:/ProjectImages/");  //讀取本機圖片
    }

}
