package com.real.icrement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.real.icrement.model.ContactModel;
import com.real.icrement.repository.ContactDao;
import com.real.icrement.service.ContactService;

import jakarta.annotation.Resource;
@Service("contactService")
public class ContactServiceImpl implements ContactService{

	@Resource(name="contactDao")
	private ContactDao contactDao;
	@Override
	public ContactModel save(ContactModel contactModel) {
		
		return contactDao.save(contactModel);
	}

}
