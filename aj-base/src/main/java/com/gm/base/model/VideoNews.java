package com.gm.base.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gm.base.model.sys.User;
import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.FieldType;

/**
 * 直播视频
 * 
 * @author ying
 *
 */
@Entity(name = "videoNews")
@Table(name = "aj_videoNews")
@M("直播视频")
public class VideoNews extends Model {
	@FormField(type = FieldType.RADIO, label = "置顶", data = "1|是,2|否")
	private Integer isTop = 2;// 置顶
	@FormField(type = FieldType.PICTURE, label = "封面")
	private String pic;// 封面
	@FormField(type = FieldType.TEXTINPUT, label = "播放次数")
	private Integer hit = 0;// 播放
	@FormField(type = FieldType.FILE, label = "视频url")
	private String url;// 视频url
	@FormField(type = FieldType.TEXTINPUT, label = "来源")
	private String src;// 来源
	private User user;// 发布人

	public Integer getIsTop() {
		return isTop;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
