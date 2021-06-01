package dawid.luczak.model;

import dawid.luczak.model.human.baby.BabyBoy;
import dawid.luczak.model.human.kid.KidBoy;
import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BabyBoyTest extends TestCase {
	
	BabyBoy babyBoy;
	
	public BabyBoyTest(){
		super();
		
		babyBoy = new BabyBoy("Dawid", "Cziki");
	}
	
	
	@Test
	public void testGrowUp() {
		Assertions.assertTrue(babyBoy.growUp() instanceof KidBoy);
	}
	
	@Test
	public void testIsMale() {
		Assertions.assertTrue(babyBoy.isMale());
	}
}