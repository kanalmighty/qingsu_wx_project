package com.qs.mapper;

import com.qs.bean.RoomBookInfo;

import java.util.List;

public interface RoomBookInfoMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(RoomBookInfo record);

    int insertSelective(RoomBookInfo record);

    RoomBookInfo selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(RoomBookInfo record);

    int updateByPrimaryKey(RoomBookInfo record);

    List<RoomBookInfo> selectByRoomId(int roomId);
}