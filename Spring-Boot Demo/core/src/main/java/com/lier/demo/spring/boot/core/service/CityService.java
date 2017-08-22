package com.lier.demo.spring.boot.core.service;

import com.lier.demo.spring.boot.core.entity.City;

import java.util.List;

/**
 * Created by lier on 2017/7/7.
 */
public interface CityService {

    City findByID(Long id);

    List<City> findCitiesByStateAndCountry(String state, String country);

    City save(City city);
}
