package dawid.luczak.model.view.components;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
	
	public MyButton(String text){
		super(text);
		configButton();
	}
	
	public MyButton(String text, int width, int height){
		super(text);
		configButton();
		setSizes(width, height);
		
		invalidate();
		revalidate();
		repaint();
	}
	
	
	private void configButton(){
		setAlignmentX(LEFT_ALIGNMENT);
		setAlignmentY(TOP_ALIGNMENT);
		setVisible(true);
	}
	
	private void setSizes(int width, int height){
		setMinimumSize(new Dimension(width, height));
		setMaximumSize(new Dimension(width, height));
		setPreferredSize(new Dimension(width, height));
		setSize(width, height);
	}
}
