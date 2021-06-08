package dawid.luczak.model.ability;

import dawid.luczak.model.ability.move.Move;

public class HumanAbilities {

	private final GroupOfAbilities[] abilities;
	
	public HumanAbilities(){
		abilities = new GroupOfAbilities[]{
				new Move()
		};
	}
	
	public GroupOfAbilities[] getAbilities() {
		return abilities;
	}
}
