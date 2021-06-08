package dawid.luczak.contract.human.personality;


import dawid.luczak.contract.human.Female;
import dawid.luczak.contract.human.Male;

public interface Gender {
	
	boolean isMale();
	
	boolean isFemale();
	
	Female getFemale();
	
	Male getMale();
}


