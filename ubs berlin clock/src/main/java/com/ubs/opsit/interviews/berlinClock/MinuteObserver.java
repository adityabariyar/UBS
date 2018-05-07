package com.ubs.opsit.interviews.berlinClock;

import com.ubs.opsit.interviews.clock.ClockObserver;

public class MinuteObserver extends BerlinClock{

	public String update(String dateFormatted) throws Exception {
		int min = Integer.parseInt(dateFormatted);
		validateTimeFormat(min,"MM");
		String minutesTopRow = BerlinClock.getFormat(min/5, BerlinEnum.MINUTE.toString());
		String minutesBottomRow = BerlinClock.getFormat(min%5, BerlinEnum.MINUTE_NEXT.toString());
		return minutesTopRow+System.lineSeparator()+minutesBottomRow;
	}
}
