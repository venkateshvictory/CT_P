package com.real.icrement.cart;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.real.icrement.baseEndpoint.BaseEndPoint;
import com.real.icrement.baseEndpoint.ResponseDTO;
import com.real.icrement.dto.RoleDTO;
import com.real.icrement.listdata.RoleListData;
import com.real.icrement.listdto.RoleListDTO;
import com.real.icrement.model.Role;
import com.real.icrement.service.CustomerRoleService;
import com.real.icrement.service.RoleService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/role")
public class RoleController extends BaseEndPoint{

	@Autowired
	private ModelMapper modelMapper;
	
	@Resource(name="roleService")
	private RoleService roleService;
	
	@Resource(name = "customerRoleService")
	private CustomerRoleService customerRoleService;
	
	/*
	 * @PostMapping("/cr") public Role save(@RequestBody Role role) { return
	 * roleService.save(role); }
	 */
	
	@PostMapping("/create")
	public ResponseDTO createRole(@RequestBody RoleDTO role) {
		ResponseDTO response = new ResponseDTO();
		if(!customerRoleService.hasAdminRole(role.getEmail())) {
			return updateUnAuthorizedMessage(response, "you are not allowed to update a role");
		}
		Role roleImpl=modelMapper.map(role, Role.class);
	RoleDTO	roleDto=modelMapper.map(roleService.save(roleImpl),RoleDTO.class);
		response.setMessage("SUCCESS");
		response.setStatusCode("200");
		return response;
		
	}

	@GetMapping("/getByType")
	public List<Role> getRoleByType(@RequestParam String type) {
	List<Role>	roletype=roleService.getRoleByType(type);
	return roletype;
	}
	@GetMapping("/getRolesByType")
	public ResponseDTO getRolesByType(@RequestParam String type, @RequestParam String email){
		ResponseDTO response = new ResponseDTO();
		if(!customerRoleService.hasAgentRole(email)) {
			return updateUnAuthorizedMessage(response, "you are not allowed to update a role");
		}
	      List<Role>	roles=roleService.getRoleByType(type);
	      RoleListData rolelistData = new RoleListData();
	     rolelistData.setRoles(roles);
	    RoleListDTO rolesDto= modelMapper.map(rolelistData, RoleListDTO.class);
	    return rolesDto; 
	}

}