package com.emample.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emample.demo.dto.UserDto;

@RestController
public class UserController {

	@RequestMapping(value="/validateUser")
	public UserDto findUserByUsernameAndPassword(@RequestParam("username")String username,@RequestParam("password")String password) {
		
		UserDto userDto = new UserDto();
		userDto.setId(12);
		userDto.setName("Rajib");
		userDto.setUsername("rajib");
		userDto.setPassword("root");
		
		return userDto;
	}
	
	
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public UserDto save(@RequestBody UserDto userDto) {
		
		
		
		userDto.setName("Rajib");
		
		return userDto;
	}
	
	
	
}
