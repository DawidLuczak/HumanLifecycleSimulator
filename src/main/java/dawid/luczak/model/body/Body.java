package dawid.luczak.model.body;

import dawid.luczak.contract.body.BodyInterface;

public class Body implements BodyInterface {
	
	private double height, weight;
	
	private Body(){}
	
	protected Body(double height, double weight){
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public double getWeight() {
		return weight;
	}
	
	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public double getHeight() {
		return height;
	}
	
	@Override
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
