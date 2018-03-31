package com.gm.base.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.Transactional;

import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;

/**
 * 户型
 * 
 * @author ying
 *
 */
@M("户型")
@Entity(name = "houseType")
@Table(name = "aj_house_type")
public class HouseType extends Model {

	@FormField(type = FieldType.SELECT, label = "楼盘", dataNature = DataNature.MODEL, ds = Premise.class)
	private Premise premise;
	@FormField(type = FieldType.TEXTINPUT, label = "室")
	private Integer shi =0;// 室
	@FormField(type = FieldType.TEXTINPUT, label = "厅")
	private Integer ting =0;// 厅
	@FormField(type = FieldType.TEXTINPUT, label = "卫")
	private Integer wei =0;// 卫
	@FormField(type = FieldType.TEXTINPUT, label = "阳台")
	private Integer yang =0;// 阳台
	@FormField(type = FieldType.TEXTINPUT, label = "面积")
	private Integer area;// 面积
	@FormField(type = FieldType.SELECT, data = "1|朝东,2|朝南,3|朝西,4|朝北,5|东南,6|东北,7|西南,8|西北,9|南北通透", label = "朝向")
	private Integer face;// 朝向
	@FormField(type = FieldType.TEXTINPUT, label = "层高")
	private String height;// 层高
	@FormField(type = FieldType.PICTURE, label = "户型图")
	private String pic;// 户型图
	@FormField(type = FieldType.PICTURELIST, label = "样板图")
	private String pics;// 样板图
	private BigDecimal price;// 价钱

	@ManyToOne
	public Premise getPremise() {
		return premise;
	}

	public void setPremise(Premise premise) {
		this.premise = premise;
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

	
	public Integer getYang() {
		return yang;
	}

	public void setYang(Integer yang) {
		this.yang = yang;
	}

	public Integer getFace() {
		return face;
	}

	public void setFace(Integer face) {
		this.face = face;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Column(columnDefinition = "TEXT")
	public String getPics() {
		return pics;
	}

	public void setPics(String pics) {
		this.pics = pics;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Transient
	public BigDecimal getPrice() {
		return this.getPremise().getAvgPrice().multiply(BigDecimal.valueOf(this.getArea()))
				.divide(BigDecimal.valueOf(10000));
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
