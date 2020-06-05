package com.hejjon.service;

import com.hejjon.bean.ResponseResult;

public interface IPlaceService {


    /**
     * 查询所有省份
     * @return
     */
    ResponseResult queryAllProvince();


    /**
     * 根据省份ID查询市
     * @param pid
     * @return
     */
    ResponseResult queryCityByPid(String pid);

    /**
     * 根据地级市ID查询区县
     * @param cid
     * @return
     */
    ResponseResult queryCountyByCid(String cid);



}
