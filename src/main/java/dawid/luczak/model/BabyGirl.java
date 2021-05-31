package dawid.luczak.model;

import dawid.luczak.contract.Female;
import dawid.luczak.model.human.Baby;
import dawid.luczak.model.human.Human;

public class BabyGirl extends Baby implements Female {
	
	public BabyGirl(String firstName, String lastName) {
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
		return new KidGirl(this);
	}
	
	@Override
	public void happy() {
		System.out.println("LaLAla hihi");
	}
	
	@Override
	public void excitement() {
		System.out.println("I AM SO PRETTY ;)");
	}
	
	@Override
	public void sad() {
		System.out.println("I AM CRYING!");
	}
}
