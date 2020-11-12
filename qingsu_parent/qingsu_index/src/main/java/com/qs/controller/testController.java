//package com.qs.controller;
//
//import io.jsonwebtoken.Jwts;
//import io.swagger.annotations.Api;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import java.nio.charset.StandardCharsets;
//
//@RestController
//@Api(description = "房屋信息")
//@RequestMapping("/test")
//@ResponseBody
//public class testController {
//    @Value("${jwt.secret}")
//    private String secret;
//
//    @RequestMapping("/parsertoken")
//    public Object getCurrentUser(Authentication authentication, HttpServletRequest request) {
//        String header = request.getHeader("Authorization");
//        String token = header.substring(header.lastIndexOf("bearer")+7);
//        return Jwts.parser()
//                .setSigningKey(secret.getBytes(StandardCharsets.UTF_8))
//                .parseClaimsJws(token)
//                .getBody();
//    }
//
//
//}
