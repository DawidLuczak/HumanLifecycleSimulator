package dawid.luczak.model.human.old;

import dawid.luczak.contract.human.Female;
import dawid.luczak.model.human.Corps;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.adult.Adult;

public class OldWoman extends Old implements Female {
	
	public OldWoman(Adult human){
		super(human);
	}
	
	OldWoman(Old human) {
		super(human);
		getPersonality().setHuman(this);
	}
	
	@Override
	public Human growUp() {
		return new Corps(this);
	}
	
	@Override
	public void happy() {
		System.out.println("I AM SO HAPPY.");
	}
	
	@Override
	public void excitement() {
		System.out.println("OH, IT'S TO MUCH!");
	}
	
	@Override
	public void sad() {
		System.out.println("IT'S NOTHING MATTERS.");
	}
}
