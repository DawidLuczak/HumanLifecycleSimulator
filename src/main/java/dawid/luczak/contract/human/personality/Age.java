package dawid.luczak.contract.human.personality;

import java.time.LocalDateTime;

public interface Age {
	
		LocalDateTime getBirthDate();
		
		int getAge();
		
		int getDaysToBirthday();
		
		boolean isAdult();
}
