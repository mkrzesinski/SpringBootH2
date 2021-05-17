package com.example.SpringBootH2.service;

import com.example.SpringBootH2.bean.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CityService contains the implementation of the findAll() and findById() methods. We use Spring JdbcTemplate to execute SQL code.
 */

@SuppressWarnings("ALL")
@Service
public class CityService implements ICityService {

    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List findAll() {
        String sql = "SELECT * FROM CITIES";
        return jtm.query(sql, new BeanPropertyRowMapper(City.class));
    }

    @Override
    public City findById(Long id) {
        String sql = "SELECT * FROM CITIES WHERE ID=?";
        return (City) jtm.queryForObject(sql, new BeanPropertyRowMapper(City.class), id);
    }
}
