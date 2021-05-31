package dawid.luczak.model;

import dawid.luczak.contract.Female;
import dawid.luczak.model.human.Baby;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Kid;

public class KidGirl extends Kid implements Female {
	public KidGirl(Baby baby) {
		super(baby);
	}
	
	@Override
	public Human copy() {
		return null;
	}
	
	@Override
	public Human growUp() {
		return new TeenGirl(this);
	}
	
	@Override
	public void happy() {
		System.out.println("hihihi hihihi");
	}
	
	@Override
	public void excitement() {
		System.out.println("Chcę Ci coś pokazać!");
	}
	
	@Override
	public void sad() {
		System.out.println("BOJĘ SIĘ!");
	}
}
