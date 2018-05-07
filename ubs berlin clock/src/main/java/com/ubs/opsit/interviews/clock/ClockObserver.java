package com.ubs.opsit.interviews.clock;

public interface ClockObserver {
	public String update(String dateFormatted) throws Exception;
	public void validateTimeFormat(int dateFormatted,String format) throws Exception;
}
