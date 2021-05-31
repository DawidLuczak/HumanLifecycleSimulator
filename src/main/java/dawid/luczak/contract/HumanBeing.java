package dawid.luczak.contract;


import dawid.luczak.model.human.Human;

public interface HumanBeing extends Information, Emotions
{
	Human copy();
	
	Human growUp();
}
