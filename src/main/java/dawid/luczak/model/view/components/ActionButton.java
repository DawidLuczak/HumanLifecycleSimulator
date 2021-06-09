package dawid.luczak.model.view.components;

import java.awt.*;

public class ActionButton extends MyButton {
	
	
	public ActionButton(String text) {
		super(text);
		config();
	}
	
	private void config(){
		setPreferredSize(new Dimension(100,50));
	}
	
}
