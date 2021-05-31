package dawid.luczak.model;

import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Baby;
import dawid.luczak.model.human.Human;

public class BabyBoy extends Baby implements Male {
	
	public BabyBoy(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	@Override
	public void setSecondName(String secondName) {
	
	}
	
	@Override
	public void setThirdName(String thirdName) {
	
	}
	
	@Override
	public Human copy() {
		return null;
	}
	
	@Override
	public Human growUp() {
		return new KidBoy(this);
	}
	
	@Override
	public void happy() {
	
	}
	
	@Override
	public void excitement() {
	
	}
	
	@Override
	public void sad() {
	
	}
}
