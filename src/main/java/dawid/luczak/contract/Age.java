package dawid.luczak.contract;

import java.time.LocalDateTime;

public interface Age {
	
		LocalDateTime getBirthDate();
		
		int getAge();
		
		int getDaysToBirthday();
		
		boolean isAdult();
}
