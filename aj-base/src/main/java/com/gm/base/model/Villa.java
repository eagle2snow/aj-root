package com.gm.base.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;

/**
 * 别墅
 * 
 * @author ying
 *
 */
@M("别墅")
@Entity(name = "villa")
@Table(name = "aj_villa")
public class Villa extends Model {
	@FormField(type = FieldType.TEXTINPUT, label = "编号")
	private String code; // 编号
	@FormField(type = FieldType.SELECT, label = "楼盘", dataNature = DataNature.MODEL, ds = Premise.class)
	private Premise premise; // 所属楼盘
	@FormField(type = FieldType.TEXTINPUT, label = "室")
	private Integer shi =0;// 室
	@FormField(type = FieldType.TEXTINPUT, label = "厅")
	private Integer ting =0;// 厅
	@FormField(type = FieldType.TEXTINPUT, label = "卫")
	private Integer wei =0;// 卫
	@FormField(type = FieldType.TEXTINPUT, label = "建筑面积")
	private String buildingArea;// 建筑面积
	@FormField(type = FieldType.SELECT, data = "1|朝东,2|朝南,3|朝西,4|朝北,5|东南,6|东北,7|西南,8|西北",label="朝向")
	private Integer face;// 朝向

	@FormField(type = FieldType.TEXTINPUT, label = "楼层数")
	private Integer floorCount;// 楼层数
	@FormField(type = FieldType.SELECT, label = "装修程度", data = "1|毛坯,2|简装,3|精装,4|豪华装")
	private Integer fix;// 装修程度

	@FormField(type = FieldType.TEXTINPUT, label = "建成年份")
	private String year;// 建成年份
	@FormField(type = FieldType.TEXTINPUT, label = "单价")
	private BigDecimal unitPrice;// 单价
	@FormField(type = FieldType.TEXTINPUT, label = "总价")
	private BigDecimal price;// 总价
	@FormField(type = FieldType.PICTURE, label = "户型图")
	private String pic;// 户型图
	@FormField(type = FieldType.PICTURELIST, label = "实景图")
	private String pics;// 实景图

	@ManyToOne
	public Premise getPremise() {
		return premise;
	}

	public void setPremise(Premise premise) {
		this.premise = premise;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getShi() {
		return shi;
	}

	public void setShi(Integer shi) {
		this.shi = shi;
	}

	public Integer getTing() {
		return ting;
	}

	public void setTing(Integer ting) {
		this.ting = ting;
	}

	public Integer getWei() {
		return wei;
	}

	public void setWei(Integer wei) {
		this.wei = wei;
	}

	public String getBuildingArea() {
		return buildingArea;
	}

	public void setBuildingArea(String buildingArea) {
		this.buildingArea = buildingArea;
	}

	public Integer getFace() {
		return face;
	}

	public void setFace(Integer face) {
		this.face = face;
	}

	public Integer getFloorCount() {
		return floorCount;
	}

	public void setFloorCount(Integer floorCount) {
		this.floorCount = floorCount;
	}

	public Integer getFix() {
		return fix;
	}

	public void setFix(Integer fix) {
		this.fix = fix;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getPics() {
		return pics;
	}

	@Column(columnDefinition = "TEXT")
	public void setPics(String pics) {
		this.pics = pics;
	}

}
