package com.real.icrement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.real.icrement.model.AddresModel;
@Repository("addresDao")
public interface AddresDao extends JpaRepository<AddresModel, Long>{

}
