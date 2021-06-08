package dawid.luczak.model.ability.move;


import dawid.luczak.model.ability.GroupOfAbilities;

public class Move extends GroupOfAbilities {
	
	public Move(){
		setAbilities(new MovingAbility[]{
				new Walk(), new Run()
		});
	}
	
}
