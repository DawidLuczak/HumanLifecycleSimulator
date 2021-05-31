package dawid.luczak.model;

import dawid.luczak.contract.Female;
import dawid.luczak.model.human.Adult;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Old;

public class OldWoman extends Old implements Female {
	
	public OldWoman(Adult human){
		super(human);
	}
	
	public OldWoman(Old human) {
		super(human);
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
