package dawid.luczak.model.view.actionPanel;

import dawid.luczak.model.ability.Ability;
import dawid.luczak.model.ability.GroupOfAbilities;
import dawid.luczak.model.view.View;
import dawid.luczak.model.view.components.MyButton;
import dawid.luczak.model.view.components.MyGridBagConstraint;
import dawid.luczak.model.view.components.MyLabel;

import javax.swing.*;
import java.awt.*;

public abstract class ActionDialogMenu extends JDialog {
	
	private final JComboBox<Ability> actionBox;
	private final MyLabel infoLabel;
	private final MyButton confirmButton;
	private final MyGridBagConstraint gridBagConstraint;
	
	ActionDialogMenu(GroupOfAbilities groupOfAbilities){
		actionBox = new JComboBox<>(groupOfAbilities.getAbilities());
		infoLabel = new MyLabel("Info");
		confirmButton = new MyButton("Confirm");
		gridBagConstraint = new MyGridBagConstraint(0, 0, 0, 0, 1);
		config();
	}
	
	private void config(){
		dialogInit();
		setVisible(true);
		setMinimumSize(new Dimension(400, 400));
		setPreferredSize(new Dimension(400, 400));
		setSize(new Dimension(400, 400));
		setLayout(new GridBagLayout());
		setAlwaysOnTop(true);
		setLocation(View.getCenterLocation(this));
		
		add(actionBox, gridBagConstraint);
		
		gridBagConstraint.gridy = 2;
		
		add(confirmButton, gridBagConstraint);
		
		gridBagConstraint.setGridPosition(2, 0);
		gridBagConstraint.gridheight = 2;
		
		add(infoLabel, gridBagConstraint);
	}
	
	public MyButton getConfirmButton() {
		return confirmButton;
	}
	
	public JComboBox<Ability> getActionBox() {
		return actionBox;
	}
	
	public MyGridBagConstraint getGridBagConstraint() {
		return gridBagConstraint;
	}
	
	public MyLabel getInfoLabel() {
		return infoLabel;
	}
}
