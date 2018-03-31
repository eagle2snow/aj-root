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
 * 商汇
 * 
 * @author ying
 *
 */
@M("商汇")
@Entity(name = "bizNews")
@Table(name = "aj_bizNews")
public class BizNews extends Model {

	@FormField(type = FieldType.PICTURE, label = "封面图")
	private String pic;
	@FormField(type = FieldType.PICTURELIST, label = "组图")
	private String pics;
	@FormField(type = FieldType.SELECT, label = "发布人", dataNature = DataNature.MODEL, ds = User.class)
	private User user;
	@FormField(type = FieldType.TEXTINPUT, label = "点击数")
	private Integer hit = 0;

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

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

	public Integer getHit() {
		return hit;
	}

	public void setHit(Integer hit) {
		this.hit = hit;
	}

}
