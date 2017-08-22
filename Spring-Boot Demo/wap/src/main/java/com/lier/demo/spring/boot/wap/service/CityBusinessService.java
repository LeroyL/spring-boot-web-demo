package com.lier.demo.spring.boot.wap.service;

import com.lier.demo.spring.boot.core.entity.City;
import com.lier.demo.spring.boot.core.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lier on 2017/7/7.
 */
@Service
public class CityBusinessService {

    @Autowired
    private CityService cityService;

    //演示事务配置
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = true, rollbackFor = {Exception.class})
    public City update(City city){
        //TODO
        return cityService.save(city);
    }

}
