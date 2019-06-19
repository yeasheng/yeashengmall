package com.yeasheng.malldemo.controller;

import com.yeasheng.malldemo.entity.MemberEntity;
import com.yeasheng.malldemo.repos.MemberDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/16
 */

@Api(value = "/userManager", tags = "用户接口模块")
@RestController
@RequestMapping(("/userManager"))
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

	@ApiOperation(value = "修改用户信息", notes = "修改用户")
	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public MemberEntity updateUser(@PathVariable(value = "id") Integer id, @RequestBody MemberEntity param) {
		MemberEntity result = null;
		try {
			/*User existing = userRepository.read(user.getId());
			copyNonNullProperties(user, existing);*/
			MemberEntity detail = memberDao.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("MemberEntity", "id", id));
			copyNonNullProperties(param,detail);
			result = memberDao.save(detail);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}

	@ApiOperation(value = "新增用户信息", notes = "新增用户")
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public MemberEntity saveUser(@RequestBody MemberEntity param) {
		return memberDao.save(param);
	}

	@ApiOperation(value = "get member detail by id", notes = "根据ID获取详情")
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public MemberEntity getMemberById(@PathVariable(value = "id") Integer id) throws ResourceNotFoundException {
		return memberDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("MemberEntity", "id", id));
	}

	private class ResourceNotFoundException extends Exception {

		private ResourceNotFoundException(String memberEntity, String id, Integer id1) {
			super.getMessage();
		}
	}
	public static void copyNonNullProperties(Object src, Object target) {
		BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
	}
	public static String[] getNullPropertyNames (Object source) {
		final BeanWrapper src = new BeanWrapperImpl(source);
		java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

		Set<String> emptyNames = new HashSet<String>();
		for(java.beans.PropertyDescriptor pd : pds) {
			Object srcValue = src.getPropertyValue(pd.getName());
			if (srcValue == null) emptyNames.add(pd.getName());
		}
		String[] result = new String[emptyNames.size()];
		return emptyNames.toArray(result);
	}
}
