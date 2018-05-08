package com.thunisoft.sqllitedemo.sqllitedemo.dao;

import com.thunisoft.sqllitedemo.sqllitedemo.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "cityDao")
public interface CityDao {
    City selectCityById(@Param("id") int id);
    List<City> selectAll();
}
