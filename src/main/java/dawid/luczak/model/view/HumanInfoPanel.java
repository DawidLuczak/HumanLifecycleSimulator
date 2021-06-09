package dawid.luczak.model.view;

import dawid.luczak.model.human.Human;
import dawid.luczak.model.view.components.MyLabel;

import javax.swing.*;


public class HumanInfoPanel extends JPanel {
	
	private MyLabel[] labels;

	HumanInfoPanel(){
		super();
		configPanel();
		initLabels();
	}
	
	private void configPanel(){
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(layout);
		
		setVisible(true);
		revalidate();
		repaint();
	}
	
	private void initLabels(){
		labels = new MyLabel[3];
		for (int i = 0; i < labels.length; i++){
			labels[i] = new MyLabel();
			add(labels[i]);
		}
	}
	
	public void setLabels(Human human){
		updateEnergyLabel(human);
		updateThirstLabel(human);
		updateHungerLabel(human);
	}
	
	public void updateEnergyLabel(Human human){
		labels[0].setText(human.getLifeStatistics().getLifeStatistics()[0].toString("Energy"));
	}
	
	public void updateThirstLabel(Human human){
		labels[1].setText(human.getLifeStatistics().getLifeStatistics()[1].toString("Thirst"));
	}
	
	public void updateHungerLabel(Human human){
		labels[2].setText(human.getLifeStatistics().getLifeStatistics()[2].toString("Hunger"));
	}
}
