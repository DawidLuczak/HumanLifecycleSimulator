package dawid.luczak.model.view;

import dawid.luczak.model.Controller;
import dawid.luczak.model.view.actionPanel.ActionPanel;
import dawid.luczak.model.view.components.MyGridBagConstraint;

import javax.swing.*;
import java.awt.*;


public class RootPanel extends JRootPane {
	
	private MyGridBagConstraint gridBagConstraint;
	private HumanListPanel humanListPanel;
	private HumanViewPanel humanViewPanel;
	private ActionPanel actionPanel;
	private GlobalInfoPanel globalInfoPanel;
	private HumanInfoPanel humanInfoPanel;
	
	RootPanel(Controller controller){
		super();
		configPanel(controller);
	}
	
	private void configPanel(Controller controller){
		applyGridBagConstraints();
		applyHumanViewPanel();
		applyGlobalInfoPanel();
		applyHumanInfoPanel();
		applyHumanListPanel(controller);
		applyActionPanel(controller);
		setVisible(true);
		invalidate();
		revalidate();
		repaint();
	}
	
	private void applyGridBagConstraints(){
		setLayout(new GridBagLayout());
		gridBagConstraint = new MyGridBagConstraint(1,0,1,1, 8, 4,1);
	}
	
	private void applyHumanListPanel(Controller controller){
		humanListPanel = new HumanListPanel(controller);
		gridBagConstraint.gridy = 2;
		gridBagConstraint.setGridSize(1, 3);
		add(humanListPanel, gridBagConstraint);
	}
	
	private void applyHumanViewPanel(){
		humanViewPanel = new HumanViewPanel();
		add(humanViewPanel, gridBagConstraint);
	}
	
	private void applyGlobalInfoPanel(){
		globalInfoPanel = new GlobalInfoPanel();
		gridBagConstraint.setGridBagConstraint(0,0, 0, 0, 1, 1, 1);
		add(globalInfoPanel, gridBagConstraint);
	}
	
	private void applyHumanInfoPanel(){
		humanInfoPanel = new HumanInfoPanel();
		gridBagConstraint.gridy = 1;
		add(humanInfoPanel, gridBagConstraint);
	}
	
	private void applyActionPanel(Controller controller){
		actionPanel = new ActionPanel(controller);
		gridBagConstraint.setGridPosition(1,4);
		gridBagConstraint.setGridSize(8,2);
		add(actionPanel, gridBagConstraint);
	}
	
	public HumanListPanel getHumanListPanel() {
		return humanListPanel;
	}
	
	public HumanViewPanel getHumanViewPanel() {
		return humanViewPanel;
	}
	
	public HumanInfoPanel getHumanInfoPanel() {
		return humanInfoPanel;
	}
	
	public GlobalInfoPanel getGlobalInfoPanel() {
		return globalInfoPanel;
	}
	
	public ActionPanel getActionPanel() {
		return actionPanel;
	}
}
