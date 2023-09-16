package com.real.icrement.service;

import java.util.List;

import com.real.icrement.model.Role;

public interface RoleService {

	public Role save(Role role);
	
	public List<Role> getRoleByType(String type);
}
