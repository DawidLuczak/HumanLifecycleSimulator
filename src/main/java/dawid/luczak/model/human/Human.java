package dawid.luczak.model.human;

import dawid.luczak.contract.HumanBeing;
import dawid.luczak.model.*;

public abstract class Human extends Personality implements HumanBeing
{
	public Human(){
		super();
	}
	
	protected Human(Human source){
		super(source);
	}
	
	@Override
	public boolean isAlive() {
		return !(this instanceof Corps);
	}
	
	/*	OTHER  */
	@Override
	public String toString() {
		return getName() + "\n" +
							 getGenderString() + "\n" +
							 getBirthDate().toLocalDate() + ", age: " + getAge();
	}
	
	
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
	public Human copy() {
		return null;
	}
}
