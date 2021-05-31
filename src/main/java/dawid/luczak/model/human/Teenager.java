package dawid.luczak.model.human;

public abstract class Teenager extends Kid {
	private String thirdName;
	
	protected Teenager(Kid kid){
		super(kid);
		setNames(kid);
		nameUpdate();
	}
	
	protected Teenager(Teenager teenager){
		super(teenager);
		setNames(teenager);
		nameUpdate();
	}
	
	
	@Override
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	
	@Override
	public String getThirdName() {
		return thirdName;
	}
}
