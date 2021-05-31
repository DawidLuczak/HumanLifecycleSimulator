package dawid.luczak.model.human;

import dawid.luczak.model.AdultMan;
import dawid.luczak.model.AdultWoman;
import dawid.luczak.model.Corps;

public abstract class Adult extends Teenager {
	
	protected Adult(Teenager teenager){
		super(teenager);
		setNames(teenager);
		nameUpdate();
	}
	
	@Override
	public Human copy() {
		if (isMale()) {
			return new AdultMan((AdultMan) this);
		} else if (isFemale()) {
			return new AdultWoman((AdultWoman) this);
		} else {
			return new Adult(this) {
				@Override
				public Human growUp() {
					return new Old(this){
						@Override
						public Human growUp() {
							return new Corps(this);
						}
					};
				}
			};
		}
	}
	
	@Override
	public void happy() {
	
	}
	
	@Override
	public void excitement() {
	
	}
	
	@Override
	public void sad() {
	
	}
}
