package com.followme.controller.portal;

import com.followme.common.ServerResponse;
import com.followme.pojo.Attraction;
import com.followme.service.IAttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/attraction/")
public class AttractionController {
    @Autowired
    private IAttractionService iAttractionService;

    @RequestMapping(value = "get_attractions_info_by_area.do", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<List<Attraction>> getAttractionsInfoByArea(String area) {
        return iAttractionService.getAttractionsInfoByArea(area);
    }
}
