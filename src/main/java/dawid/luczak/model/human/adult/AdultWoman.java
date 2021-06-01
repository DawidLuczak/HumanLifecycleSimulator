package dawid.luczak.model.human.adult;

import dawid.luczak.contract.Female;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.old.OldWoman;
import dawid.luczak.model.human.teenager.Teenager;

public class AdultWoman extends Adult implements Female {
	
	public AdultWoman(Teenager human){
		super(human);
	}
	
	AdultWoman(Adult human){
		super(human);
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
