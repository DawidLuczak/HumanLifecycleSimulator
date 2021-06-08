package dawid.luczak.contract.human;


import dawid.luczak.contract.Emotions;
import dawid.luczak.model.LocationEnum;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Personality;

public interface HumanBeing extends Emotions
{
	Human growUp();
	
	Human getFemale();
	
	Human getMale();
	
	boolean isAlive();
	
	void setLocation(LocationEnum location);
	
	Personality getPersonality();
	
	void die();
	
	Human copy();
}
