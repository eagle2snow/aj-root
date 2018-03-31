package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;

/**
 * 销售顾问
 * 
 * @author ying
 *
 */
@Entity(name = "adviser")
@Table(name = "aj_adviser")
@M("销售顾问")
public class Adviser extends Model {
	@FormField(type = FieldType.PICTURE, label = "头像")
	private String avatar;
	@FormField(type = FieldType.TEXTINPUT, label = "手机")
	private String mobile;
	@FormField(type = FieldType.SELECT, label = "楼盘", ds = Premise.class, dataNature = DataNature.MODEL)
	private Premise premise;

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@ManyToOne
	public Premise getPremise() {
		return premise;
	}

	public void setPremise(Premise premise) {
		this.premise = premise;
	}

}
