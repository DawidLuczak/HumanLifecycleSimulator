package dawid.luczak.model.organism;

public abstract class Statistic {
	
	private int value;
	
	Statistic(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void increaseValue(int value) {
		this.value += value;
	}
	
	public String toString(String text){
		return text + ": " + value;
	}
}
