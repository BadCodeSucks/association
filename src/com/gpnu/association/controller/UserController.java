package com.gpnu.association.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gpnu.association.mapper.UserMapper;
import com.gpnu.association.pojo.User;
import com.gpnu.association.service.UserService;
import com.gpnu.association.util.CommonUtil;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam Map paraMap){
		ModelAndView mav = new ModelAndView();
		User user = new User();
		user.setAccount(paraMap.get("account").toString());
		user.setPassword(paraMap.get("password").toString());
		User loginUser = userMapper.findPasswordByAccount(user);
		if(loginUser != null){
			mav.addObject("loginUser", loginUser);
		}else{
			user.setUser_name(paraMap.get("userName").toString());
			user.setPhone(paraMap.get("phone").toString());
			user.setEmail(paraMap.get("email").toString());
			user.setSex(paraMap.get("sex").toString());
			user.setUser_type(CommonUtil.USER_ROLE_STUDENT);
			user.setCreate_time(new Date());
			userMapper.add(user);
			mav.addObject("loginUser", user);
		}
		mav.setViewName("jsp/index");
		return mav;
	}
}
