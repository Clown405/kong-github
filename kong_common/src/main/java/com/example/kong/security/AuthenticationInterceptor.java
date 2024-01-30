//package com.example.kong.security;
//
//import com.alibaba.fastjson.JSONObject;
//import com.auth0.jwt.JWT;
//import com.auth0.jwt.JWTVerifier;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.auth0.jwt.exceptions.JWTDecodeException;
//import com.auth0.jwt.exceptions.JWTVerificationException;
//import com.example.kong.utils.SignatureUtil;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.lang.reflect.Method;
//import java.util.Base64;
//import java.util.Enumeration;
//
//import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;
//
//
///**
// * @description：拦截器
// */
//public class AuthenticationInterceptor implements HandlerInterceptor {
//
//    private String tokenHeader = "Authorization";
//
//    private String api_key = "cd2341dserdke";
//
//    private String secret = "dkckd02jlwjdkqk2k1jdlwdkej";
//
//
//    @Override
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
//        String token = httpServletRequest.getHeader(tokenHeader);// 从 http 请求头中取出 token
//        // 提取 keyId、algorithm 和 signature 的值
//        String keyId = token.split("keyId=\"")[1].split("\"")[0];
//        String signature = token.split("signature=\"")[1].split("\"")[0];;
//        String date = httpServletRequest.getHeader("date");
//        if(!secret.equals(signature)){
//            throw new Exception();
//        }
//
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//
//    }
//    @Override
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//
//    }
//}
//
//
//
