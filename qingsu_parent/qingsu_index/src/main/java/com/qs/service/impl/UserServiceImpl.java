package com.qs.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qs.bean.User;
import com.qs.mapper.UserMapper;
import com.qs.service.UserService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sun.net.www.http.HttpClient;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Time;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Value("${wechat.authUrl}")
    private String authUrl;

    @Value(value = "${wechat.appId}")
    private String appId;

    @Value("${wechat.secret}")
    private String secret;

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUserByOpenId(String openId) {
        return userMapper.selectUserByOpenId(openId);
    }
    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public User getWXAuthInfo(String code) throws HttpException {
        System.out.println(this.authUrl);
        System.out.println(appId);
        System.out.println(secret);
        User user = new User();
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appId + "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code";
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet();
        // 设置参数
        try {
            httpGet.setURI(new URI(url));
        } catch (URISyntaxException e) {
            throw new HttpException("请求url格式错误。"+e.getMessage());
        }
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Get请求
            response = httpClient.execute(httpGet);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
//                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
//                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
                user.setLastTime(new Date());
//                user.setSessionKey(responseEntity.getContent().get);
                JSONObject jsonObject = JSON.parseObject(EntityUtils.toString(responseEntity));
                System.out.println(jsonObject.getString("session_key"));
                System.out.println(jsonObject.getString("openid"));
                user.setSessionKey(jsonObject.getString("session_key"));
                user.setOpenId(jsonObject.getString("openid"));

            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    return user;
    }

//    public static void main(String[] args) throws HttpException {
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.getWXAuthInfo("adfasdf");
//    }
}
