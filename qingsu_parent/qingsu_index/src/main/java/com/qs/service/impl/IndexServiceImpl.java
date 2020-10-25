package com.qs.service.impl;

import com.qs.bean.Banner;
import com.qs.bean.Recommend;
import com.qs.mapper.BannerMapper;
import com.qs.mapper.RecommendMapper;
import com.qs.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {


    @Resource
    private RecommendMapper recommendMapper;

    @Resource
    private BannerMapper bannerMapper;
    @Override
    public List<Recommend> getIndexRecommends() {
        return recommendMapper.selectByEnableFlag();
    }

    @Override
    public List<Banner> getIndexBanner() {
        return bannerMapper.SelectBanner();
    }
}
