package dawid.luczak.model.human.old;

import dawid.luczak.contract.Female;
import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Corps;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.adult.Adult;

public abstract class Old extends Adult {
	
	public static Old create(){
		return new Old(Adult.create()){};
	}
	
	protected Old(Adult adult){
		super(adult);
	}
	
	private Old(Old old){
		super(old);
	}
	
	@Override
	public Human copy() {
		return new Old(this) {};
	}
	
	@Override
	public Human growUp() {
		return new Corps(this);
	}
	
	@Override
	public Female getFemale() {
		return new OldWoman(this);
	}
	
	@Override
	public Male getMale() {
		return new OldMan(this);
	}
}
