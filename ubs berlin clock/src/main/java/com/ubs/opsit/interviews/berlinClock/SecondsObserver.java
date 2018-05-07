package com.ubs.opsit.interviews.berlinClock;

import com.ubs.opsit.interviews.clock.ClockObserver;

public class SecondsObserver extends BerlinClock{

	public String update(String dateFormatted) throws Exception {
		int sec = Integer.parseInt(dateFormatted);
		validateTimeFormat(sec,"SS");
		String secondRow = sec%2 == 0 ? BerlinEnum.SECOND.toString() : Character.toString(BerlinEnum.OFF.toString().charAt(0));
		return secondRow;
	}

}
