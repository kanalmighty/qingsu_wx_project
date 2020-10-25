package com.qs.bean;

import java.io.Serializable;

public class Banner implements Serializable {
    private Integer bannerId;

    private String bannerUrl;

    private static final long serialVersionUID = 1L;

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }
}