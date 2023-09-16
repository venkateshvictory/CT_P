package com.real.icrement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.real.icrement.model.Role;
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long>{
	//@Query("select u from Role u where u.type = :type")
	@Query(value = "Select * from ROLE u where u.TYPE=:type ", nativeQuery = true)
	List<Role> getRoleByType(String type);
}
