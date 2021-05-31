package dawid.luczak.model.human;

import dawid.luczak.contract.*;

import java.time.LocalDateTime;

public abstract class Personality implements Name, Age, Gender {
	private String name;
	private final LocalDateTime dateOfBirth;
	
	Personality(){
		dateOfBirth = LocalDateTime.now();
	}
	
	Personality(Human human){
		this.name = human.getName();
		this.dateOfBirth = human.getBirthDate();
	}
	
	
/*	NAMES  */
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setNames(Human source) {
		setFirstName(source.getFirstName());
		setSecondName(source.getSecondName());
		setThirdName(source.getThirdName());
		setLastName(source.getLastName());
	}
	
	@Override
	public void nameUpdate() {
		if (getFirstName() != null)
			name = getFirstName();
		if (getSecondName() != null)
			name += " " + getSecondName();
		if (getThirdName() != null)
			name += " " + getThirdName();
		if (getLastName() != null)
			name += " " + getLastName();
	}
	
	@Override
	public String getFirstName() {
		return null;
	}
	
	@Override
	public void setFirstName(String firstName) {
	
	}
	
	@Override
	public String getSecondName() {
		return null;
	}
	
	@Override
	public void setSecondName(String secondName) {
	
	}
	
	@Override
	public String getThirdName() {
		return null;
	}
	
	@Override
	public void setThirdName(String thirdName) {
	
	}
	
	@Override
	public String getLastName() {
		return null;
	}
	
	@Override
	public void setLastName(String lastName) {
	
	}
	
	
/*	AGE  */
	
	@Override
	public LocalDateTime getBirthDate() {
		return dateOfBirth;
	}
	
	@Override
	public int getAge() {
		return LocalDateTime.now().getYear() - dateOfBirth.getYear();
	}
	
	@Override
	public boolean isAdult() {
	return getAge() >= 18;
	}
	
	@Override
	public int getDaysToBirthday() {
	return 0;
	}
	
/*	GENDER  */
	@Override
	public char getGender() {
		return isMale() ? 'm' : isFemale() ? 'f' : 'u';
	}
	
	@Override
	public void setGender(char gender) {}
	
	@Override
	public boolean isFemale() {
		return this instanceof Female;
	}
	
	@Override
	public boolean isMale() {
		return this instanceof Male;
	}
	
	@Override
	public String getGenderString() {
		return isMale() ? "male" : isFemale() ? "female" : "unknown";
	}
	
	
}
