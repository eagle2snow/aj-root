package com.gm.base.dto;

/**
 * 首页轮播
 * 
 * @author ying
 *
 */
public class Top {
	private Integer id;
	private Integer type; // 1楼盘，2二手，3租房，4短租
	private String pic;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

}
