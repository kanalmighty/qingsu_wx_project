package com.qs.mapper;

import com.qs.bean.RoomPicture;

import java.util.List;

public interface RoomPictureMapper {
    int deleteByPrimaryKey(Integer pictureId);

    int insert(RoomPicture record);

    int insertSelective(RoomPicture record);

    RoomPicture selectByPrimaryKey(Integer pictureId);

    int updateByPrimaryKeySelective(RoomPicture record);

    int updateByPrimaryKey(RoomPicture record);

    List<RoomPicture> selelctRoomPictureByRoomId(int roomId);
}