package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserEntity;
import com.example.service.UserService;

@RestController
public class AuthController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public UserEntity register(@RequestBody UserEntity user) {
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

		return userService.createUser(user);
	}
}
