package dawid.luczak.model.human.old;

import dawid.luczak.contract.human.Male;
import dawid.luczak.model.human.Corps;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.adult.Adult;

public class OldMan extends Old implements Male {
	
	public OldMan(Adult human){
		super(human);
	}
	
	OldMan(Old human){
		super(human);
		getPersonality().setHuman(this);
	}
	
	@Override
	public Human growUp() {
		return new Corps(this);
	}
	
	@Override
	public void happy() {
		System.out.println("HEHE");
	}
	
	@Override
	public void excitement() {
		System.out.println("I LOVE IT!");
	}
	
	@Override
	public void sad() {
		System.out.println("THAT IS NOT SUPPOSED TO BE LIKE THAT!");
	}
}
