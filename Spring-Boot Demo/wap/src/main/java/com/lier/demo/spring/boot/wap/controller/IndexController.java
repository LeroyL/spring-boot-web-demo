package com.lier.demo.spring.boot.wap.controller;

import com.lier.demo.spring.boot.core.entity.City;
import com.lier.demo.spring.boot.core.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lier on 2017/7/7.
 */
@Controller
public class IndexController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/")
    public ModelAndView index(){
        City city = cityService.findByID(1l);
        return new ModelAndView("index").addObject("city", city);
    }
}
