package dawid.luczak.model.human.teenager;

import dawid.luczak.contract.Female;
import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.adult.Adult;
import dawid.luczak.model.human.kid.Kid;

public abstract class Teenager extends Kid {
	
	private String thirdName;
	
	
	public static Teenager create(){
		return new Teenager(Kid.create()) {};
	}
	
	protected Teenager(Kid human){
		super(human);
	}
	
	protected Teenager(Teenager human){
		super(human);
		setThirdName(human.thirdName);
	}
	
	@Override
	public Human copy() {
		return new Teenager(this) {};
	}
	
	@Override
	public Human growUp() {
		return new Adult(this) {};
	}
	
	@Override
	public Female getFemale() {
		return new TeenGirl(this);
	}
	
	@Override
	public Male getMale() {
		return new TeenBoy(this);
	}
	
	@Override
	public String getThirdName() {
		return thirdName;
	}
	
	@Override
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
		nameUpdate();
	}
	

}
