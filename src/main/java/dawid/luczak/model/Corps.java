package dawid.luczak.model;

import dawid.luczak.model.human.Human;

public class Corps extends Human {
	
	private char gender;
	
	public Corps(Human source){
		super(source);
		setName(source.getName());
		setGender(source.getGender());
	}
	
	public Corps(OldMan source){
		super(source);
		setName(source.getName());
		setGender(source.getGender());
	}
	
	@Override
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public char getGender() {
		return gender;
	}
	
	@Override
	public String getGenderString() {
		return gender == 'm' ? "male" : gender == 'f' ? "female" : "unknown";
	}
	
	
	@Override
	public Human growUp() {
		return new Ghost(this);
	}

}
