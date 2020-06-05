package com.hejjon.controller;


import com.hejjon.bean.ResponseResult;
import com.hejjon.service.IPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/area")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AreaListController {

    @Autowired
    private IPlaceService iPlaceService;

    @RequestMapping("/province/all")
    public ResponseResult getAllProvince() {
        return iPlaceService.queryAllProvince();
    }

    @RequestMapping("/city/{pid}")
    public ResponseResult getCitiesByPid(@PathVariable String pid) {
        return iPlaceService.queryCityByPid(pid);
    }


    @RequestMapping("/county/{cid}")
    public ResponseResult getCountiesByCid(@PathVariable String cid) {
        return iPlaceService.queryCountyByCid(cid);
    }


}
