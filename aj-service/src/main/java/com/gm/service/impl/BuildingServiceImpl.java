package com.gm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gm.base.dao.IBuildingDao;
import com.gm.base.model.Building;
import com.gm.base.model.BuildingHouseType;
import com.gm.base.model.HouseType;
import com.gm.service.IBuildingHouseTypeService;
import com.gm.service.IBuildingService;
import com.gm.service.IHouseTypeService;
import com.gm.base.dao.IBaseDao;
import com.gm.service.impl.BaseServiceImpl;
import com.gm.utils.StringUtil;

@Transactional
@Service("buildingSercive")
public class BuildingServiceImpl extends BaseServiceImpl<Building, Integer> implements IBuildingService {
	@Resource
	private IBuildingDao dao;

	@Resource
	private IHouseTypeService houseTypeService;
	@Resource
	private IBuildingHouseTypeService buildingHouseTypeService;

	@Override
	public IBaseDao<Building, Integer> getDao() {
		return dao;
	}

	@Override
	public boolean save(Building model, String houseTypeIds) {
		if (!StringUtil.strNullOrEmpty(houseTypeIds)) {
			Integer id = saveReturnId(model);
			if (id > 0) {
				model.setId(id);
				List<HouseType> types = houseTypeService.listIn("id", houseTypeIds);
				types.stream().forEach(type -> {
					BuildingHouseType buildingHouseType = new BuildingHouseType();
					buildingHouseType.setBuilding(model);
					buildingHouseType.setHouseType(type);
					buildingHouseTypeService.save(buildingHouseType);
				});
				return true;
			}
			return false;
		} else {
			return save(model);
		}
	}

	@Override
	public boolean update(Building model, String houseTypeIds) {
		if (!StringUtil.strNullOrEmpty(houseTypeIds)) {
			if (update(model)) {
				buildingHouseTypeService.deleteByParm("building.id", model.getId(), true);
				List<HouseType> types = houseTypeService.listIn("id", houseTypeIds);
				types.stream().forEach(type -> {
					BuildingHouseType buildingHouseType = new BuildingHouseType();
					buildingHouseType.setBuilding(model);
					buildingHouseType.setHouseType(type);
					buildingHouseTypeService.save(buildingHouseType);
				});
				return true;
			}
			return false;
		} else {
			return update(model);
		}
	}
}