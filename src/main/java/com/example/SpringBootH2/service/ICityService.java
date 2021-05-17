package com.example.SpringBootH2.service;

import com.example.SpringBootH2.bean.City;
import java.util.List;

/**
 * ICityService provides contract methods to get all cities and get a city by its id from the data source.
 */
public interface ICityService {

    public List<City> findAll();
    public City findById(Long id);
}