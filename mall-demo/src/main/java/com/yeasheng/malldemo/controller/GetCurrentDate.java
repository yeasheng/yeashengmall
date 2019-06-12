package com.yeasheng.malldemo.controller;

import com.yeasheng.mallutil.commonUtil.DateUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class GetCurrentDate {
	@RequestMapping("/getCurrDate")
	public String getDate() {
		String date = DateUtil.getCurrentDate();
		return date;
	}
}
