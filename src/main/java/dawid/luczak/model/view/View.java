package dawid.luczak.model.view;

import dawid.luczak.model.Controller;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
	
	private final RootPanel rootPanel;
	public final static int SCREEN_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
	public final static int SCREEN_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	public View(Controller controller){
		initFrame();
		
		rootPanel = new RootPanel(controller);
		setContentPane(rootPanel);
		
		revalidate();
		repaint();
	}
	
	
	private void initFrame(){
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(new Dimension(SCREEN_WIDTH * 4 / 5, SCREEN_HEIGHT * 4 / 5));
		setVisible(true);
		setAlwaysOnTop(true);
		setLocation((SCREEN_WIDTH - getWidth()) / 2, (SCREEN_HEIGHT - getHeight()) / 2);
	}
	
	public RootPanel getRootPanel() {
		return rootPanel;
	}
	
	public void setHumanListData(Controller controller){
		getRootPanel().getHumanListPanel().getHumanList().setListData(controller.getFamily().getHumanList());
	}
	
	public static Point getCenterLocation(Accessible component){
		return new Point((SCREEN_WIDTH - component.getAccessibleContext().getAccessibleComponent().getSize().width) / 2,
				(SCREEN_HEIGHT - component.getAccessibleContext().getAccessibleComponent().getSize().height) / 2);
	}

}
