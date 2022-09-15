package com.buba.controller;

import com.buba.pojo.Classes;
import com.buba.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/9/15 08:29
 */
@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    ClassService classService;

    @RequestMapping("/listClass")
    public String listClass(Model model) {
        List<Classes> classesList = classService.listClass();

        model.addAttribute("classesList", classesList);

        return "classlist";
    }
}
