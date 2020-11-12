package com.qs.bean;

import java.io.Serializable;

public class RoomBookInfo implements Serializable {
    private Integer bookId;

    private Integer roomId;

    private String bookDate;

    private static final long serialVersionUID = 1L;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate == null ? null : bookDate.trim();
    }
}