package dawid.luczak.model.human;

import dawid.luczak.contract.human.HumanBeing;
import dawid.luczak.model.LocationEnum;
import dawid.luczak.model.ability.HumanAbilities;
import dawid.luczak.model.human.baby.Baby;
import dawid.luczak.model.organism.Organism;

import java.util.Objects;

public abstract class Human extends Organism implements HumanBeing
{
	private final Personality personality;
	private LocationEnum location;
	private final HumanAbilities abilities;
	
	public static Human create(){
		return new Human() {};
	}
	
	protected Human(){
		super();
		personality = new Personality(this, true);
		location = LocationEnum.SEA;
		abilities = new HumanAbilities();
	}
	
	protected Human(String firstName, String lastName){
		super();
		personality = new Personality(this, firstName, lastName);
		location = LocationEnum.SEA;
		abilities = new HumanAbilities();
	}
	
	protected Human(Human source){
		super();
		personality = new Personality(source);
		location = source.location;
		abilities = source.abilities;
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
	public void die() {

	}
	
	@Override
	public boolean isAlive() {
		return !(this instanceof Corps);
	}
	
	@Override
	public Personality getPersonality() {
		return personality;
	}
	
	
	@Override
	public Human getFemale() {
		return null;
	}
	
	@Override
	public Human getMale() {
		return null;
	}
	
	@Override
	public void setLocation(LocationEnum location) {
		this.location = location;
	}
	
	public LocationEnum getLocation() {
		return location;
	}
	
	public HumanAbilities getAbilities() {
		return abilities;
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
		return personality.toString();
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human)) return false;
		Human human = (Human) o;
		return getPersonality().equals(human.getPersonality()) && getLocation().equals(human.getLocation()) && getAbilities().equals(human.abilities);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getPersonality(), getLocation(), getAbilities());
	}
	
	
}
