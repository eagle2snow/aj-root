package com.gm.service;

import com.gm.service.IBaseService;
import com.gm.base.model.Building;

/**
 * 代码生成器生成代码<br/>
 * IBuildingService
 * 
 * @author guet
 *
 */
public interface IBuildingService extends IBaseService<Building, Integer> {

	/**
	 * 
	 * @param model
	 * @param houseTypeIds
	 *            户型id串
	 * @return
	 */
	boolean save(Building model, String houseTypeIds);

	/**
	 * 
	 * @param model
	 * @param houseTypeIds
	 *            户型id串
	 * @return
	 */
	boolean update(Building model, String houseTypeIds);

}