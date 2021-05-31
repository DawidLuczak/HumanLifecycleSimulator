package dawid.luczak.model.human;

public abstract class Baby extends Human{
	
	private String firstName, lastName;
	
	protected Baby(String firstName, String lastName){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		nameUpdate();
	}
	
	Baby(Baby baby) {
		super();
		this.firstName = baby.getFirstName();
		this.lastName = baby.getLastName();
		nameUpdate();
	}
	
	
	@Override
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
