package com.qs.controller;

import com.qs.bean.Banner;
import com.qs.bean.Recommend;
import com.qs.bean.Room;
import com.qs.bean.WXResponseEntity;
import com.qs.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j

@RestController
@Api(description = "首页管理")
@RequestMapping("/index")
@ResponseBody
public class IndexController {

    @Resource
    private IndexService indexService;

    @RequestMapping(value = "/recommend",method = RequestMethod.POST)
    @ApiOperation("获取首页推荐列表")
    public WXResponseEntity getRecommend(){
        List<Room> roomList = indexService.getRecommendRooms();
        return new WXResponseEntity<List<Room>>(roomList, 200,"success");
    }

    @RequestMapping(value = "/banner",method = RequestMethod.POST)
    @ApiOperation("获取banner")
        public WXResponseEntity getBanner(){
        List<Banner> bannerEntityList = indexService.getIndexBanner();
        ArrayList<String> bannerList = new ArrayList<>();
        for (Banner banner : bannerEntityList) {
            bannerList.add(banner.getBannerUrl());
        }
        return new WXResponseEntity<List<String>>(bannerList, 200, "success");
    }

}
