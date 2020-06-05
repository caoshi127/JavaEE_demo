package com.hejjon.service.impl;

import com.hejjon.bean.ResponseResult;
import com.hejjon.entity.XCity;
import com.hejjon.entity.XCounty;
import com.hejjon.entity.XProvince;
import com.hejjon.repository.IXCityDao;
import com.hejjon.repository.IXCountyDao;
import com.hejjon.repository.IXProvinceDao;
import com.hejjon.service.IPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService implements IPlaceService {

    @Autowired
    private IXProvinceDao ixProvinceDao;

    @Autowired
    private IXCityDao ixCityDao;

    @Autowired
    private IXCountyDao ixCountyDao;


    @Override
    public ResponseResult queryAllProvince() {
        List<XProvince> provinceList = ixProvinceDao.findAll();
        return new ResponseResult(0, "查询成功", "success", provinceList);
    }

    @Override
    public ResponseResult queryCityByPid(String pid) {
        List<XCity> cityList = ixCityDao.searchByPid(pid);
        return new ResponseResult(0, "查询成功", "success", cityList);
    }

    @Override
    public ResponseResult queryCountyByCid(String cid) {
        List<XCounty> countyList = ixCountyDao.findBycId(cid);
        return new ResponseResult(0, "查询成功", "success", countyList);
    }
}
