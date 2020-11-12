package com.qs.controller;

import com.qs.bean.Banner;
import com.qs.bean.Room;
import com.qs.bean.WXResponseEntity;
import com.qs.service.IndexService;
import com.qs.service.RoomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(description = "房屋信息")
@RequestMapping("/room")
@ResponseBody
public class RoomController {

    @Resource
    private RoomService roomService;

    @RequestMapping(value = "/avalrooms",method = RequestMethod.POST)
    @ApiOperation("获取空房间列表")
    public WXResponseEntity getRecommend(){
        List<Room> roomList = roomService.selectAvalRoomList();
        return new WXResponseEntity<>(roomList, 200,"success");
    }

    @RequestMapping(value = "/roominfo",method = RequestMethod.POST)
    @ApiOperation("某间房间信息")
    public WXResponseEntity getRoomInfo(@RequestParam int id){
        Room room = roomService.selectRoomByRoomId(id);
        if (room==null){
            return new WXResponseEntity<Room>(null, -1, "房间不存在");
        }
        return new WXResponseEntity<Room>(room, 200, "success");
    }

}
