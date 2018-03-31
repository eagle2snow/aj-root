package com.gm.base.dto;

import java.time.LocalDate;
import java.util.List;

/**
 * 预约时间表
 * 
 * @author ying
 *
 */
public class AppTable {
	private Integer id;
	private String name;
	private LocalDate date; // 时间
	private String dateStr;
	private List<App> apps;
	private boolean isCur = false;// 是否和预约时间同一天

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<App> getApps() {
		return apps;
	}

	public void setApps(List<App> apps) {
		this.apps = apps;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isCur() {
		return isCur;
	}

	public void setCur(boolean isCur) {
		this.isCur = isCur;
	}

}
