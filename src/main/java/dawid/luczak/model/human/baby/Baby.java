package dawid.luczak.model.human.baby;

import dawid.luczak.contract.Female;
import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.kid.Kid;

public abstract class Baby extends Human {
	
	private String firstName, lastName;
	
	public static Baby create(){
		return new Baby() {};
	}
	
	private Baby(){
		super();
	}
	
	protected Baby(String firstName, String lastName){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		nameUpdate();
	}
	
	protected Baby(Baby human) {
		super(human);
		this.firstName = human.getFirstName();
		this.lastName = human.getLastName();
		nameUpdate();
	}
	
	
	@Override
	public Human copy() {
		return new Baby(this){};
	}
	
	@Override
	public Human growUp() {
		return new Kid(this){};
	}
	
	@Override
	public Female getFemale() {
		return new BabyGirl(this);
	}
	
	@Override
	public Male getMale() {
		return new BabyBoy(this);
	}
	
	@Override
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		nameUpdate();
	}
	
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
		nameUpdate();
	}
}
