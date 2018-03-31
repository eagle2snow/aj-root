package com.gm.base.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.gm.base.enums.MatEnum;
import com.gm.base.model.sys.User;
import com.gm.gencode.annotation.FormField;
import com.gm.gencode.annotation.M;
import com.gm.gencode.util.DataNature;
import com.gm.gencode.util.FieldType;
import com.gm.utils.StringUtil;

/**
 * 租房
 * 
 * @author ying
 *
 */
@M("租房")
@Entity(name = "tenement")
@Table(name = "aj_tenement")
public class Tenement extends Model {
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
	private Integer yang = 0;// 阳台
	@FormField(type = FieldType.SELECT, label = "装修程度", data = "1|毛坯,2|简装,3|精装,4|豪华装")
	private Integer fix;// 装修程度
	@FormField(type = FieldType.TEXTINPUT, label = "地址")
	private String address;// 地址
	@FormField(type = FieldType.TEXTINPUT, label = "房屋面积")
	private Integer area;// 房屋面积
	@FormField(type = FieldType.TEXTINPUT, label = "月租")
	private BigDecimal price; // 月租
	@FormField(type = FieldType.TEXTINPUT, label = "押")
	private Integer ya;// 押
	@FormField(type = FieldType.TEXTINPUT, label = "付")
	private Integer fu;// 付
	@FormField(type = FieldType.TEXTINPUT, label = "起租月数")
	private Integer mixMonth;// 起租月数
	@FormField(type = FieldType.TEXTINPUT, label = "建造年份")
	private String year;// 建造年份
	@FormField(type = FieldType.SELECT, data = "1|朝东,2|朝南,3|朝西,4|朝北,5|东南,6|东北,7|西南,8|西北,9|南北通透", label = "朝向")
	private Integer face;// 朝向
	@FormField(type = FieldType.SELECT, data = "1|住宅,2|别墅,3|商住,4|商铺,5|其他", label = "物业类型")
	private Integer type;// 物业类型
	@FormField(type = FieldType.TEXTINPUT, label = "所在楼层")
	private String floor;// 所在楼层
	@FormField(type = FieldType.TEXTINPUT, label = "交通")
	private String traffic;// 交通
	@FormField(type = FieldType.PICTURELIST, label = "室内图")
	private String pics;// 室内图
	@FormField(type = FieldType.CHECKBOX, label = "配套", data = "a|冰箱,b|空调,c|洗衣机,d|热水器,e|电视,f|宽带,g|沙发,h|床,i|衣柜,j|独立卫生间,k|阳台,l|暖气,m|车位")
	private String mat;// 配套
	@FormField(type = FieldType.TEXTINPUT, label = "房东姓名")
	private String owner;// 房东
	@FormField(type = FieldType.TEXTINPUT, label = "房东电话")
	private String ownerTel;// 房东电话
	@FormField(type = FieldType.TEXTINPUT, label = "特色")
	private String special;// 特色

	@FormField(type = FieldType.RADIO, label = "出租状态", data = "1|待出租,2|已租出")
	private Integer status = 1;

	private String pic;// 封面图

	private String matStr;// 配套显示

	private Integer zone;// 区域 ，1海城，2银海，3铁山港，4合浦

	private User user;// 所属员工

	private String notice;// 公告

	private Integer slider = 2;// 1首页轮播，2非首页轮播

	private String docs;// 文档

	private Integer isTop = 2;// 置顶

	private String proManFee;

	private String lifts;// 几梯几户

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLifts() {
		return lifts;
	}

	public void setLifts(String lifts) {
		this.lifts = lifts;
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

	public Integer getYa() {
		return ya;
	}

	public void setYa(Integer ya) {
		this.ya = ya;
	}

	public Integer getFu() {
		return fu;
	}

	public void setFu(Integer fu) {
		this.fu = fu;
	}

	public Integer getMixMonth() {
		return mixMonth;
	}

	public void setMixMonth(Integer mixMonth) {
		this.mixMonth = mixMonth;
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

	public String getTraffic() {
		return traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	@Column(columnDefinition = "TEXT")
	public String getPics() {
		return pics;
	}

	public void setPics(String pics) {
		this.pics = pics;
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
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

	public String getSpecial() {
		if (!StringUtil.strNullOrEmpty(special)) {
			return special.replaceAll(",", "，");
		}
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	@Transient
	public String getMatStr() {
		if (!StringUtil.strNullOrEmpty(this.getMat())) {
			String[] list = StringUtil.split(this.getMat(), ",");
			List<String> matStrList = new ArrayList<>();
			for (String s : list) {
				matStrList.add(MatEnum.getName(s));
			}
			return String.join(",", matStrList);
		}
		return matStr;
	}

	public void setMatStr(String matStr) {
		this.matStr = matStr;
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

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public String getProManFee() {
		return proManFee;
	}

	public void setProManFee(String proManFee) {
		this.proManFee = proManFee;
	}

}
