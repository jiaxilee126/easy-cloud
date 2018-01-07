package com.easy.cloud.user.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dq.easy.cloud.model.common.json.utils.DqJSONUtils;
import com.dq.easy.cloud.model.common.response.common.DqResponseEnum;
import com.dq.easy.cloud.model.common.response.vo.DqResponseVO;
import com.easy.cloud.user.entity.UserEntity;
import com.easy.cloud.user.service.inf.UserService;

@RestController
@RequestMapping("user/")
public class UserController{
	@Autowired
	private UserService userService;
	
	@RequestMapping("getUserInfoById")
	public String getUserInfoById(@RequestParam Long id){
		UserEntity userEntity = userService.findUserById(id);
		return DqResponseVO.toString(userEntity);
	}
	
	

}
