package com.ubs.opsit.interviews.clock;

public interface ClockSubject {
	
	public void registerObserver(ClockObserver observer);

    public void removeObserver(ClockObserver observer);

    public void notifyObservers();
}
