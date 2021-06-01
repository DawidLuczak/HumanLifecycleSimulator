package dawid.luczak.model.human;

import dawid.luczak.contract.HumanBeing;
import dawid.luczak.model.human.baby.Baby;

public abstract class Human extends Personality implements HumanBeing
{
	
	public static Human create(){
		return new Human() {};
	}
	
	protected Human(){
		super();
	}
	
	protected Human(Human source){
		super(source);
	}
	
	@Override
	public Human copy() {
		return new Human(this) {};
	}
	
	@Override
	public Human growUp() {
		return Baby.create();
	}
	
	
	@Override
	public boolean isAlive() {
		return !(this instanceof Corps);
	}
	
	/*	OTHER  */
	
	@Override
	public void happy() {
		System.out.println("I AM HAPPY.");
	}
	
	@Override
	public void excitement() {
		System.out.println("I AM EXCITED!");
	}
	
	@Override
	public void sad() {
		System.out.println("I AM SAD.");
	}
	
	@Override
	public String toString() {
		return getName() + "\n" +
							 getGenderString() + "\n" +
							 getBirthDate().toLocalDate() + ", age: " + getAge() + "\n"
							 + "Adult?: " + isAdult() + "\n";
	}
}
