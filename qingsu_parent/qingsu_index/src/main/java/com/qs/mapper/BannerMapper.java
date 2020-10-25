package com.qs.mapper;

import com.qs.bean.Banner;

import java.util.List;

public interface BannerMapper {
    int insert(Banner record);

    int insertSelective(Banner record);

    List<Banner> SelectBanner();
}