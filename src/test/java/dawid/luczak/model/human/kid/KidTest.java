package dawid.luczak.model.human.kid;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KidTest extends TestCase {

	private final Kid kid;
	
	public KidTest(){
		super();
		
		kid = Kid.create();
		assertNotNull(kid);
		
		kid.setSecondName("Siren");
		assertEquals(" Siren", kid.getName());
	}
	
	@Test
	public void testCopy() {
		Kid copy = (Kid) kid.copy();
		
		assertEquals(kid, copy);
		
		copy.setSecondName("Voice");
		
		Assertions.assertNotEquals(kid, copy);
	}
	
	@Test
	public void testGetFemale() {
		assertTrue(kid.getFemale().isFemale());
		assertTrue(kid.getFemale() instanceof KidGirl);
		assertEquals(kid, kid.getFemale());
	}
	
	@Test
	public void testGetMale() {
		assertTrue(kid.getMale().isMale());
		assertTrue(kid.getMale() instanceof KidBoy);
		assertEquals(kid, kid.getMale());
	}
	
	@Test
	public void testIsAlive() {
		assertTrue(kid.isAlive());
	}
	
	@Test
	public void testIsAdult() {
		assertFalse(kid.isAdult());
	}
}