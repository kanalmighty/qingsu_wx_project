//package com.qs.service.impl;
//
//import com.qs.bean.User;
//import com.qs.bean.WXResponseEntity;
//import com.qs.mapper.UserMapper;
//import com.qs.service.UserService;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.Date;
//
//@Service(value = "UserWXDetailService")
//public class UserDetailServiceImpl implements UserDetailsService {
//
//    @Resource
//    private UserService userService;
//
//    @Resource
//    private PasswordEncoder passwordEncoder;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        User user = userService.selectUserByOpenId(openId);
//        String passWorderEncoded = passwordEncoder.encode("123");
//        org.springframework.security.core.userdetails.User authUser = new org.springframework.security.core.userdetails.User("admin", passWorderEncoded, AuthorityUtils.commaSeparatedStringToAuthorityList("normal"));
////        if (user == null) {
////            user.setLastTime(new Date());
////            user.setOpenId(openId);
////            int userId = userService.addUser(user);
////            User userAdd = userService.selectByPrimaryKey(userId);
////            return new org.springframework.security.core.userdetails.User(userAdd.getOpenId(), userAdd.getOpenId(), AuthorityUtils.commaSeparatedStringToAuthorityList("normal"));
////        }
//        return authUser;
//    }
//}
