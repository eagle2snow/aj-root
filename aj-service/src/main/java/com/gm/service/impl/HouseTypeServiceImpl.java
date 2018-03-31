package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IHouseTypeDao;
import com.gm.base.model.HouseType;
import com.gm.service.IHouseTypeService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("houseTypeSercive")
public class HouseTypeServiceImpl extends BaseServiceImpl<HouseType, Integer> implements IHouseTypeService {
	@Resource
	private IHouseTypeDao dao;

	@Override
	public IBaseDao<HouseType, Integer> getDao() {
		return dao;
	}
}