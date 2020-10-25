package com.qs.service;

import com.qs.bean.Banner;
import com.qs.bean.Recommend;

import java.util.List;

public interface IndexService {

    public List<Recommend> getIndexRecommends();

    public List<Banner> getIndexBanner();
}
