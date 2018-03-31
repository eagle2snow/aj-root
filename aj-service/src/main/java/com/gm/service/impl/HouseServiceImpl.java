package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IHouseDao;
import com.gm.base.model.House;
import com.gm.service.IHouseService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("houseSercive")
public class HouseServiceImpl extends BaseServiceImpl<House, Integer> implements IHouseService {
	@Resource
	private IHouseDao dao;

	@Override
	public IBaseDao<House, Integer> getDao() {
		return dao;
	}
}