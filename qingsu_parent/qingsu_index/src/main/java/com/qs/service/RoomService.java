package com.qs.service;

import com.qs.bean.Room;

import java.util.List;

public interface RoomService {

    List<Room> selectAvalRoomList();
    Room selectRoomByRoomId(int roomId);
}
