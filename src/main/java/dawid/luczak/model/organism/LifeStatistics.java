package dawid.luczak.model.organism;

public class LifeStatistics {
	
	private final LifeStatistic[] lifeStatistics;
	
	LifeStatistics(){
		lifeStatistics = new LifeStatistic[]{
				new LifeStatistic(100), //energy
				new LifeStatistic(90), //thirsty
				new LifeStatistic(80) //hungry
		};
	}
	
	public LifeStatistic[] getLifeStatistics() {
		return lifeStatistics;
	}
	
}
