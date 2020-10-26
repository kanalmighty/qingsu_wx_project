package com.qs.service;

import com.qs.bean.Banner;
import com.qs.bean.Recommend;
import com.qs.bean.Room;

import java.util.List;

public interface IndexService {

    public List<Room> getRecommendRooms();

    public List<Banner> getIndexBanner();

}
