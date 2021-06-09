package dawid.luczak.model;

import dawid.luczak.model.ability.move.MovingAbility;
import dawid.luczak.model.view.actionPanel.MoveActionMenu;

public class MovingTask extends Task{
	
	public MovingTask(Controller controller) {
		super(controller);
	}
	
	@Override
	public void start(Controller controller) {
		super.start(controller);
		
		MoveActionMenu moveActionMenu = (MoveActionMenu) controller.getActionPanel().getActionMenu();
		MovingAbility ability = (MovingAbility) moveActionMenu.getActionBox().getSelectedItem();
		LocationEnum destination = (LocationEnum) moveActionMenu.getTargetBox().getSelectedItem();
		
		assert destination != null;
		int distance = controller.getSelectedHuman().getLocation().distance(destination);
		
		assert ability != null;
		
		ability.moveTo(controller.getSelectedHuman(), destination, distance);
		
		moveActionMenu.updateHumanInfoLabels(controller);
	}
	
}
