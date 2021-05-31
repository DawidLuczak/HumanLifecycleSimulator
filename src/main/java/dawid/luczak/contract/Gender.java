package dawid.luczak.contract;

import java.time.LocalDateTime;

public interface Gender {
	
	char getGender();
	
	void setGender(char gender);
	
	String getGenderString();
	
	boolean isMale();
	
	boolean isFemale();
}


