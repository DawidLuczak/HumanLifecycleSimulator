package dawid.luczak.model.human.teenager;

import dawid.luczak.contract.human.Male;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.adult.AdultMan;
import dawid.luczak.model.human.kid.Kid;

public class TeenBoy extends Teenager implements Male {
	
	public TeenBoy(Kid human){
		super(human);
	}
	
	TeenBoy(Teenager human){
		super(human);
		getPersonality().setHuman(this);
	}
	
	
	@Override
	public Human copy() {
		return new TeenBoy(this);
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
