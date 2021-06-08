package dawid.luczak.model.human.adult;

import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.old.Old;
import dawid.luczak.model.human.teenager.Teenager;

public abstract class Adult extends Teenager {
	
	public static Adult create(){
		return new Adult(Teenager.create()) {};
	}
	
	protected Adult(Teenager human){
		super(human);
	}
	
	private Adult(Adult source) {
		super(source);
		getPersonality().setHuman(this);
	}
	
	
	@Override
	public Human copy() {
		return new Adult(this){};
	}
	
	@Override
	public Human growUp() {
		return new Old(this) {};
	}
	
	@Override
	public Human getMale() {
		return new AdultMan(this);
	}
	
	@Override
	public Human getFemale() {
		return new AdultWoman(this);
	}
}
