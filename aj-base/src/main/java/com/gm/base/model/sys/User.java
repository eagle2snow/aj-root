package com.gm.base.model.sys;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gm.base.model.Model;
import com.gm.base.model.Store;
import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.annotation.Verification;
import com.gm.gencode.util.FieldType;
import com.gm.utils.StringUtil;

@M("用户")
@Entity(name = "user")
@Table(name = "aj_user")
public class User extends Model {

	@FormField(label = "用户名", type = FieldType.TEXTINPUT)
	private String username;
	@FormField(label = "密码", type = FieldType.TEXTINPUT)
	private String password;
	@Verification(datatype = "m")
	@FormField(label = "手机号", type = FieldType.TEXTINPUT)
	private String mobile;
	private LocalDateTime lastLoginDate;
	private String avatar;
	private Integer sex = 0;
	private String sign;// 个性签名
	private String imei;// imei码
	private String idNo;// 身份证号
	private String idPicA;// 身份证正面
	private String idPicB;// 身份证背面
	private Store store;// 所属门店

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public LocalDateTime getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(LocalDateTime lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getAvatar() {
		if (StringUtil.nullOrEmpty(avatar)) {
			return "/static/admin/img/user8-128x128.jpg";
		}
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Column(updatable = false)
	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getIdPicA() {
		return idPicA;
	}

	public void setIdPicA(String idPicA) {
		this.idPicA = idPicA;
	}

	public String getIdPicB() {
		return idPicB;
	}

	public void setIdPicB(String idPicB) {
		this.idPicB = idPicB;
	}

	@ManyToOne
	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

}