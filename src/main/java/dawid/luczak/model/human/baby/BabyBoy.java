package dawid.luczak.model.human.baby;

import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.kid.KidBoy;

public class BabyBoy extends Baby implements Male {
	
	public BabyBoy(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	BabyBoy(Baby human){
		super(human);
	}
	
	
	@Override
	public Human copy() {
		return new BabyBoy(this);
	}
	
	@Override
	public Human growUp() {
		return new KidBoy(this);
	}
	
	@Override
	public void happy() {
	
	}
	
	@Override
	public void excitement() {
	
	}
	
	@Override
	public void sad() {
	
	}
}
