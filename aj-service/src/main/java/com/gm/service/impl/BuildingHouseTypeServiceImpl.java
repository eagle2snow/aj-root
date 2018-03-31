package com.gm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IBuildingHouseTypeDao;
import com.gm.base.model.BuildingHouseType;
import com.gm.service.IBuildingHouseTypeService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;

@Transactional
@Service("buildingHouseTypeSercive")
public class BuildingHouseTypeServiceImpl extends BaseServiceImpl<BuildingHouseType, Integer> implements IBuildingHouseTypeService {
	@Resource
	private IBuildingHouseTypeDao dao;

	@Override
	public IBaseDao<BuildingHouseType, Integer> getDao() {
		return dao;
	}
}