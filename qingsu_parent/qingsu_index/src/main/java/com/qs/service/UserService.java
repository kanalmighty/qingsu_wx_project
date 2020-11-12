package com.qs.service;

import com.qs.bean.User;
import org.apache.http.HttpException;

import java.io.IOException;

public interface UserService {
    User selectUserByOpenId(String openId);
    User selectByPrimaryKey(int userId);
    int  addUser(User user);
    User getWXAuthInfo(String code) throws HttpException, IOException;
}
