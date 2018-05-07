package com.ubs.opsit.interviews.main;

import com.ubs.opsit.interviews.berlinClock.BerlinClock;
import com.ubs.opsit.interviews.berlinClock.HoursObserver;
import com.ubs.opsit.interviews.berlinClock.MinuteObserver;
import com.ubs.opsit.interviews.berlinClock.SecondsObserver;
import com.ubs.opsit.interviews.clock.ClockObserver;
import com.ubs.opsit.interviews.clockimp.ClockImp;

public class ClockMain {
	public static void main(String[] args) throws Exception {
		ClockImp imp = new ClockImp();
		ClockObserver chms = new BerlinClock();
		imp.registerObserver(chms);
		imp.setDate("23:59:59");
	}
}
