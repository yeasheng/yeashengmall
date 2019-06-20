package com.yeasheng.malldemo.controller;

import com.yeasheng.malldemo.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/19
 */
@RestController
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Resource
	private AsyncService asyncService;
	@RequestMapping("/")
	public String submit(){
		logger.info("start submit");

		//调用service层的任务
		asyncService.executeAsync();

		logger.info("end submit");

		return "success";
	}

}

