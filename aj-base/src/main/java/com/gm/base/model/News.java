package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;

/**
 * 资讯
 * 
 * @author ying
 *
 */
@Entity(name = "news")
@Table(name = "aj_news")
@M("资讯")
public class News extends Model {
	@FormField(type = FieldType.RADIO, label = "置顶", data = "1|是,2|否")
	private Integer isTop = 2;// 置顶
	@FormField(type = FieldType.SELECT, label = "分类", dataNature = DataNature.MODEL, ds = NewsCat.class)
	private NewsCat newsCat;
	private String pic;// 封面
	private Integer hit = 0;// 点击
	private String src;// 来源

	public Integer getIsTop() {
		return isTop;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}

	@ManyToOne
	public NewsCat getNewsCat() {
		return newsCat;
	}

	public void setNewsCat(NewsCat newsCat) {
		this.newsCat = newsCat;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getHit() {
		return hit;
	}

	public void setHit(Integer hit) {
		this.hit = hit;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}
}
