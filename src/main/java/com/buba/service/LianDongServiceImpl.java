package com.buba.service;

import com.buba.dao.LianDongDao;
import com.buba.pojo.City;
import com.buba.pojo.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/9/20 14:36
 */
@Service("lianDongService")
public class LianDongServiceImpl implements LianDongService{

    @Autowired
    LianDongDao lianDongDao;

    /**
     * 查询省自治区列表
     * @return
     */
    @Override
    public List<Province> listProvince() {
        return lianDongDao.listProvince();
    }

    /**
     * 根据省编码查询市列表
     * @param provinceId
     * @return
     */
    @Override
    public List<City> listCity(String provinceId) {
        return lianDongDao.listCity(provinceId);
    }
}
