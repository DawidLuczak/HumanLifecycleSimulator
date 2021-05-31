package dawid.luczak.model;

import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Adult;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Teenager;

public class AdultMan extends Adult implements Male {
	
	public AdultMan(Teenager teen){
		super(teen);
	}
	
	public AdultMan(Adult adult){
		super(adult);
	}
	
	@Override
	public Human growUp() {
		return new OldMan(this);
	}
	
	
	@Override
	public void happy() {
		System.out.println("I am happy!");
	}
	
	@Override
	public void excitement() {
		System.out.println("OH, FUCK YEAH!");
	}
	
	@Override
	public void sad() {
		System.out.println("I CAN CRY!");
	}
}
