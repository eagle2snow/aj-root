package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gm.base.model.sys.User;
import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;

/**
 * 门店
 * 
 * @author ying
 *
 */
@M("门店")
@Entity(name = "store")
@Table(name = "aj_store")
public class Store extends Model {
	@FormField(type = FieldType.TEXTINPUT, label = "电话")
	private String tel;
	@FormField(type = FieldType.TEXTINPUT, label = "地址")
	private String address;
	@FormField(type = FieldType.SELECT, label = "店长", dataNature = DataNature.MODEL, ds = User.class)
	@JSONField(serialize = false)
	private User admin;
	@FormField(type = FieldType.PICTURE, label = "门头照")
	private String pic;

	private String adminName;
	private String adminMobile;

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@ManyToOne
	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Transient
	public String getAdminName() {
		if (null != admin) {
			return admin.getName();
		}
		return adminName;
	}

	public void setAdminName(String adminName) {

		this.adminName = adminName;
	}

	@Transient
	public String getAdminMobile() {
		if (null != admin) {
			return admin.getMobile();
		}
		return adminMobile;
	}

	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}

}
