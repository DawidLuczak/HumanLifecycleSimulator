package dawid.luczak.model.human;

import dawid.luczak.model.Corps;
import dawid.luczak.model.KidBoy;
import dawid.luczak.model.KidGirl;

public abstract class Kid extends Baby {
	
	private String secondName;
	
	protected Kid(Baby baby){
		super(baby);
		nameUpdate();
	}
	
	protected Kid(Kid kid){
		super(kid);
		setSecondName(kid.getSecondName());
	}
	
	public Kid hello(){
		if (isMale()){
			return new KidBoy(this);
		} else if (isFemale()) {
			return new KidGirl(this);
		} else {
			return new Kid(this) {
				@Override
				public Human growUp() {
					return new Teenager(this) {
						@Override
						public Human growUp() {
							return new Adult(this) {
								@Override
								public Human growUp() {
									return new Old(this) {
										@Override
										public Human growUp() {
											return new Corps(this);
										}
									};
								}
							};
						}
					};
				}
			};
		}
		
	}
	
	@Override
	public void setSecondName(String secondName) {
		this.secondName = secondName;
		nameUpdate();
	}
	
	@Override
	public String getSecondName() {
		return secondName;
	}
	
	@Override
	public void setThirdName(String thirdName) {
	
	}
}
