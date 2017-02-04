package com.picoplaca.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import com.picoplaca.exception.GetDigitException;

/**
 * @author luish.falcones
 *
 */
public class Utilitario {
	
	public Integer digitLast(String plate) throws GetDigitException{
		int x = Character.getNumericValue(plate.charAt(plate.length()-1));
		if(isInteger(x)){
			return x;
		}else{
			throw new GetDigitException();
		}

	}
	
	private int getDayOfMonthInt(Date aDate) {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(aDate);
	    return cal.get(Calendar.DAY_OF_WEEK);
	}
	
	private Boolean isInteger(Integer last){
		if(last > 9){
			return false;
		}else{
			return true;
		}
	}
	
	public Date toDate(String dateStr) throws ParseException{
		Date myDefaultDate = new SimpleDateFormat( "yyyyMMdd" ).parse( dateStr);
		return myDefaultDate;
	}
	
	private DayWeekEnum getdayOfWeekStr(Date date){
		
		int day = getDayOfMonthInt(date);
		switch (day) {
		case 2:
			return DayWeekEnum.MONDAY;
		case 3:
			return DayWeekEnum.TUESDAY;
		case 4:
			return DayWeekEnum.WEDNESDAY;
		case 5:
			return DayWeekEnum.THURSDAY;
		case 6:
			return DayWeekEnum.FRIDAY;
		default:
			return DayWeekEnum.NO_HAVE;
		}
	}
	
	private DayWeekEnum dayHavePicoPlaca(Integer plate){
		if(plate.equals(DayWeekEnum.MONDAY.getOneDay())|| plate.equals(DayWeekEnum.MONDAY.getDayTwo())){
			return DayWeekEnum.MONDAY;
		}else if(plate.equals(DayWeekEnum.TUESDAY.getOneDay())|| plate.equals(DayWeekEnum.TUESDAY.getDayTwo())){
			return DayWeekEnum.TUESDAY;
		}else if(plate.equals(DayWeekEnum.WEDNESDAY.getOneDay())|| plate.equals(DayWeekEnum.WEDNESDAY.getDayTwo())){
			return DayWeekEnum.WEDNESDAY;
		}else if(plate.equals(DayWeekEnum.THURSDAY.getOneDay())|| plate.equals(DayWeekEnum.THURSDAY.getDayTwo())){
			return DayWeekEnum.THURSDAY;
		}else if(plate.equals(DayWeekEnum.FRIDAY.getOneDay())|| plate.equals(DayWeekEnum.FRIDAY.getDayTwo())){
			return DayWeekEnum.FRIDAY;
		}else{
			return DayWeekEnum.NO_HAVE;
		}
	}
	
	public Boolean havePicoPlaca(Integer digit, Date dateT, String hora){
		DayWeekEnum plate = dayHavePicoPlaca(digit);
		DayWeekEnum day = getdayOfWeekStr(dateT);
		if(day.getDayStr().equals(plate.getDayStr()) && isSchedule(hora)){
			return true;
		}else{
			return false;
		}
	}
	
	
	private Boolean isSchedule(String hora){
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime hour = LocalTime.parse(hora,format);
		return isSchedulePicoPlaca(Constantes.START_MORNING, Constantes.END_MORNING, hour) || isSchedulePicoPlaca(Constantes.START_AFTERNOON, Constantes.END_AFTERNOON, hour);
		
	}
	
	private Boolean isSchedulePicoPlaca(LocalTime star, LocalTime end, LocalTime hour){
		if(hour.isAfter(star) && hour.isBefore(end)){
			return true;
		}else{
			return false;
		}
	}
	
}
