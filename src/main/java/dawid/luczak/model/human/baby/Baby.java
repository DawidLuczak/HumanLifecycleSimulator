package dawid.luczak.model.human.baby;

import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.kid.Kid;

public abstract class Baby extends Human {
	
	public static Baby create(){
		return new Baby() {};
	}
	
	private Baby(){
		super();
	}
	
	protected Baby(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	protected Baby(Baby human) {
		super(human);
		getPersonality().setHuman(this);
	}
	
	@Override
	public Human copy() {
		return new Baby(this){};
	}
	
	@Override
	public Human growUp() {
		return new Kid(this){};
	}
	
	@Override
	public Human getFemale() {
		return new BabyGirl(this);
	}
	
	@Override
	public Human getMale() {
		return new BabyBoy(this);
	}
	

}
