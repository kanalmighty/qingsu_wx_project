package com.qs.mapper;

import com.qs.bean.Picture;

public interface PictureMapper {
    int insert(Picture record);

    int insertSelective(Picture record);
}