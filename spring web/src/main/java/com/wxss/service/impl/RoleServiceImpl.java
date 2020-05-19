package com.wxss.service.impl;


import com.wxss.dao.RoleRepository;
import com.wxss.entity.Role;
import com.wxss.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl  implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Set<String> listRoles(String userName) {
		List<Role> roles = roleRepository.listRolesByUserName(userName);
		Set<String> result = new HashSet<>();
		for (Role role: roles) {
			result.add(role.getName());
		}
		return result;
	}
}
