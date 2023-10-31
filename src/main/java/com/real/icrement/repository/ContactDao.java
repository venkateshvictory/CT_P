package com.real.icrement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.real.icrement.model.ContactModel;
@Repository("contactDao")
public interface ContactDao extends JpaRepository<ContactModel, Long> {

}
