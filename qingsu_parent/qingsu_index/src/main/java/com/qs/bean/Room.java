package com.qs.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Room implements Serializable {
    private Integer roomId;

    private String roomPictureUrl;

    private BigDecimal price;

    private String title;

    private Integer isRecommended;

    private String location;

    private Integer isAvaliable;
    private Double roomArea;
    private Integer bathRoomCount;
    private Integer balconyCount;
    private String bedType;
    private Integer bedCount;
    private String surroundingIntroduction;
    private String introduction;
    private List<RoomPicture> imageList;
    private float latitude;

    public List<String> getBookedDateList() {
        return bookedDateList;
    }

    public void setBookedDateList(List<String> bookedDateList) {
        this.bookedDateList = bookedDateList;
    }

    private List<String> bookedDateList;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    private float longitude;
    private String roomName;
    private String roomAddress;

    public List<RoomPicture> getImageList() {
        return imageList;
    }

    public void setImageList(List<RoomPicture> imageList) {
        this.imageList = imageList;
    }

    public Integer getBedCount() {
        return bedCount;
    }

    public void setBedCount(Integer bedCount) {
        this.bedCount = bedCount;
    }

    public Double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(Double roomArea) {
        this.roomArea = roomArea;
    }

    public Integer getBathRoomCount() {
        return bathRoomCount;
    }

    public void setBathRoomCount(Integer bathRoomCount) {
        this.bathRoomCount = bathRoomCount;
    }

    public Integer getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(Integer balconyCount) {
        this.balconyCount = balconyCount;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getSurroundingIntroduction() {
        return surroundingIntroduction;
    }

    public void setSurroundingIntroduction(String surroundingIntroduction) {
        this.surroundingIntroduction = surroundingIntroduction;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

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