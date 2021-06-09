package dawid.luczak.model.view.actionPanel;

import dawid.luczak.model.Controller;
import dawid.luczak.model.view.components.ActionButton;

import javax.swing.*;
import java.awt.*;

public class ActionPanel extends JPanel {
	
	private ActionDialogMenu actionMenu;
	
	public ActionPanel(Controller controller){
		super();
		configPanel();
		applyActionMenus(controller);
	}
	
	private void configPanel(){
		setLayout(new FlowLayout());
		setVisible(true);
		revalidate();
		repaint();
	}
	
	private void applyActionMenus(Controller controller){
		ActionButton[] actionButtons = new ActionButton[]{
				new ActionButton("Move")
		};
		
		actionButtons[0].addActionListener(e -> {
			if (controller.getFamily().validIndex() && controller.getSelectedHuman() != null)
				showActionMenu(new MoveActionMenu(controller));
		});
		
		for (ActionButton each : actionButtons){
			add(each);
		}
	}
	
	
	private void showActionMenu(ActionDialogMenu actionDialogMenu){
		if (actionMenu != null && actionMenu.isShowing())
			actionMenu.dispose();
		actionMenu = actionDialogMenu;
	}
	
	public ActionDialogMenu getActionMenu() {
		return actionMenu;
	}
}
