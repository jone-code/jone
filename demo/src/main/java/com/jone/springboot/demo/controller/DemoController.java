package com.jone.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO completion javadoc.
 *
 * @author 姓名
 * @since 07 七月 2018
 */
@Controller
public class DemoController {

	@RequestMapping("/index")
	@ResponseBody
	public String index(){
		return "123";
	}
}
