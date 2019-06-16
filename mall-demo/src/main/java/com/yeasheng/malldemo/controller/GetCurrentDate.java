package com.yeasheng.malldemo.controller;

import com.yeasheng.malldemo.config.AuthorSettings;
import com.yeasheng.mallutil.commonUtil.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : John
 * @Version: 2019/06/15
 */
@RestController
@RequestMapping("/demo")
public class GetCurrentDate {

	@Autowired
	private AuthorSettings authorSettings;

	@Value("${com.yeasheng.title}")
	private String title;
	@Value("${com.yeasheng.desc}")
	private String desc;

	@RequestMapping(value="/getCurrDate",method = RequestMethod.GET)
	public String getDate() {
		String date = DateUtil.getCurrentDate();
		return date;
	}

	@RequestMapping(value = "/getProperties",method = RequestMethod.GET)
	public String getProperties() {
		return "title is: " + title + " ,and desc is: " + desc;
	}

	@RequestMapping(value = "/getFromFile",method = RequestMethod.GET)
	public String getFromFile(){
		return "name: "+ authorSettings.getName()+" age: "+authorSettings.getAge();
	}
}
