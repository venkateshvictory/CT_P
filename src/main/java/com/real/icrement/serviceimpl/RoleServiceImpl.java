package com.real.icrement.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.real.icrement.model.Role;
import com.real.icrement.repository.RoleRepository;
import com.real.icrement.service.RoleService;

import jakarta.annotation.Resource;
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Resource(name="roleRepository")
	private RoleRepository roleRepository;
	@Override
	public Role save(Role role) {
		return roleRepository.save(role);
	}
	@Override
	public List<Role> getRoleByType(String type) {
		return roleRepository.getRoleByType(type);
	}

	

}
