package dawid.luczak.model.view.components;

import java.awt.*;

public class MyGridBagConstraint extends GridBagConstraints {
	
	public MyGridBagConstraint(int x, int y){
		super();
		setGridPosition(x, y);
	}
	
	public MyGridBagConstraint(int x, int y, double weightX, double weightY, int fill){
		super();
		setGridPosition(x, y);
		setGridWeight(weightX, weightY);
		setFill(fill);
	}
	
	public MyGridBagConstraint(int x, int y, double weightX, double weightY, int gridWidth, int gridHeight, int fill){
		super();
		setGridBagConstraint(x, y, weightX, weightY, gridWidth, gridHeight, fill);
	}
	
	public void setGridPosition(int x, int y){
		this.gridx = x;
		this.gridy = y;
	}
	
	public void setGridWeight(double weightX, double weightY){
		this.weightx = weightX;
		this.weighty = weightY;
	}
	
	public void setGridSize(int gridWidth, int gridHeight){
		this.gridwidth = gridWidth;
		this.gridheight = gridHeight;
	}
	
	public void setFill(int fill){
		this.fill = fill;
	}
	
	public void setGridBagConstraint(int x, int y, double weightX, double weightY, int gridWidth, int gridHeight, int fill){
		setGridPosition(x, y);
		setGridWeight(weightX, weightY);
		setGridSize(gridWidth, gridHeight);
		setFill(fill);
	}
}
