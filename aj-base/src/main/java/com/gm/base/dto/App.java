package com.gm.base.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 预约
 * 
 * @author ying
 *
 */
public class App {
	private LocalDateTime time;
	private String timeStr;
	private Long num = 0L;
	private boolean can;
	private boolean isCur = false; // 是否和预约时间相等

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public boolean isCan() {
		return can;
	}

	public void setCan(boolean can) {
		this.can = can;
	}

	public String getTimeStr() {
		return timeStr;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
	}

	public boolean isCur() {
		return isCur;
	}

	public void setCur(boolean isCur) {
		this.isCur = isCur;
	}
}
