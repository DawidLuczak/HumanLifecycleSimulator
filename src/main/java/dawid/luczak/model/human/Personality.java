package dawid.luczak.model.human;

import dawid.luczak.contract.*;
import dawid.luczak.model.human.adult.Adult;

import java.time.LocalDateTime;
import java.util.Objects;

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
		nameUpdate();
	}
	
	@Override
	public void nameUpdate() {
		name = "";
		if (getFirstName() != null)
			name += getFirstName();
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
		nameUpdate();
	}
	
	@Override
	public String getSecondName() {
		return null;
	}
	
	@Override
	public void setSecondName(String secondName) {
		nameUpdate();
	}
	
	@Override
	public String getThirdName() {
		return null;
	}
	
	@Override
	public void setThirdName(String thirdName) {
		nameUpdate();
	}
	
	@Override
	public String getLastName() {
		return null;
	}
	
	@Override
	public void setLastName(String lastName) {
		nameUpdate();
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
	return this instanceof Adult;
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
	public Female getFemale() {
		return null;
	}
	
	@Override
	public Male getMale() {
		return null;
	}
	
	@Override
	public String getGenderString() {
		return isMale() ? "male" : isFemale() ? "female" : "unknown";
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Personality)) return false;
		Personality that = (Personality) o;
		return Objects.equals(getName(), that.getName()) && Objects.equals(dateOfBirth, that.dateOfBirth);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName(), dateOfBirth);
	}
}
