package com.ubs.opsit.interviews.berlinClock;

import java.util.Arrays;

import com.ubs.opsit.interviews.clock.ClockObserver;

public class HoursObserver extends BerlinClock{
	
	public String update(String dateFormatted) throws Exception {
		int hours = Integer.parseInt(dateFormatted);
		validateTimeFormat(hours,"HH");
		String hoursTopRow = BerlinClock.getFormat(hours/5, BerlinEnum.HOUR.toString());
		String hoursBottomRow = BerlinClock.getFormat(hours%5, BerlinEnum.HOUR.toString());
		return hoursTopRow+System.lineSeparator()+hoursBottomRow;
	}
		
	
	
}
