package com.lier.demo.spring.boot.core.repository;

import com.lier.demo.spring.boot.core.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lier on 2017/7/7.
 */
public interface CityRepository extends JpaRepository<City, Long> {

    List<City> findByStateAndCountry(String state, String country);

}
