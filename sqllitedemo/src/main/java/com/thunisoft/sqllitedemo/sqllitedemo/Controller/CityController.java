package com.thunisoft.sqllitedemo.sqllitedemo.Controller;

import com.thunisoft.sqllitedemo.sqllitedemo.pojo.City;
import com.thunisoft.sqllitedemo.sqllitedemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public String  selectAll(){
        try {
            List<City> list = cityService.getAll();
            System.out.println("123123");
            System.out.println("====="+list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return "123";
    }
}
