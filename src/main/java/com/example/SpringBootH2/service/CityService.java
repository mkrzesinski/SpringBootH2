package com.example.SpringBootH2.service;

import com.example.SpringBootH2.bean.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List<City> findAll() {

        String sql = "SELECT * FROM CITIES";

        return jtm.query(sql, new BeanPropertyRowMapper(City.class));
    }

    @Override
    public City findById(Long id) {

        String sql = "SELECT * FROM CITIES WHERE ID=?";
        //jdbcTemplate.queryForObject("select * from student_id = ?", studentRowMapper, studentId);
        return (City) jtm.queryForObject(sql, new BeanPropertyRowMapper(City.class), id);
    }
}
