package com.wxss.service.impl;


import com.wxss.dao.UserRepository;
import com.wxss.entity.User;
import com.wxss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String getPassword(String name) {
		User u  = userRepository.getByName(name);
		if(null==u){
			return null;
		}
		return u.getPassword();
	}

}
