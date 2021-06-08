package dawid.luczak.model.human.teenager;

import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.adult.Adult;
import dawid.luczak.model.human.kid.Kid;

public abstract class Teenager extends Kid {
	
	public static Teenager create(){
		return new Teenager(Kid.create()) {};
	}
	
	protected Teenager(Kid human){
		super(human);
	}
	
	protected Teenager(Teenager human){
		super(human);
		getPersonality().setHuman(this);
	}
	
	@Override
	public Human copy() {
		return new Teenager(this) {};
	}
	
	@Override
	public Human growUp() {
		return new Adult(this) {};
	}
	
	@Override
	public Human getFemale() {
		return new TeenGirl(this);
	}
	
	@Override
	public Human getMale() {
		return new TeenBoy(this);
	}
	
	

}
