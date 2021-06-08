package dawid.luczak.model.human.adult;

import dawid.luczak.contract.human.Male;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.old.OldMan;
import dawid.luczak.model.human.teenager.Teenager;

public class AdultMan extends Adult implements Male {
	
	public AdultMan(Teenager human){
		super(human);
	}
	
	AdultMan(Adult human){
		super(human);
		getPersonality().setHuman(this);
	}
	
	@Override
	public Human growUp() {
		return new OldMan(this);
	}
	
	
	@Override
	public void happy() {
		System.out.println("I am happy.");
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
