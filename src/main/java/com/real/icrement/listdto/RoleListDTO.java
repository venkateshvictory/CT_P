package com.real.icrement.listdto;

import java.util.List;

import com.real.icrement.baseEndpoint.ResponseDTO;
import com.real.icrement.dto.RoleDTO;

public class RoleListDTO extends ResponseDTO {

	List<RoleDTO> roles;

	public List<RoleDTO> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleDTO> roles) {
		this.roles = roles;
	}
	
	
	
}
