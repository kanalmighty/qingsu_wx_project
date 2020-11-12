package com.qs.controller;

import com.qs.bean.User;
import com.qs.bean.WXResponseEntity;
import com.qs.service.UserService;
import org.apache.http.HttpException;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@ResponseBody
@RequestMapping("/login")
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/wechatauth", method = RequestMethod.POST)
    public WXResponseEntity wechatLogin(@RequestParam("code") String code){
        User userInfo = null;
        try {
            userInfo = userService.getWXAuthInfo(code);
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        if (user!=null){
//            return user;
//        } else{
////            User newUser = new User();
////            user.set
////            userService.
//
//        }
        if (userInfo==null) {
            return new WXResponseEntity(null, -1, "not user found in wechat authorization service");
        } else {
            User user = userService.selectUserByOpenId(userInfo.getOpenId());
            if(user==null){
                int userId = userService.addUser(userInfo);
                user = userService.selectByPrimaryKey(userId);
                return new WXResponseEntity<User>(user, 200, "success");
            } else {
                return new WXResponseEntity<User>(user, 200, "success");
            }
        }
    }
}
