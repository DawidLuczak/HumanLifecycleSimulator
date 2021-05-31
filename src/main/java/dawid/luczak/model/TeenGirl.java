package dawid.luczak.model;

import dawid.luczak.contract.Female;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Kid;
import dawid.luczak.model.human.Teenager;

public class TeenGirl extends Teenager implements Female {
	
	protected TeenGirl(Kid kid){
		super(kid);
	}
	
	public TeenGirl(Teenager teen) {
		super(teen);
	}
	
	@Override
	public Human copy() {
		return new TeenGirl(this);
	}
	
	@Override
	public Human growUp() {
		return new AdultWoman(this);
	}
	
	@Override
	public void happy() {
		System.out.println("cool");
	}
	
	@Override
	public void excitement() {
		System.out.println("OMG");
	}
	
	@Override
	public void sad() {
		System.out.println("depresja");
	}
}
