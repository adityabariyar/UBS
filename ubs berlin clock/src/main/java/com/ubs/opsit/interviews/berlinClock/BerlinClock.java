package com.ubs.opsit.interviews.berlinClock;

import java.util.Arrays;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.clock.ClockObserver;

public class BerlinClock implements ClockObserver,TimeConverter {

	ClockObserver h = null;
	ClockObserver m = null;
	ClockObserver s = null;
	
	@Override
	public String update(String dateFormatted) throws Exception {
		return convertTime(dateFormatted);		
	}
	
	@Override
	public String convertTime(String dateFormatted) throws Exception {
		try {
			validateTimeFormat(dateFormatted);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			throw e1;
		}
		h = new HoursObserver();
		m = new MinuteObserver();
		s = new SecondsObserver();
		StringBuilder berlinDateTimeFormat = null;
		try {
			berlinDateTimeFormat = new StringBuilder(s.update(dateFormatted.split(":")[2])
					+System.lineSeparator()+ h.update(dateFormatted.split(":")[0]) 
					+ System.lineSeparator()+m.update(dateFormatted.split(":")[1]));
			System.out.println(berlinDateTimeFormat.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			return String.valueOf(berlinDateTimeFormat);
		}
	}
	
	public static String getFormat(int lamps, String lampFOrDate) {
		char[] row = BerlinEnum.toChars(lampFOrDate.toString());
		Arrays.fill(row, lamps, row.length, 'O');
		return String.valueOf(row);
	}
	
	@Override
	public void validateTimeFormat(int dateFormatted,String format) throws Exception{
		switch(format){
			case "HH" : if (dateFormatted< 0 || dateFormatted> 24) {
							throw new IllegalArgumentException("hours should fall between 0 - 24");
				}
			break;
			case "MM" : if (dateFormatted < 0 || dateFormatted> 59) {
							throw new IllegalArgumentException("Minutes should fall between 0 - 59");
				}
			break;
			case "SS" : if (dateFormatted < 0 || dateFormatted> 59) {
				throw new IllegalArgumentException("Minutes should fall between 0 - 59");
			}
			break;
		}
	}
	
	public void validateTimeFormat(String dateFormatted) throws Exception{
		if(Integer.parseInt(dateFormatted.split(":")[0])==24 &&
				(Integer.parseInt(dateFormatted.split(":")[1])>0
				|| Integer.parseInt(dateFormatted.split(":")[2])>0)){
			throw new IllegalArgumentException("Incorrect time since it can never be more than 24hours::: Max time can be 24:00:00");
		}
	}
	
}
