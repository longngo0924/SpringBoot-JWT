package com.example.service;

import com.example.authenticate.UserPrincipal;
import com.example.entity.UserEntity;

public interface UserService {
	UserEntity createUser(UserEntity user);

	UserPrincipal findByUsername(String username);
}
