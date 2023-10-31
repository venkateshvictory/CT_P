package com.real.icrement.serviceimpl;

import org.springframework.stereotype.Service;

import com.real.icrement.model.BusinesModel;
import com.real.icrement.repository.BusinesDao;
import com.real.icrement.service.BusinesService;

import jakarta.annotation.Resource;

@Service("businesService")
public class BusinesServiceImpl implements BusinesService {

	@Resource(name="businesDao")
	private BusinesDao businesDao;
	@Override
	public BusinesModel save(BusinesModel businesModel) {
	
		return businesDao.save(businesModel);
	}

}
