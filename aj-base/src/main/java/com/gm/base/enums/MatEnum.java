package com.gm.base.enums;

/***
 * 消息类型枚举
 * 
 * @author Administrator
 *
 */
public enum MatEnum {

	冰箱("a"), 空调("b"), 洗衣机("c"), 热水器("d"), 电视("e"), 宽带("f"), 沙发("g"), 床("h"), 衣柜("i"), 独立卫生间("j"), 阳台("k"), 暖气("l"), 车位(
			"m");
	// 成员变量
	private String index;

	private MatEnum(String index) {
		this.index = index;
	}

	public static String getName(String index) {
		for (MatEnum c : MatEnum.values()) {
			if (c.getIndex().equals(index)) {
				return c.name();
			}
		}
		return null;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
}
