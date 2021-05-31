package dawid.luczak.model;

import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Adult;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Old;

public class OldMan extends Old implements Male {
	
	public OldMan(Adult human){
		super(human);
	}
	
	public OldMan(Old human){
		super(human);
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
