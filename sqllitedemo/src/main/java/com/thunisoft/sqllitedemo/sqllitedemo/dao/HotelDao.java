package com.thunisoft.sqllitedemo.sqllitedemo.dao;

import com.thunisoft.sqllitedemo.sqllitedemo.pojo.Hotel;

public interface HotelDao {
    Hotel selectByCityId(long id);
}
