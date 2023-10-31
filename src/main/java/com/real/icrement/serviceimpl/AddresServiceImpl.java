package com.real.icrement.serviceimpl;

import org.springframework.stereotype.Service;

import com.real.icrement.model.AddresModel;
import com.real.icrement.repository.AddresDao;
import com.real.icrement.service.AddresService;

import jakarta.annotation.Resource;

@Service("addresService")
public class AddresServiceImpl implements AddresService{

	@Resource(name="addresDao")
	private AddresDao addresDao;

	@Override
	public AddresModel save(AddresModel addresModel) {
		
		return addresDao.save(addresModel);
	}
}
