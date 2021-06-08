package dawid.luczak.model.human;

import dawid.luczak.contract.human.Female;
import dawid.luczak.contract.human.Male;
import dawid.luczak.contract.human.personality.PersonalityInterface;
import dawid.luczak.model.human.adult.Adult;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Personality implements PersonalityInterface {
	
	private final List<String> names;
	private final LocalDateTime dateOfBirth;
	private Human human;
	
	Personality(Human human, Boolean empty){
		this.dateOfBirth = LocalDateTime.now();
		this.names = new ArrayList<>();
		this.human = human;
	}
	
	Personality(Human human, String firstName, String lastName){
		this.dateOfBirth = LocalDateTime.now();
		this.names = new ArrayList<>();
		this.names.add(firstName);
		this.names.add(lastName);
		this.human = human;
	}
	
	Personality(Human human){
		this.dateOfBirth = LocalDateTime.of(human.getPersonality().dateOfBirth.toLocalDate(), human.getPersonality().dateOfBirth.toLocalTime());
		this.names = new ArrayList<>();
		this.names.addAll(List.copyOf(human.getPersonality().names));
	}
	
	Personality(Personality personality){
		this.dateOfBirth = personality.getBirthDate();
		this.names = personality.getNames();
		this.human = personality.human;
	}
	
	
	public Personality copyTo(Human human){
		Personality copy = new Personality(this);
		copy.setHuman(human);
		return copy;
	}
	
/*	NAMES  */
	
	
	public void setHuman(Human human) {
		this.human = human;
	}
	
	@Override
	public List<String> getNames() {
		return names;
	}
	
	@Override
	public String getFirstName() {
		if (names.size() > 0)
			return names.get(0);
		else
			return "";
	}
	
	@Override
	public void setFirstName(String firstName) {
		if (names.size() > 0)
			names.set(0, firstName);
		else
			names.add(0, firstName);
	}
	
	@Override
	public String getSecondName() {
		if (names.size() > 2)
			return names.get(1);
		else
			return "";
	}
	
	@Override
	public void setSecondName(String secondName) {
		if (names.size() > 2)
			names.set(1, secondName);
		else
			names.add(1, secondName);
	}
	
	@Override
	public String getThirdName() {
		if (names.size() > 3)
			return names.get(2);
		else
			return "";
	}
	
	@Override
	public void setThirdName(String thirdName) {
		if (names.size() > 3)
			names.set(3, thirdName);
		else
			names.add(3, thirdName);
	}
	
	@Override
	public String getLastName() {
		if (names.size() > 1)
			return names.get(names.size() - 1);
		else
			return "";
	}
	
	@Override
	public void setLastName(String lastName) {
		if (names.size() > 1)
			names.set(names.size() - 1, lastName);
		else
			names.add(names.size(), lastName);
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
		return human instanceof Adult;
	}
	
	@Override
	public int getDaysToBirthday() {
	return 0;
	}
	
	
/*	GENDER  */
	

	@Override
	public boolean isFemale() {
		return human instanceof Female;
	}
	
	@Override
	public boolean isMale() {
		return human instanceof Male;
	}
	
	@Override
	public Female getFemale() {
		return null;
	}
	
	@Override
	public Male getMale() {
		return null;
	}
	
	public boolean compareGenders(Human other){
		if (isMale())
			return other.getPersonality().isMale();
		else if (isFemale())
			return other.getPersonality().isFemale();
		else
			return !other.getPersonality().isFemale() && !other.getPersonality().isMale();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Personality)) return false;
		Personality that = (Personality) o;
		return getNames().equals(that.getNames()) && Objects.equals(dateOfBirth, that.dateOfBirth) && compareGenders(that.human);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getNames(), dateOfBirth, human);
	}
	
	@Override
	public String toString() {
		StringBuilder name = new StringBuilder();
		
		if (!getFirstName().isBlank())
			name.append(getFirstName());
		
		if (!getSecondName().isBlank())
			name.append(" ").append(getSecondName());
		
		if (!getThirdName().isBlank())
			name.append(" ").append(getThirdName());
		
		if (!getLastName().isBlank())
			name.append(" ").append(getLastName());
		
		return name.toString();
	}
}
