package dawid.luczak.model.human.adult;

import dawid.luczak.contract.Female;
import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.old.Old;
import dawid.luczak.model.human.teenager.Teenager;

public abstract class Adult extends Teenager {
	
	public static Adult create(){
		return new Adult(Teenager.create()) {};
	}
	
	private Adult(Adult source) {
		super(source);
	}
	
	protected Adult(Teenager human){
		super(human);
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
	public Male getMale() {
		return new AdultMan(this);
	}
	
	@Override
	public Female getFemale() {
		return new AdultWoman(this);
	}
}
