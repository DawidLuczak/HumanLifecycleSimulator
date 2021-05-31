package dawid.luczak.model;

import dawid.luczak.contract.Female;
import dawid.luczak.model.human.Adult;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Teenager;

public class AdultWoman extends Adult implements Female {
	
	public AdultWoman(Teenager teen){
		super(teen);
	}
	
	public AdultWoman(Adult adult){
		super(adult);
	}
	
	@Override
	public Human growUp() {
		return new OldWoman(this);
	}
	
	@Override
	public void happy() {
		System.out.println("I AM THANKFUL.");
	}
	
	@Override
	public void excitement() {
		System.out.println("I AM STRONGER!");
	}
	
	@Override
	public void sad() {
		System.out.println("I WILL FACE IT ALONE!");
	}
}
