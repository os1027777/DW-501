package com.dw.member.config;

import java.net.http.HttpResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class Interceptor implements HandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger(Interceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String requestUr1 = request.getRequestURI(); // 사용자 접속 URL요청
        String httpMethod = request.getMethod(); // 사용자 접속
        String userIp = request.getRemoteAddr(); // 사용자 접속 IP

        logger.info("요청 URL>" + requestUr1);
        logger.info("요청 HTTP 메소드>" + httpMethod);
        logger.info("사용자 접속 IP>" + userIp);

        HttpSession session = request.getSession();// 세견 호출
        String userId = (String) session.getAttribute("userId"); // 세션에 저장된 값 불러오기

        if (userId == null) { // 세견에 저장된 값이 없어서 null이라면!
            // Redirect : URL 재요청
            response.sendRedirect("/login"); // 세견에 값이 없거나 세션이 만료되면 /login 경로로 강제 이동!
            return false;
        }
        return true;
    }
}