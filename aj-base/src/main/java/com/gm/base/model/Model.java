package com.gm.base.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;
import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.Verification;
import com.gm.gencode.util.FieldType;
import com.gm.utils.DateUtil;

@MappedSuperclass
public abstract class Model implements IModel {
	private static final long serialVersionUID = 1572529527239578433L;
	private Integer id;// id主键
	@FormField(label = "名称", sort = 2)
	@Verification(datatype = "*", errormsg = "请输入名称")
	private String name;// 名称
	@FormField(label = "内容", sort = 100, type = FieldType.EDITOR)
	@Verification()
	private String content;// 内容
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createTime = LocalDateTime.now();// 创建时间
	private String creationTimeString = "未知";
	private Integer deleted = 1;// 是否删除，1正常，2删除
	private Integer enable = 1;// 1可用，2禁用
	private boolean had = false;// 存在标识
	private Object object;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(columnDefinition = "LONGTEXT")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	@Transient
	public boolean isHad() {
		return had;
	}

	public void setHad(boolean had) {
		this.had = had;
	}

	@Transient
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	@Transient
	public String getCreationTimeString() {
		if (createTime != null) {
			return DateUtil.convertDateTimeToStr(this.createTime);
		}
		return creationTimeString;
	}

	public void setCreationTimeString(String creationTimeString) {
		this.creationTimeString = creationTimeString;
	}

}
