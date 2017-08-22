package com.lier.demo.spring.boot.core.service.impl;

import com.lier.demo.spring.boot.core.entity.City;
import com.lier.demo.spring.boot.core.repository.CityRepository;
import com.lier.demo.spring.boot.core.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lier on 2017/7/7.
 */
@Service("cityService")
public class CityServiceImpl implements CityService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City findByID(Long id) {
        return cityRepository.findOne(id);
    }

    public City getCity(long id){
        return jdbcTemplate.queryForObject("SELECT * FROM city WHERE id=?",new Object[]{id}, new BeanPropertyRowMapper<City>(City.class));
    }

    @Override
    public List<City> findCitiesByStateAndCountry(String state, String country) {
        return cityRepository.findByStateAndCountry(state, country);
    }

    @Override
    public City save(City city) {
        return cityRepository.saveAndFlush(city);
    }
}
