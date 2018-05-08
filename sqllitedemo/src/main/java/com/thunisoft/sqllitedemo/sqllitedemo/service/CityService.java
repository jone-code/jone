package com.thunisoft.sqllitedemo.sqllitedemo.service;

import com.thunisoft.sqllitedemo.sqllitedemo.dao.CityDao;
import com.thunisoft.sqllitedemo.sqllitedemo.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityDao cityDao;

    public List<City> getAll(){
        return  cityDao.selectAll();
    }

}
