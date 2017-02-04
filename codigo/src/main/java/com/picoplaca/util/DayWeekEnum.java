package com.picoplaca.util;

public enum DayWeekEnum {

	MONDAY(1,2,"LUNES",2),
	TUESDAY(3,4,"MARTES",3),
	WEDNESDAY(5,6,"MIERCOLES",4),
	THURSDAY(7,8,"JUEVES",5),
	FRIDAY(9,0,"VIERNES",6),
	NO_HAVE(11,11,"WEEKEND",1);

	private Integer oneDay;
	private Integer dayTwo;
	private String dayStr;
	private Integer dayWeek;
	
	private DayWeekEnum(Integer oneDay, Integer dayTwo, String dayStr, Integer dayWeek) {
		this.oneDay = oneDay;
		this.dayTwo = dayTwo;
		this.dayStr = dayStr;
		this.dayWeek = dayWeek;
	}
	public Integer getOneDay() {
		return oneDay;
	}
	public void setOneDay(Integer oneDay) {
		this.oneDay = oneDay;
	}
	public Integer getDayTwo() {
		return dayTwo;
	}
	public void setDayTwo(Integer dayTwo) {
		this.dayTwo = dayTwo;
	}
	public String getDayStr() {
		return dayStr;
	}
	public void setDayStr(String dayStr) {
		this.dayStr = dayStr;
	}
	public Integer getDayWeek() {
		return dayWeek;
	}
	public void setDayWeek(Integer dayWeek) {
		this.dayWeek = dayWeek;
	}

}
