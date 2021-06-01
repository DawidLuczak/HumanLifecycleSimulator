package dawid.luczak.model.human.teenager;

import dawid.luczak.contract.Female;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.adult.AdultWoman;
import dawid.luczak.model.human.kid.Kid;

public class TeenGirl extends Teenager implements Female {
	
	public TeenGirl(Kid human){
		super(human);
	}
	
	TeenGirl(Teenager human) {
		super(human);
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
