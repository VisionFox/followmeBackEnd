package com.followme.service;

import com.followme.common.ServerResponse;
import com.followme.pojo.Attraction;

import java.util.List;

public interface IAttractionService {
    public ServerResponse<List<Attraction>> getAttractionsInfoByArea(String area);

    public ServerResponse<Attraction> getAttractionsInfoByAattractionId(Long attractionId);
}
