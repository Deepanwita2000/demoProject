package com.Diagnostic.service;

import com.Diagnostic.dto.UserDto;
import com.Diagnostic.model.User;

public interface UserService {
	User findByUsername(String username);
	User save (UserDto userDto);

}
