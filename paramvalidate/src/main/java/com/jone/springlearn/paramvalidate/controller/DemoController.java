package com.jone.springlearn.paramvalidate.controller;

import com.jone.springlearn.paramvalidate.bean.Person;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo
 *
 * @author 姓名
 * @since 24 六月 2018
 */
@RestController
public class DemoController {

	@RequestMapping("/test")
	public String test(@Validated Person p,BindingResult result){

		if(result.hasErrors()){
			return result.getFieldError().getDefaultMessage();
		}
		return "hello";
	}

}
