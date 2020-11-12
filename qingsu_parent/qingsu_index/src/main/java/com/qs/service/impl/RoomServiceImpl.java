package com.qs.service.impl;

import com.qs.bean.Room;
import com.qs.bean.RoomBookInfo;
import com.qs.bean.RoomPicture;
import com.qs.mapper.RoomBookInfoMapper;
import com.qs.mapper.RoomMapper;
import com.qs.mapper.RoomPictureMapper;
import com.qs.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Resource
    private RoomMapper roomMapper;

    @Resource
    private RoomBookInfoMapper roomBookInfoMapper;

    @Resource
    private RoomPictureMapper roomPictureMapper;
    @Override
    public List<Room> selectAvalRoomList() {
        return roomMapper.selectRecommendRoomList();
    }

    @Override
    public Room selectRoomByRoomId(int roomId) {
        Room room = roomMapper.selectRoomByRoomId(roomId);
        List<RoomPicture> roomPictures = roomPictureMapper.selelctRoomPictureByRoomId(roomId);
      /*  ArrayList<String> imageList = new ArrayList<>();
        for (RoomPicture roomPicture : roomPictures) {
            imageList.add(roomPicture.getPictureUrl());
        }*/
        List<RoomBookInfo> roomBookInfos = roomBookInfoMapper.selectByRoomId(roomId);
        ArrayList<String> bookedDateString = new ArrayList<>();
        room.setImageList(roomPictures);
        for (RoomBookInfo roomBookInfo : roomBookInfos) {
            bookedDateString.add(roomBookInfo.getBookDate());
        }
        room.setBookedDateList(bookedDateString);
        return room;

    }
}
