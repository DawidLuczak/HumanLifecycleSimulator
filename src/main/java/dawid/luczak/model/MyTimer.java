package dawid.luczak.model;

import dawid.luczak.model.view.GlobalInfoPanel;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MyTimer extends Timer {
	
	private int day, hour, minute, seconds;
	
	public MyTimer(int delay, ActionListener actionListener){
		super(delay, actionListener);
		hour = 0;
		minute = 0;
		seconds = 0;
		day = 0;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	public void increaseDay(){
		this.day++;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void increaseHour() {
		this.hour++;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void increaseMinute(int minutes) {
		this.minute += minutes;
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void increaseSecond() {
		this.seconds++;
	}
	
	public ActionListener actionListener(GlobalInfoPanel globalInfoPanel){
		return e -> {
			increaseSecond();
			if (getSeconds() >= 60) {
				increaseMinute(10);
				setSeconds(0);
				globalInfoPanel.setTime(getHour(), getMinute());
				
				if (getMinute() >= 60) {
					setMinute(0);
					increaseHour();
					globalInfoPanel.setTime(getHour(), getMinute());
					
					if (getHour() == 24) {
						setHour(0);
						increaseDay();
						globalInfoPanel.setDate(getDay(), getHour(), getMinute());
					}
				}
			}
		};
	}
}
