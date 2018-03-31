package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;

/**
 * 楼栋
 * 
 * @author ying
 *
 */
@M("楼栋")
@Entity(name = "building")
@Table(name = "aj_building")
public class Building extends Model {
	@FormField(type = FieldType.TEXTINPUT, label = "编号")
	private String code; // 编号
	@FormField(type = FieldType.SELECT, label = "所在楼盘", dataNature = DataNature.MODEL, ds = Premise.class)
	private Premise premise; // 所在楼盘
	@FormField(type = FieldType.TEXTINPUT, label = "楼层数")
	private Integer floorCount; // 楼层数
	@FormField(type = FieldType.TEXTINPUT, label = "房屋数量")
	private Integer houseCount; // 房屋数量
	@FormField(type = FieldType.TEXTINPUT, label = "单元数量")
	private Integer apartCount; // 单元数量
	@FormField(type = FieldType.SELECT, data = "1|住宅,2|商业,3|商住,4|工业,5|综合", label = "物业类型")
	private Integer useType; // 用途
	@FormField(type = FieldType.SELECT, data = "1|朝东,2|朝南,3|朝西,4|朝北,5|东南,6|东北,7|西南,8|西北", label = "朝向")
	private Integer face; // 朝向
	@FormField(type = FieldType.TEXTINPUT, label = "高度")
	private String height;// 高度（米）
	@FormField(type = FieldType.TEXTINPUT, label = "建成时间")
	private String builtDate;// 建成时间

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@ManyToOne
	public Premise getPremise() {
		return premise;
	}

	public void setPremise(Premise premise) {
		this.premise = premise;
	}

	public Integer getFloorCount() {
		return floorCount;
	}

	public void setFloorCount(Integer floorCount) {
		this.floorCount = floorCount;
	}

	public Integer getHouseCount() {
		return houseCount;
	}

	public void setHouseCount(Integer houseCount) {
		this.houseCount = houseCount;
	}

	public Integer getApartCount() {
		return apartCount;
	}

	public void setApartCount(Integer apartCount) {
		this.apartCount = apartCount;
	}

	public Integer getUseType() {
		return useType;
	}

	public void setUseType(Integer useType) {
		this.useType = useType;
	}

	public Integer getFace() {
		return face;
	}

	public void setFace(Integer face) {
		this.face = face;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBuiltDate() {
		return builtDate;
	}

	public void setBuiltDate(String builtDate) {
		this.builtDate = builtDate;
	}

}
