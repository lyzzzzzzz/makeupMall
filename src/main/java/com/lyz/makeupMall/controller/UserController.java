package com.lyz.makeupMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.lyz.makeupMall.domain.User;
import com.lyz.makeupMall.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("lyz/user")
@Api(tags = "用户管理")
public class UserController {

	@Autowired
	private IUserService userService;
	
	
	@ApiOperation(value = "查询全部用户", notes = "")
	@GetMapping(value = "selectAllUser")
	public List<User>  selectAllRoles() {
		List<User> userList = this.userService.selectAllUser();
		
		return userList;
	}
}
