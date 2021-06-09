package dawid.luczak.model;

import dawid.luczak.model.human.Human;
import dawid.luczak.model.view.*;
import dawid.luczak.model.view.actionPanel.ActionPanel;


public class Controller {
	
	private final Family family;
	private final View view;
	private static final MyTimer TIMER = new MyTimer(1000, null);
	
	public Controller(){
		family = new Family();
		view = new View(this);
		TIMER.addActionListener(TIMER.actionListener(getGlobalInfoPanel()));
		TIMER.start();
	}
	
	public void addHumanToFamily(Human human){
		family.getHumanList().add(human);
	}
	
	public View getView() {
		return view;
	}
	
	public Family getFamily() {
		return family;
	}
	
	public Human getSelectedHuman(){
		return family.getHumanList().get(family.getSelectedIndex());
	}
	
	public HumanViewPanel getHumanViewPanel(){
		return view.getRootPanel().getHumanViewPanel();
	}
	
	public HumanListPanel getHumanListPanel(){
		return view.getRootPanel().getHumanListPanel();
	}
	
	public HumanInfoPanel getHumanInfoPanel(){
		return view.getRootPanel().getHumanInfoPanel();
	}
	
	public GlobalInfoPanel getGlobalInfoPanel(){
		return view.getRootPanel().getGlobalInfoPanel();
	}
	
	public ActionPanel getActionPanel(){
		return view.getRootPanel().getActionPanel();
	}
	
	public static MyTimer getTIMER() {
		return TIMER;
	}
}
