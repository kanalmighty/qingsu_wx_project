package com.qs.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Room implements Serializable {
    private Integer roomId;

    private String roomPictureUrl;

    private BigDecimal price;

    private String title;

    private Integer isRecommended;

    private String location;

    private Integer isAvaliable;

    private static final long serialVersionUID = 1L;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomPictureUrl() {
        return roomPictureUrl;
    }

    public void setRoomPictureUrl(String roomPictureUrl) {
        this.roomPictureUrl = roomPictureUrl == null ? null : roomPictureUrl.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(Integer isRecommended) {
        this.isRecommended = isRecommended;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getIsAvaliable() {
        return isAvaliable;
    }

    public void setIsAvaliable(Integer isAvaliable) {
        this.isAvaliable = isAvaliable;
    }
}