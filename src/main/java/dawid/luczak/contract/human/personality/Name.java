package dawid.luczak.contract.human.personality;

import java.util.List;

public interface Name {
	
	List<String> getNames();
	
	String getFirstName();
	
	void setFirstName(String firstName);
	
	String getSecondName();
	
	void setSecondName(String secondName);
	
	String getThirdName();
	
	void setThirdName(String thirdName);
	
	String getLastName();
	
	void setLastName(String lastName);
}
