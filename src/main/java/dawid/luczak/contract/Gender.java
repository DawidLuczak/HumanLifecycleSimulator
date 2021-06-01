package dawid.luczak.contract;


public interface Gender {
	
	char getGender();
	
	void setGender(char gender);
	
	String getGenderString();
	
	boolean isMale();
	
	boolean isFemale();
	
	Female getFemale();
	
	Male getMale();
}


