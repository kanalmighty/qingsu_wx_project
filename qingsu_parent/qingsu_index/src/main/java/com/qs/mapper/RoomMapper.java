package com.qs.mapper;

import com.qs.bean.Room;

import java.util.List;

public interface RoomMapper {
    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectRecommendRoomList();

    Room selectRoomByRoomId(int roomId);
}