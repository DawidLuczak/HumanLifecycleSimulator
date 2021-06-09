package dawid.luczak.model.view.components;

import dawid.luczak.model.Controller;
import dawid.luczak.model.Task;
import dawid.luczak.model.view.View;

import javax.swing.*;
import java.awt.*;


public class MyProgressBar extends JProgressBar {
	
	private final ProgressMonitor progressMonitor;
	private final Thread thread;
	
	public MyProgressBar(String title, String text, String action, final int duration, final int sleepTime, Task task, Controller controller){
		super(0, duration);
		this.configProgressBar(title);
		this.progressMonitor = configProgressMonitor(controller, action, text, duration);
		this.thread = thread(duration, sleepTime, task, controller);
		this.thread.start();
		
		revalidate();
		repaint();
	}
	
	private void configProgressBar(String title){
		setIndeterminate(true);
		setStringPainted(true);
		setValue(0);
		setName(title);
		setLocation(View.getCenterLocation(this));
		setMinimumSize(new Dimension(200, 200));
		setSize(new Dimension(200, 200));
		setVisible(true);
	}
	
	private ProgressMonitor configProgressMonitor(Controller controller, String action, String text, int duration){
		ProgressMonitor progressMonitor = new ProgressMonitor(controller.getActionPanel().getActionMenu(),
				"You are " + action + text, "", 0, duration);
		
		progressMonitor.setMillisToDecideToPopup(0);
		progressMonitor.setMillisToPopup(0);
		
		controller.getView().setEnabled(false);
		setIndeterminate(false);
		
		addPropertyChangeListener(evt -> {
			if (progressMonitor.isCanceled())
				thread.interrupt();
		});
		return progressMonitor;
	}
	
	private Thread thread(final int duration, final int sleepTime, Task task, Controller controller){
		return new Thread(
				() -> {
					try {
						for (int i = 0; i < duration; i++){
							progressMonitor.setProgress(i);
							setValue(i);
							setString(i + "");
							progressMonitor.setNote("Completed: " + (int)(getPercentComplete() * 100) + "%");
							
							invalidate();
							revalidate();
							repaint();
							Thread.sleep(sleepTime);
						}
						
						enableFrames(controller);
						task.start(controller);
						progressMonitor.close();
					}
					catch (InterruptedException ignored){
						progressMonitor.close();
						enableFrames(controller);
					}
				});
	}
	
	private void enableFrames(Controller controller){
		controller.getView().setEnabled(true);
		controller.getActionPanel().getActionMenu().dispose();
	}
	
}
