package com.real.icrement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.real.icrement.model.BusinesModel;
@Repository("businesDao")
public interface BusinesDao extends JpaRepository<BusinesModel, Long> {

	
}
