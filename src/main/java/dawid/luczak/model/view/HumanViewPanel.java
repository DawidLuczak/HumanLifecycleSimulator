package dawid.luczak.model.view;

import dawid.luczak.model.human.Human;
import dawid.luczak.model.view.components.MyGridBagConstraint;
import dawid.luczak.model.view.components.MyLabel;

import javax.swing.*;
import java.awt.*;

public class HumanViewPanel extends JPanel{

	private MyLabel[] labels;
	private MyGridBagConstraint gridBagConstraint;
	
	HumanViewPanel(){
		super();
		configPanel();
		initLabels();
	}
	
	private void configPanel(){
		setLayout(new GridBagLayout());
		setVisible(true);
		setSize(new Dimension(500, 500));
		gridBagConstraint = new MyGridBagConstraint(0,0,1,1,1);
	}
	
	private void initLabels(){
		labels = new MyLabel[5];
		
		for (int i = 0; i < labels.length; i++){
			labels[i] = new MyLabel();
			labels[i].setHorizontalAlignment(SwingConstants.CENTER);
			labels[i].setHorizontalTextPosition(SwingConstants.CENTER);

			gridBagConstraint.gridy++;
			add(labels[i], gridBagConstraint);
		}
	}
	
	private String isAliveString(Human human){
		if (human.isAlive())
			return "I am alive!";
		else
			return "Guess. Who am I?";
	}
	
	private String genderString(Human human){
		if (human.getPersonality().isMale())
			return "male";
		else if (human.getPersonality().isFemale())
			return "female";
		else
			return "unknown";
	}
	
	private String isAdultString(Human human){
		if (human.getPersonality().isAdult())
			return "adult";
		else
			return "not adult";
	}
	
	public void setLabels(Human human){
		updateNameLabel(human);
		updateGenderLabel(human);
		updateDateOfBirthLabel(human);
		updateAgeLabel(human);
		updateLocationLabel(human);
		revalidate();
		repaint();
	}
	
	public void updateNameLabel(Human human){
		labels[0].setText(human.getPersonality().toString());
	}
	
	public void updateGenderLabel(Human human){
		labels[1].setText("Gender: " + genderString(human));
	}
	
	public void updateDateOfBirthLabel(Human human){
		labels[2].setText("Date of birth: " + human.getPersonality().getBirthDate().toLocalDate().toString() + ", " + isAliveString(human));
	}
	
	public void updateAgeLabel(Human human){
		labels[3].setText("Age: " + human.getPersonality().getAge() + ", " + isAdultString(human));
	}
	
	public void updateLocationLabel(Human human){
		labels[4].setText("Location: " + human.getLocation());
	}
}
