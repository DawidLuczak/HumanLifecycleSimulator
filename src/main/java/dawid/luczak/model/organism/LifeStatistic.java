package dawid.luczak.model.organism;

public class LifeStatistic extends Statistic {
	
	private int maxValue;
	
	LifeStatistic(int value) {
		super(value);
		setMaxValue(100);
	}
	
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	
	@Override
	public void increaseValue(int value) {
		super.increaseValue(value);
		if (getValue() > getMaxValue())
			setValue(getMaxValue());
	}
	
	public boolean isFull() {
		return getValue() >= getMaxValue();
	}
	
	@Override
	public String toString(String text) {
		return super.toString(text) + "/" + maxValue;
	}
}
