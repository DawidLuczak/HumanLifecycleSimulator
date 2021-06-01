package dawid.luczak.model.human.teenager;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TeenagerTest extends TestCase {

	private final Teenager teenager;
	
	public TeenagerTest(){
		super();
		teenager = Teenager.create();
		assertNotNull(teenager);
		teenager.setThirdName("Hope");
		assertEquals(" Hope", teenager.getName());
	}
	
	@Test
	public void testCopy() {
		Teenager copy = (Teenager) teenager.copy();
		
		assertEquals(teenager, copy);
		assertEquals(teenager.getName(), copy.getName());
		
		copy.setThirdName("Work");
		
		assertNotEquals(teenager, copy);
	}
	
	@Test
	public void testGetFemale() {
		assertTrue(teenager.getFemale().isFemale());
		assertTrue(teenager.getFemale() instanceof TeenGirl);
		assertEquals(teenager, teenager.getFemale());
	}
	
	@Test
	public void testGetMale() {
		assertTrue(teenager.getMale().isMale());
		assertTrue(teenager.getMale() instanceof TeenBoy);
		assertEquals(teenager, teenager.getMale());
	}
	
	@Test
	public void testIsAdult(){
		assertFalse(teenager.isAdult());
	}
	
	@Test
	public void testIsAlive(){
		assertTrue(teenager.isAlive());
	}
}