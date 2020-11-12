package com.qs.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;

    private String openId;

    private Integer mobile;

    private Date lastTime;

    public String getSessionKey() {
        return SessionKey;
    }

    public void setSessionKey(String sessionKey) {
        SessionKey = sessionKey;
    }

    private String SessionKey;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}