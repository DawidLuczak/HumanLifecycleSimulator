package dawid.luczak.model.view;


import dawid.luczak.model.Controller;
import dawid.luczak.model.view.components.MyButton;

import javax.swing.*;
import java.awt.*;


public class HumanListPanel extends JPanel {
	
	private HumanList humanList;
	private MyButton createButton, toggleButton;

	
	HumanListPanel(Controller controller){
		super();

		configPanel();
		applyToggleButton();
		applyCreateButton(controller);
		applyHumanList(controller);

		revalidate();
		repaint();
	}
	
	private void configPanel(){
		applyLayout();

		setAlignmentX(JPanel.LEFT_ALIGNMENT);
		setAlignmentY(JPanel.TOP_ALIGNMENT);
		setSize(new Dimension(200, 500));
		setPreferredSize(new Dimension(200, 500));
		applyBorder();
		setVisible(true);
	}

	private void applyLayout(){
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(layout);
	}
	
	private void applyHumanList(Controller controller){
		if (humanList != null)
			remove(humanList);
		
		humanList = new HumanList(controller.getFamily().getHumanList());
		humanList.addListSelectionListener(e -> selectListItem(controller));
		add(humanList);
		humanList.reload();
	}
	
	private void applyCreateButton(Controller controller){
		createButton = new MyButton("Create", 200, 40);
		createButton.addActionListener(e -> new CreationDialogPanel(controller));
		add(createButton);
	}
	
	private void applyToggleButton(){
		toggleButton = new MyButton("Toggle", 200, 60);
		toggleButton.addActionListener(e -> toggle());
		add(toggleButton);
	}
	
	private void toggle(){
		collapseListPanel(!humanList.isVisible());
	}
	
	private void collapseListPanel(Boolean condition){
		humanList.setVisible(condition);
		createButton.setVisible(condition);
		
		if (!condition) {
			setSize(200, 70);
			setBorder(null);
		} else {
			applyBorder();
		}
		
		invalidate();
		revalidate();
		repaint();
	}
	
	private void applyBorder(){
		setBorder(BorderFactory.createLoweredSoftBevelBorder());
	}
	
	private void updateHumanViewPanel(Controller controller){
		controller.getView().getRootPanel().getHumanViewPanel().setLabels(humanList.getSelectedValue());
	}
	
	private void updateListPanel(){
		toggleButton.setText(humanList.getSelectedValue().getPersonality().toString());
	}
	
	private void updateHumanInfoPanel(Controller controller){
		controller.getView().getRootPanel().getHumanInfoPanel().setLabels(humanList.getSelectedValue());
	}
	
	private void selectListItem(Controller controller){
		if (humanList.isAnySelected()) {
			controller.getFamily().setSelectedIndex(humanList.getSelectedIndex());
			updateHumanViewPanel(controller);
			updateHumanInfoPanel(controller);
			updateListPanel();
		}
	}
	
	public HumanList getHumanList() {
		return humanList;
	}
}
