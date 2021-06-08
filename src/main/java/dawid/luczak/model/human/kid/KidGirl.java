package dawid.luczak.model.human.kid;

import dawid.luczak.contract.human.Female;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.baby.Baby;
import dawid.luczak.model.human.teenager.TeenGirl;

public class KidGirl extends Kid implements Female {
	
	public KidGirl(Baby baby) {
		super(baby);
	}
	
	KidGirl(Kid kid) {
		super(kid);
		getPersonality().setHuman(this);
	}
	
	@Override
	public Human copy() {
		return null;
	}
	
	@Override
	public Human growUp() {
		return new TeenGirl(this);
	}
	
	@Override
	public void happy() {
		System.out.println("hihihi hihihi");
	}
	
	@Override
	public void excitement() {
		System.out.println("Chcę Ci coś pokazać!");
	}
	
	@Override
	public void sad() {
		System.out.println("BOJĘ SIĘ!");
	}
}
