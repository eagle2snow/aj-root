package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.FieldType;

/**
 * 广告
 * 
 * @author ying
 *
 */
@M("广告")
@Entity(name = "adv")
@Table(name = "aj_adv")
public class Adv extends Model {
	@FormField(type = FieldType.PICTURE, label = "封面图")
	private String pic;
	@FormField(type = FieldType.RADIO, label = "类型", data = "1|站内,2|站外")
	private Integer type;
	@FormField(type = FieldType.TEXTINPUT, label = "广告链接")
	private String src;

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}
}
