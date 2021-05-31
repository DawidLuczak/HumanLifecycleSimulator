package dawid.luczak.model;

import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Baby;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Kid;

public class KidBoy extends Kid implements Male {
	
	public KidBoy(Baby baby) {
		super(baby);
	}
	
	
	@Override
	public Human copy() {
		return null;
	}
	
	@Override
	public Human growUp() {
		return new TeenBoy(this);
	}
	
	@Override
	public void happy() {
		System.out.println("IT'S EASY.");
	}
	
	@Override
	public void excitement() {
		System.out.println("WHO IS THE BEST?");
	}
	
	@Override
	public void sad() {
		System.out.println("WHAT IS WRONG WITH ME?");
	}
}
