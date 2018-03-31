package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.FieldType;

@M(value = "app更新包")
@Entity(name = "appInfo")
@Table(name = "aj_appInfo")
public class AppInfo extends Model {
	@FormField(type = FieldType.TEXTINPUT, label = "版本号")
	private String version; // 版本号
	@FormField(type = FieldType.TEXTINPUT, label = "版本索引")
	private String versionIndex; // 版本索引，越大越新
	@FormField(type = FieldType.FILE, label = "保存路径")
	private String url; // 保存路径
	private String size; // 大小，（单位：m）
	@FormField(type = FieldType.RADIO, label = "类型", data = "1|用户版,2|商家版")
	private Integer type;// 1用户版，2商家版
	@FormField(type = FieldType.RADIO, label = "平台", data = "1|安卓,2|苹果")
	private Integer platform;// 1安卓，2苹果

	@FormField(type = FieldType.RADIO, label = "App类型", data = "1|wgt,2|apk")
	private Integer typeApp;// 1wgt,2apk

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public String getVersionIndex() {
		return versionIndex;
	}

	public void setVersionIndex(String versionIndex) {
		this.versionIndex = versionIndex;
	}

	public Integer getTypeApp() {
		return typeApp;
	}

	public void setTypeApp(Integer typeApp) {
		this.typeApp = typeApp;
	}

	
}
