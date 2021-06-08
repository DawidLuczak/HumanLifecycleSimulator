package dawid.luczak.model.human.kid;


import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.baby.Baby;
import dawid.luczak.model.human.teenager.Teenager;

public abstract class Kid extends Baby {
	
	
	public static Kid create(){
		return new Kid(Baby.create()) {};
	}
	
	protected Kid(Baby human){
		super(human);
	}
	
	protected Kid(Kid human){
		super(human);
		getPersonality().setHuman(this);
	}
	
	@Override
	public Human copy() {
		return new Kid(this){};
	}
	
	@Override
	public Human growUp() {
		return new Teenager(this) {};
	}
	
	@Override
	public Human getMale() {
		return new KidBoy(this);
	}
	
	@Override
	public Human getFemale() {
		return new KidGirl(this);
	}

	
}
