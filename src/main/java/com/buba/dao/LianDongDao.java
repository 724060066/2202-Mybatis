package com.buba.dao;

import com.buba.pojo.City;
import com.buba.pojo.Province;

import java.util.List;

public interface LianDongDao {

    /**
     * 查询省自治区列表
     * @return
     */
    List<Province> listProvince();

    /**
     * 根据省编码查询市列表
     * @param provinceId
     * @return
     */
    List<City> listCity(String provinceId);
}
