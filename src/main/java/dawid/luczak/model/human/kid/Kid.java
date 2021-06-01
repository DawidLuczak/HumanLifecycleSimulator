package dawid.luczak.model.human.kid;


import dawid.luczak.contract.Female;
import dawid.luczak.contract.Male;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.baby.Baby;
import dawid.luczak.model.human.teenager.Teenager;

public abstract class Kid extends Baby {
	
	private String secondName;
	
	public static Kid create(){
		return new Kid(Baby.create()) {};
	}
	
	protected Kid(Baby human){
		super(human);
		nameUpdate();
	}
	
	protected Kid(Kid human){
		super(human);
		setSecondName(human.getSecondName());
	}
	
	@Override
	public Human copy() {
		return new Kid(this){};
	}
	
	@Override
	public Human growUp() {
		return new Teenager(this) {};
	}
	
	@Override
	public Male getMale() {
		return new KidBoy(this);
	}
	
	@Override
	public Female getFemale() {
		return new KidGirl(this);
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
	
	
}
