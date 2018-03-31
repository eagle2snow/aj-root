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
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;
import com.gm.utils.StringUtil;

import net.bytebuddy.asm.Advice.This;

/**
 * 二手房
 * 
 * @author ying
 *
 */
@M("二手房")
@Entity(name = "house")
@Table(name = "aj_house")
public class House extends Model {
	@FormField(type = FieldType.TEXTINPUT, label = "编号")
	private String code; // 编号
	@FormField(type = FieldType.SELECT, label = "小区", dataNature = DataNature.MODEL, ds = Premise.class)
	private Premise premise;// 小区
	@FormField(type = FieldType.TEXTINPUT, label = "室")
	private Integer shi = 0;// 室
	@FormField(type = FieldType.TEXTINPUT, label = "厅")
	private Integer ting = 0;// 厅
	@FormField(type = FieldType.TEXTINPUT, label = "卫")
	private Integer wei = 0;// 卫
	@FormField(type = FieldType.TEXTINPUT, label = "阳台")
	private Integer yang =0;// 阳台
	@FormField(type = FieldType.SELECT, label = "装修程度", data = "1|毛坯,2|简装,3|精装,4|豪华装")
	private Integer fix;// 装修程度
	@FormField(type = FieldType.TEXTINPUT, label = "地址")
	private String address;// 地址
	@FormField(type = FieldType.TEXTINPUT, label = "房屋面积")
	private Integer area;// 房屋面积
	@FormField(type = FieldType.TEXTINPUT, label = "总价")
	private BigDecimal price; // 总价
	@FormField(type = FieldType.TEXTINPUT, label = "建造年份")
	private String year;// 建造年份
	@FormField(type = FieldType.SELECT, data = "1|朝东,2|朝南,3|朝西,4|朝北,5|东南,6|东北,7|西南,8|西北,9|南北通透", label = "朝向")
	private Integer face;// 朝向
	@FormField(type = FieldType.TEXTINPUT, label = "参考首付")
	private BigDecimal downPayment;// 参考首付
	@FormField(type = FieldType.SELECT, data = "1|住宅,2|别墅,3|商住,4|商铺,5|其他", label = "物业类型")
	private Integer type;// 物业类型
	@FormField(type = FieldType.TEXTINPUT, label = "所在楼层")
	private String floor;// 所在楼层
	private String floors;// 总楼层
	private String doorplate;// 门牌
	private String lifts;// 几梯几户

	@FormField(type = FieldType.TEXTINPUT, label = "月供")
	private BigDecimal monthPayment;// 月供
	@FormField(type = FieldType.TEXTINPUT, label = "交通")
	private String traffic;// 交通
	@FormField(type = FieldType.TEXTINPUT, label = "银行")
	private String bank;// 银行
	@FormField(type = FieldType.TEXTINPUT, label = "学校")
	private String school;// 学校
	@FormField(type = FieldType.TEXTINPUT, label = "医院")
	private String hospital;// 医院
	@FormField(type = FieldType.TEXTINPUT, label = "停车位")
	private String park;// 停车位
	@FormField(type = FieldType.PICTURE, label = "户型图")
	private String pic;// 户型图
	@FormField(type = FieldType.PICTURELIST, label = "室内图")
	private String pics;// 室内图
	@FormField(type = FieldType.TEXTINPUT, label = "特色")
	private String special;// 特色
	@FormField(type = FieldType.TEXTINPUT, label = "业主姓名")
	private String owner;// 房东
	@FormField(type = FieldType.TEXTINPUT, label = "业主电话")
	private String ownerTel;// 房东电话

	private Integer zone;// 区域 ，1海城，2银海，3铁山港，4合浦

	private User user;// 所属员工

	private String facePic;// 封面图

	private String notice;// 公告

	private Integer slider = 2;// 1首页轮播，2非首页轮播

	private String docs;// 文档

	private Integer isTop = 2;// 置顶
	private Integer onSale = 2;// 特价房，1是，2否
	private BigDecimal unitPrice;// 单价
	private String proManFee;// 物业费
	private Integer equity;// 产权状况，1满五唯一，2满五不唯一，3满二唯一，4满二不唯一，5购房合同书
	private Integer certStatus;// 产证情况：1现证，2有抵押

	private Integer payType;// 付款方式：1一次性，2可贷款
	private Integer lookTime;// 看房时间 ：1随时看房，2预约看房，3视频看房
	private Integer houseStatus;// 房屋状态：1业主住，2租客住，3空房
	private Integer tranFee;// 过户费用：1业主净收，2业主承担，3一家一半

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@ManyToOne
	public Premise getPremise() {
		return premise;
	}

	public void setPremise(Premise premise) {
		this.premise = premise;
	}

	public Integer getShi() {
		return shi;
	}

	public void setShi(Integer shi) {
		this.shi = shi;
	}

	public Integer getTing() {
		return ting;
	}

	public void setTing(Integer ting) {
		this.ting = ting;
	}

	public Integer getWei() {
		return wei;
	}

	public void setWei(Integer wei) {
		this.wei = wei;
	}

	public Integer getYang() {
		return yang;
	}

	public void setYang(Integer yang) {
		this.yang = yang;
	}

	public Integer getFix() {
		return fix;
	}

	public void setFix(Integer fix) {
		this.fix = fix;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getFace() {
		return face;
	}

	public void setFace(Integer face) {
		this.face = face;
	}

	public BigDecimal getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(BigDecimal downPayment) {
		this.downPayment = downPayment;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public BigDecimal getMonthPayment() {
		return monthPayment;
	}

	public void setMonthPayment(BigDecimal monthPayment) {
		this.monthPayment = monthPayment;
	}

	public String getTraffic() {
		return traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getPark() {
		return park;
	}

	public void setPark(String park) {
		this.park = park;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Column(columnDefinition = "TEXT")
	public String getPics() {
		return pics;
	}

	public void setPics(String pics) {
		this.pics = pics;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerTel() {
		return ownerTel;
	}

	public void setOwnerTel(String ownerTel) {
		this.ownerTel = ownerTel;
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
	public String getFacePic() {
		if (!StringUtil.strNullOrEmpty(this.getPics())) {
			if (this.getPics().contains("|")) {
				return this.getPics().substring(0, this.getPics().indexOf("|"));
			}
		}
		return facePic;
	}

	public void setFacePic(String facePic) {
		this.facePic = facePic;
	}

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

	public String getFloors() {
		return floors;
	}

	public void setFloors(String floors) {
		this.floors = floors;
	}

	@Transient
	public BigDecimal getUnitPrice() {
		return this.price.multiply(BigDecimal.valueOf(10000)).divide(BigDecimal.valueOf(this.area), 0,
				BigDecimal.ROUND_HALF_UP);
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getLifts() {
		return lifts;
	}

	public void setLifts(String lifts) {
		this.lifts = lifts;
	}

	public String getProManFee() {
		return proManFee;
	}

	public void setProManFee(String proManFee) {
		this.proManFee = proManFee;
	}

	public Integer getEquity() {
		return equity;
	}

	public void setEquity(Integer equity) {
		this.equity = equity;
	}

	public Integer getCertStatus() {
		return certStatus;
	}

	public void setCertStatus(Integer certStatus) {
		this.certStatus = certStatus;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getLookTime() {
		return lookTime;
	}

	public void setLookTime(Integer lookTime) {
		this.lookTime = lookTime;
	}

	public Integer getHouseStatus() {
		return houseStatus;
	}

	public void setHouseStatus(Integer houseStatus) {
		this.houseStatus = houseStatus;
	}

	public Integer getTranFee() {
		return tranFee;
	}

	public void setTranFee(Integer tranFee) {
		this.tranFee = tranFee;
	}

	public String getDoorplate() {
		return doorplate;
	}

	public void setDoorplate(String doorplate) {
		this.doorplate = doorplate;
	}

}
