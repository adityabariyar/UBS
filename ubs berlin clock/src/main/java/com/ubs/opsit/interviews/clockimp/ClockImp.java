package com.ubs.opsit.interviews.clockimp;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.ubs.opsit.interviews.clock.ClockObserver;
import com.ubs.opsit.interviews.clock.ClockSubject;

public class ClockImp implements ClockSubject{
    private ArrayList<ClockObserver> observers = new ArrayList<ClockObserver>();
    private String date;

	public ArrayList<ClockObserver> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<ClockObserver> observers) {
		this.observers = observers;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
		this.notifyObservers();
	}

	@Override
	public void registerObserver(ClockObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ClockObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Consumer<? super ClockObserver> consumerNames = time -> {
		    try {
		    	time.update(date);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		observers.stream().forEach(consumerNames);
	}

}
