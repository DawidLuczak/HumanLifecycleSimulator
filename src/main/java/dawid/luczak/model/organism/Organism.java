package dawid.luczak.model.organism;

import dawid.luczak.contract.organism.OrganismInterface;
import dawid.luczak.model.body.Body;

public class Organism extends Body implements OrganismInterface {
	
	private final LifeStatistics lifeStatistics;
	
	public Organism(){
		super(10, 10);
		lifeStatistics = new LifeStatistics();
	}
	
	
	public LifeStatistics getLifeStatistics() {
		return lifeStatistics;
	}
}
