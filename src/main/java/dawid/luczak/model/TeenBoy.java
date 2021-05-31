package dawid.luczak.model;

import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Kid;
import dawid.luczak.model.human.Teenager;

public class TeenBoy extends Teenager implements Male {
	
	public TeenBoy(Kid kid){
		super(kid);
	}
	
	public TeenBoy(Teenager teen){
		super(teen);
	}
	
	
	@Override
	public Human copy() {
		return null;
	}
	
	@Override
	public Human growUp() {
		return new AdultMan(this);
	}
	
	@Override
	public void happy() {
		System.out.println("I CAN BE MORE HAPPY.");
	}
	
	@Override
	public void excitement() {
		System.out.println("THAT IS EXACTLY WHAT I EXPECTED.");
	}
	
	@Override
	public void sad() {
		System.out.println("YOU PROBABLY WONT UNDERSTAND ME.");
	}
}
