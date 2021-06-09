package dawid.luczak.model.view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MyTextField extends JTextField {
	
	public MyTextField(String text){
		super();
		configTextField();
		setName(text);
		setText(getName());
		addValidator();
		
		revalidate();
		repaint();
	}
	
	private void configTextField(){
		setSize(new Dimension(200, 30));
		setPreferredSize(new Dimension(100, 30));
		setVisible(true);
	}
	
	
	private void addValidator(){
		addMouseListener(mouseValidator());
	}
	
	public MouseAdapter mouseValidator(){
		return new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (getText().equals(getName())){
					setText("");
				} else if (getText().equals("")){
					setText(getName());
				}
			}
		};
	}
	
	public boolean validTextField(){
		return getText().toLowerCase().contains(getName().toLowerCase());
	}
}
