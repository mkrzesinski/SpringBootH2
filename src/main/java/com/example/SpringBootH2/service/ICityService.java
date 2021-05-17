package com.example.SpringBootH2.service;

import com.example.SpringBootH2.bean.City;
import java.util.List;

public interface ICityService {

    public List<City> findAll();
    public City findById(Long id);
}