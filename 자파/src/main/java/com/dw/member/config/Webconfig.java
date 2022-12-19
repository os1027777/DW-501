package com.dw.member.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//webconfig : 웹설정
//config : 설정

@Configuration
public class Webconfig implements WebMvcConfigurer {

    @Autowired
    Interceptor interceptor; // 우리가 만든 인터샙터 불러옴
    // addInterceptors : 인터 셉터를 추가하는 함수 재정의

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] patterns = { "/login", "/error", "/resources/static/*", "/api/v1/login" };
        registry.addInterceptor(interceptor).excludePathPatterns(patterns);

    }

}
