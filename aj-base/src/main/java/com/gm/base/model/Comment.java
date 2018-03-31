package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gm.base.model.sys.User;
import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;

/**
 * 点评
 * 
 * @author ying
 *
 */
@M("点评")
@Entity(name = "comment")
@Table(name = "aj_comment")
public class Comment extends Model {
	@FormField(type = FieldType.TEXTINPUT, label = "组图")
	private String pics;
	@FormField(type = FieldType.SELECT, label = "评论人", dataNature = DataNature.MODEL, ds = User.class)
	private User user;
	@FormField(type = FieldType.RADIO, label = "模块", data = "1|新房,2|二手房,3|租房,4|民宿")
	private Integer model;
	@FormField(type = FieldType.TEXTINPUT, label = "数据id")
	private Integer modelId;
	
	
	public String getPics() {
		return pics;
	}
	public void setPics(String pics) {
		this.pics = pics;
	}
	
	@ManyToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	}
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	
	
	

}
