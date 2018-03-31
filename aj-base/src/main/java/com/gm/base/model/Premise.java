package com.gm.base.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.gm.base.model.sys.User;
import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.FieldType;
import com.gm.utils.StringUtil;

/**
 * 楼盘
 * 
 * @author ying
 *
 */
@M("楼盘")
@Entity(name = "premise")
@Table(name = "aj_premise")
public class Premise extends Model {
	@FormField(label = "编号", type = FieldType.TEXTINPUT)
	private String code; // 编号
	@FormField(label = "位置", type = FieldType.TEXTINPUT)
	private String position; // 位置
	@FormField(label = "占地面积", type = FieldType.TEXTINPUT)
	private String allArea; // 占地面积
	@FormField(label = "建筑面积", type = FieldType.TEXTINPUT)
	private Integer buildArea;// 建筑面积

	private String buildAreaStr;// 建筑面积Str

	@FormField(label = "开盘日期", type = FieldType.TEXTINPUT)
	private String openDate;// 开盘日期
	@FormField(label = "楼栋数量", type = FieldType.TEXTINPUT)
	private Integer buildingCount;// 楼栋数量
	@FormField(label = "规划住户", type = FieldType.TEXTINPUT)
	private Integer roomCount; // 规划住户
	@FormField(label = "停车位数量", type = FieldType.TEXTINPUT)
	private Integer parkCount;// 停车位数量
	@FormField(label = "组图", type = FieldType.PICTURELIST)
	private String pics;// 组图
	@FormField(label = "状态", type = FieldType.RADIO, data = "1|未开盘,2|在售期房,3|已售罄,4|认筹,5|认购,6|在售现房")
	private Integer sellState;// 销售状态
	@FormField(label = "楼盘地址", type = FieldType.TEXTINPUT)
	private String address;// 楼盘地址
	@FormField(label = "销售地址", type = FieldType.TEXTINPUT)
	private String sellAddress;// 销售地址
	@FormField(label = "销售电话", type = FieldType.TEXTINPUT)
	private String sellTel;// 销售电话
	@FormField(label = "均价", type = FieldType.TEXTINPUT)
	private BigDecimal avgPrice;// 均价
	@FormField(label = "开发商", type = FieldType.TEXTINPUT)
	private String buildCom; // 开发商
	@FormField(label = "物业公司", type = FieldType.TEXTINPUT)
	private String proManCom;// 物业公司
	@FormField(label = "物业费", type = FieldType.TEXTINPUT)
	private String proManFee;// 物业费（月/平）
	@FormField(type = FieldType.CHECKBOX, data = "1|住宅,2|别墅,3|商住,4|商铺,5|其他", label = "物业类型")
	private Integer type;// 物业类型
	@FormField(label = "容积率", type = FieldType.TEXTINPUT)
	private String far;// 容积率
	@FormField(label = "绿化率", type = FieldType.TEXTINPUT)
	private String green;// 绿化率

	private Integer zone;// 区域 ，1海城，2银海，3铁山港，4合浦

	private User user;// 属性员工

	private String pic;// 封面图

	private String special;// 特色

	private String lng;// 经度

	private String lat;// 纬度

	private String notice;// 公告

	private Integer slider = 2;// 1首页轮播，2非首页轮播

	private String docs;// 文档

	private Integer isTop = 2;// 置顶
	private Integer onSale = 2;// 特价房，1有，2无
	private String rangeArea;// 户型面积范围
	private String rangeShi;// 室数范围
	private String minPrice;// 最小价格

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAllArea() {
		return allArea;
	}

	public void setAllArea(String allArea) {
		this.allArea = allArea;
	}

	public Integer getBuildArea() {
		return buildArea;
	}

	public void setBuildArea(Integer buildArea) {
		this.buildArea = buildArea;
	}

	/*
	 * public String getGreenArea() { return greenArea; }
	 * 
	 * public void setGreenArea(String greenArea) { this.greenArea = greenArea; }
	 */

	public String getFar() {
		return far;
	}

	public void setFar(String far) {
		this.far = far;
	}

	public String getGreen() {
		return green;
	}

	public void setGreen(String green) {
		this.green = green;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public Integer getBuildingCount() {
		return buildingCount;
	}

	public void setBuildingCount(Integer buildingCount) {
		this.buildingCount = buildingCount;
	}

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}

	public Integer getParkCount() {
		return parkCount;
	}

	public void setParkCount(Integer parkCount) {
		this.parkCount = parkCount;
	}

	@Column(columnDefinition = "TEXT")
	public String getPics() {
		return pics;
	}

	public void setPics(String pics) {
		this.pics = pics;
	}

	public Integer getSellState() {
		return sellState;
	}

	public void setSellState(Integer sellState) {
		this.sellState = sellState;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSellAddress() {
		return sellAddress;
	}

	public void setSellAddress(String sellAddress) {
		this.sellAddress = sellAddress;
	}

	public String getSellTel() {
		return sellTel;
	}

	public void setSellTel(String sellTel) {
		this.sellTel = sellTel;
	}

	public BigDecimal getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(BigDecimal avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getBuildCom() {
		return buildCom;
	}

	public void setBuildCom(String buildCom) {
		this.buildCom = buildCom;
	}

	public String getProManCom() {
		return proManCom;
	}

	public void setProManCom(String proManCom) {
		this.proManCom = proManCom;
	}

	public String getProManFee() {
		return proManFee;
	}

	public void setProManFee(String proManFee) {
		this.proManFee = proManFee;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getZone() {
		return zone;
	}

	public void setZone(Integer zone) {
		this.zone = zone;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Transient
	public String getPic() {
		if (!StringUtil.strNullOrEmpty(this.getPics())) {
			if (this.getPics().contains("|")) {
				return this.getPics().substring(0, this.getPics().indexOf("|"));
			}
		}
		return pics;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getSpecial() {
		if (!StringUtil.strNullOrEmpty(special)) {
			return special.replaceAll(",", "，");
		}
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	@Column(columnDefinition = "TEXT")
	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public Integer getSlider() {
		return slider;
	}

	public void setSlider(Integer slider) {
		this.slider = slider;
	}

	@Column(columnDefinition = "TEXT")
	public String getDocs() {
		return docs;
	}

	public void setDocs(String docs) {
		this.docs = docs;
	}

	public Integer getIsTop() {
		return isTop;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}

	public Integer getOnSale() {
		return onSale;
	}

	public void setOnSale(Integer onSale) {
		this.onSale = onSale;
	}

	@Transient
	public String getBuildAreaStr() {

		if (null != this.getBuildArea()) {
			if (this.getBuildArea() >= 10000) {
				return this.getBuildArea() / 10000 + "万㎡";
			} else {
				return this.getBuildArea() + "㎡";
			}
		}
		return "";
	}

	public void setBuildAreaStr(String buildAreaStr) {
		this.buildAreaStr = buildAreaStr;
	}

	@Transient
	public String getRangeArea() {
		return rangeArea;
	}

	public void setRangeArea(String rangeArea) {
		this.rangeArea = rangeArea;
	}

	@Transient
	public String getRangeShi() {
		return rangeShi;
	}

	public void setRangeShi(String rangeShi) {
		this.rangeShi = rangeShi;
	}

	@Transient
	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

}
