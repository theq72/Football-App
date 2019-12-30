package com.fantasyapp.app.ws.mobileappws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.fantasyapp.app.ws.mobileappws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);

	UserDto getUser(String email);

	UserDto getUserByUserId(String userId);
}
