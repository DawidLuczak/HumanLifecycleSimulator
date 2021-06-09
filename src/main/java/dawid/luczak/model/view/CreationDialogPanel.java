package dawid.luczak.model.view;

import dawid.luczak.model.Controller;
import dawid.luczak.model.human.baby.BabyBoy;
import dawid.luczak.model.human.baby.BabyGirl;
import dawid.luczak.model.view.components.MyButton;
import dawid.luczak.model.view.components.MyGridBagConstraint;
import dawid.luczak.model.view.components.MyLabel;
import dawid.luczak.model.view.components.MyTextField;

import javax.swing.*;
import java.awt.*;


public class CreationDialogPanel extends JDialog {
	
	private MyTextField[] textFields;
	private MyGridBagConstraint gridBagConstraint;
	private JRadioButton maleButton, femaleButton;
	
	CreationDialogPanel(Controller controller){
		super();
		dialogInit();
		configDialogPanel();
		initInputFields();
		initCreateButton(controller);
		initGenderButtonsAndLabel();
		setVisible(true);
	}
	
	
	private void configDialogPanel(){
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(new Dimension(300, 300));
		setAlwaysOnTop(true);
		setLocation(View.getCenterLocation(this));
		
		gridBagConstraint = new MyGridBagConstraint(0,0,1,1,0);
	}
	
	private void initInputFields(){
		textFields = new MyTextField[2];
		textFields[0] = new MyTextField("First Name");
		textFields[1] = new MyTextField("Last Name");
		
		for (MyTextField each : textFields){
			add(each, gridBagConstraint);
			gridBagConstraint.gridy++;
		}
	}
	
	private void initCreateButton(Controller controller){
		MyButton createButton = new MyButton("Create");
		createButton.addActionListener(e -> createHuman(controller));
		gridBagConstraint.gridy++;
		add(createButton, gridBagConstraint);
	}
	
	private void initGenderButtonsAndLabel(){
		initGenderLabel();
		initFemaleButton();
		initMaleButton();
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(maleButton);
		buttonGroup.add(femaleButton);

	}
	
	private void initMaleButton(){
		maleButton = new JRadioButton("Male");
		gridBagConstraint.gridx++;
		add(maleButton, gridBagConstraint);
	}
	
	private void initFemaleButton(){
		femaleButton = new JRadioButton("Female");
		femaleButton.setSelected(true);
		gridBagConstraint.gridx++;
		add(femaleButton, gridBagConstraint);
	}
	
	private void initGenderLabel(){
		JLabel genderLabel = new MyLabel("Gender: ");
		gridBagConstraint.setGridPosition(1, 0);
		add(genderLabel, gridBagConstraint);
	}
	
	private boolean validInputFields(){
		if (textFields[0].getText().length() < 3 || textFields[0].validTextField()) {
			textFields[0].setForeground(Color.RED);
			return false;
		}
		if (textFields[1].getText().length() < 3 || textFields[1].validTextField()) {
			textFields[1].setForeground(Color.RED);
			
			return false;
		}
		
		return true;
	}
	
	
	private void createHuman(Controller controller){
		if (validInputFields()) {
			if (maleButton.isSelected())
				controller.addHumanToFamily(new BabyBoy(textFields[0].getText(), textFields[1].getText()));
			else
				controller.addHumanToFamily(new BabyGirl(textFields[0].getText(), textFields[1].getText()));
			
			controller.getView().setHumanListData(controller);
			dispose();
		}
	}

	private void close(){
	
	}
}
