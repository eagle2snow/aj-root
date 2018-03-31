package com.gm.base.model.sys;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.gm.base.model.Model;
import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;

/**
 * 资源
 * 
 * @author ying
 *
 */
@M("资源")
@Entity(name = "res")
@Table(name = "aj_res")
public class Res extends Model {

	@FormField(type = FieldType.TEXTINPUT, label = "权限码")
	private String code;
	@FormField(type = FieldType.RADIO, label = "类型", data = "1|菜单,2|按钮")
	private Integer type;
	@FormField(type = FieldType.TEXTINPUT, label = "路径")
	private String url;
	@FormField(type = FieldType.IGNORE, label = "级别")
	private Integer level = 0;
	@FormField(type = FieldType.SELECT, dataNature = DataNature.MODEL, ds = Res.class, label = "上级")
	private Res parent;
	@FormField(type = FieldType.IGNORE)
	private List<Res> sons = new ArrayList<>();

	@ManyToOne
	public Res getParent() {
		return parent;
	}

	public void setParent(Res parent) {
		this.parent = parent;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Transient
	public List<Res> getSons() {
		return sons;
	}

	public void setSons(List<Res> sons) {
		this.sons = sons;
	}

}
