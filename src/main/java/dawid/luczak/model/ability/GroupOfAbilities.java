package dawid.luczak.model.ability;

public abstract class GroupOfAbilities implements dawid.luczak.contract.ability.GroupOfAbilities {
	
	private Ability[] abilities;
	
	@Override
	public Ability[] getAbilities() {
		return abilities;
	}
	
	public void setAbilities(Ability[] abilities) {
		this.abilities = abilities;
	}
}
