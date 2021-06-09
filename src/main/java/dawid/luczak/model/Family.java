package dawid.luczak.model;

import dawid.luczak.model.human.Human;

import java.util.Vector;

public class Family {
	
	private final Vector<Human> humanList;
	private int selectedIndex;
	
	Family(){
		humanList = new Vector<>();
	}
	
	public Vector<Human> getHumanList() {
		return humanList;
	}
	
	public int getSelectedIndex() {
		return selectedIndex;
	}
	
	public boolean validIndex(){
		return selectedIndex < humanList.size();
	}
	
	public void setSelectedIndex(int selectedIndex) {
		this.selectedIndex = selectedIndex;
	}
}
