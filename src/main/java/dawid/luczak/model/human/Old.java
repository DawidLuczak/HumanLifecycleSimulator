package dawid.luczak.model.human;

public abstract class Old extends Adult {
	
	protected Old(Adult adult){
		super(adult);
		setNames(adult);
		nameUpdate();
	}
}
