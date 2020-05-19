package com.wxss.service.impl;


import com.wxss.dao.PermissionRepository;
import com.wxss.entity.Permission;
import com.wxss.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionRepository permissionRepository;

	@Override
	public Set<String> listPermissions(String userName) {
		List<Permission> permissions = permissionRepository.listPermissionsByUserName(userName);
		Set<String> result = new HashSet<>();
		for (Permission permission: permissions) {
			result.add(permission.getName());
		}
		return result;
	}
}
