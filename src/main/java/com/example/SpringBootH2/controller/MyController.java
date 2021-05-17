package com.example.SpringBootH2.controller;

import com.example.SpringBootH2.bean.City;
import com.example.SpringBootH2.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This is the controller class for the Spring Boot RESTful application.
 * The @RestController annotation creates a RESTful controller.
 * While the traditional MVC controller uses ModelAndView, the RESTful controller simply returns the object and the object data
 * is written directly to the HTTP response in JSON or XML format.
 */

@RestController
public class MyController {

    @Autowired
    private ICityService cityService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/cities")
    public List<City> findCities() {
        return cityService.findAll();
    }

    @RequestMapping("/cities/{userId}")
    public City findCity(@PathVariable Long userId) {
        return cityService.findById(userId);
    }
}
