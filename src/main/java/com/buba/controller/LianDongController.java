package com.buba.controller;

import com.alibaba.fastjson.JSON;
import com.buba.pojo.City;
import com.buba.pojo.Province;
import com.buba.service.LianDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/9/20 14:32
 */
@Controller
@RequestMapping("/liandong")
public class LianDongController {

    @Autowired
    @Qualifier("lianDongService")
    LianDongService lianDongService;

    @RequestMapping("/listProvince")
    public String listProvince(Model model) {
        List<Province> provinceList = lianDongService.listProvince();

        model.addAttribute("provinceList", provinceList);

        return "liandong";
    }

    @RequestMapping(value = "/listCity",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String listCity(String provinceId) {
        List<City> cityList = lianDongService.listCity(provinceId);
        return JSON.toJSONString(cityList);
    }
}
