package dawid.luczak.model.human.baby;

import dawid.luczak.contract.Female;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.kid.KidGirl;

public class BabyGirl extends Baby implements Female {
	
	public BabyGirl(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public BabyGirl(Baby human) {
		super(human);
	}
	
	@Override
	public Human growUp() {
		return new KidGirl(this);
	}
	
	@Override
	public void happy() {
		System.out.println("LaLAla hihi");
	}
	
	@Override
	public void excitement() {
		System.out.println("I AM SO PRETTY ;)");
	}
	
	@Override
	public void sad() {
		System.out.println("I AM CRYING!");
	}
}
