package dawid.luczak.model.view;

import dawid.luczak.model.human.Human;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class HumanList extends JList<Human> {
	
	
	HumanList(Vector<Human> humans){
		super(humans);
		configList();
		reload();
	}
	
	private void configList(){
		setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		setSize(new Dimension(200, 400));
		setAlignmentX(LEFT_ALIGNMENT);
		setAlignmentY(TOP_ALIGNMENT);
		setBackground(null);
		setFixedCellHeight(30);
		setLayoutOrientation(HORIZONTAL_WRAP);
		setVisible(true);
	}
	
	public void reload(){
		revalidate();
		repaint();
	}
	
	public boolean isAnySelected(){
		return getSelectedValue() != null;
	}
}
