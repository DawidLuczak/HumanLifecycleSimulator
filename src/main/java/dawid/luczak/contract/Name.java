package dawid.luczak.contract;

import dawid.luczak.model.human.Human;

public interface Name {
	
	String getName();
	
	void setName(String name);
	
	void nameUpdate();
	
	void setNames(Human source);
	
	String getFirstName();
	
	void setFirstName(String firstName);
	
	String getSecondName();
	
	void setSecondName(String secondName);
	
	String getThirdName();
	
	void setThirdName(String thirdName);
	
	String getLastName();
	
	void setLastName(String lastName);
}
