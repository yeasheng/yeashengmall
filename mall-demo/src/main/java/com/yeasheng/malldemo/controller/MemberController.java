package com.yeasheng.malldemo.controller;

import com.yeasheng.malldemo.entity.MemberEntity;
import com.yeasheng.malldemo.repos.MemberDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/16
 */

@Api(value = "/user", tags = "用户接口模块")
@RestController
@RequestMapping(("/user"))
public class MemberController {
	private static Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Resource
	private MemberDao memberDao;

	@ApiOperation(value = "查询所有用户信息", notes = "查询用户")
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<MemberEntity> findAll() {
		logger.info("查询所有会员用户");
		return memberDao.findAll();
	}

}
