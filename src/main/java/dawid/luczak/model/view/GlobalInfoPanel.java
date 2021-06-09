package dawid.luczak.model.view;

import dawid.luczak.model.Controller;
import dawid.luczak.model.view.components.MyLabel;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GlobalInfoPanel extends JPanel {
	
	private MyLabel[] labels;
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
	
	GlobalInfoPanel(){
		super();
		initLabels();
		setDate(Controller.getTIMER().getDay(), Controller.getTIMER().getHour(), Controller.getTIMER().getMinute());
	}
	
	private void initLabels(){
		labels = new MyLabel[3];
		initDayLabel();
		initTimeLabel();
	}
	
	private void initDayLabel(){
		labels[0] = new MyLabel();
		add(labels[0]);
	}
	
	private void initTimeLabel(){
		labels[1] = new MyLabel();
		add(labels[1]);
	}
	
	public void setDate(int day, int hour, int minute){
		setDay(day);
		setTime(hour, minute);
	}
	
	public void setDay(int day){
		labels[0].setText("Day: " + day);
	}
	
	public void setTime(int hour, int minute){
		try {
			labels[1].setText("Time: " + dateFormat.format(dateFormat.parse(hour + ":" + minute)));
			invalidate();
			revalidate();
			repaint();
		} catch (ParseException e){
			e.printStackTrace();
		}
	}
	
	public MyLabel[] getLabels() {
		return labels;
	}
}