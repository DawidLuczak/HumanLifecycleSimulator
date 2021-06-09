package dawid.luczak.model.view.actionPanel;

import dawid.luczak.model.Controller;
import dawid.luczak.model.LocationEnum;
import dawid.luczak.model.MovingTask;
import dawid.luczak.model.ability.move.MovingAbility;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.view.components.MyProgressBar;

import javax.swing.*;
import java.util.Objects;

public class MoveActionMenu extends ActionDialogMenu {
	
	private JComboBox<LocationEnum> targetBox;
	
	MoveActionMenu(Controller controller) {
		super(controller.getSelectedHuman().getAbilities().getAbilities()[0]);
		applyTargetBox(controller.getSelectedHuman());
		addConfirmButtonListener(controller);
	}
	
	
	private void applyTargetBox(Human human){
		LocationEnum[] locations = new LocationEnum[]{
				LocationEnum.SEA, LocationEnum.BEACH, LocationEnum.WILD_ROAD,
				LocationEnum.FOREST, LocationEnum.MEADOW, LocationEnum.TOWN, LocationEnum.CITY
		};
		targetBox = new JComboBox<>(locations);
		targetBox.addItemListener(e -> updateInfoLabel(human));
		getActionBox().addItemListener(e -> updateInfoLabel(human));
		
		getGridBagConstraint().setGridPosition(0, 1);
		getGridBagConstraint().gridheight = 1;
		add(targetBox, getGridBagConstraint());
	}
	
	private void addConfirmButtonListener(Controller controller){
		getConfirmButton().addActionListener(e -> action(controller));
	}
	
	private void action(Controller controller){
		if (getActionBox().getSelectedItem() != null) {
			MovingAbility ability = (MovingAbility) getActionBox().getSelectedItem();
			LocationEnum destination = (LocationEnum) targetBox.getSelectedItem();
			
			assert destination != null;
			int distance = ability.ifCanMoveReturnDistance(controller.getSelectedHuman(), destination);
			
			if (distance > 0) {
				setEnabled(false);
				
				new MyProgressBar("Moving...", "to the " + destination, ability + "ing ",
						(int)(controller.getSelectedHuman().getLocation().distance(destination) / ability.getEnergyConsumption()),
						1000, new MovingTask(controller), controller);
				
			}
		}
	}
	
	public void updateHumanInfoLabels(Controller controller){
		controller.getHumanViewPanel().updateLocationLabel(controller.getSelectedHuman());
		controller.getHumanInfoPanel().updateEnergyLabel(controller.getSelectedHuman());
	}
	
	private void updateInfoLabel(Human human){
		int distance = human.getLocation().distance((LocationEnum) Objects.requireNonNull(targetBox.getSelectedItem()));
		MovingAbility ability = (MovingAbility) Objects.requireNonNull(getActionBox().getSelectedItem());
		
		getInfoLabel().setText("<html>" +
				"Distance: " + distance + "<br>Duration: " + (int) (distance/ability.getEnergyConsumption()) + "</html>");
		
	}
	
	public JComboBox<LocationEnum> getTargetBox() {
		return targetBox;
	}
}
