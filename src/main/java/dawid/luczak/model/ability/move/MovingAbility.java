package dawid.luczak.model.ability.move;

import dawid.luczak.model.LocationEnum;
import dawid.luczak.model.ability.Ability;
import dawid.luczak.model.human.Human;

public abstract class MovingAbility extends Ability {
	
	
	MovingAbility(){
		super();
	}
	
	
	public abstract boolean moveTo(Human human, LocationEnum targetLocation);
	
	
}
