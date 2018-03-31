package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 楼栋户型
 * 
 * @author ying
 *
 */
@Entity(name = "buildingHouseType")
@Table(name = "aj_building_house_type")
public class BuildingHouseType extends Model {
	private Building building;
	private HouseType houseType;

	@ManyToOne
	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	@ManyToOne
	public HouseType getHouseType() {
		return houseType;
	}

	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}

}
