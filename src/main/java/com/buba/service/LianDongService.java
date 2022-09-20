package com.buba.service;

import com.buba.pojo.City;
import com.buba.pojo.Province;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/9/20 14:33
 */
public interface LianDongService {

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
