package dawid.luczak.model.ability.move;

import dawid.luczak.model.LocationEnum;
import dawid.luczak.model.human.Human;

public class Run extends MovingAbility{
	
	
	Run(){
		super();
	}
	
	@Override
	public boolean moveTo(Human human, LocationEnum targetLocation) {
		int distance = human.getLocation().distance(targetLocation);
		if (human.getLifeStatistics().getLifeStatistics()[0].getValue() >= distance){
			human.getLifeStatistics().getLifeStatistics()[0].increaseValue(-(distance * 2));
			human.setLocation(targetLocation);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Run";
	}
}
