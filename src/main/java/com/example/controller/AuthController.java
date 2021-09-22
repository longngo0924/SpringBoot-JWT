package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserEntity;

@RestController
public class AuthController {

	@PostMapping("/register")
	public UserEntity register(@RequestBody UserEntity user) {

		return null;
	}
}
