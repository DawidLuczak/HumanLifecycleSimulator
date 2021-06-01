package dawid.luczak.model.human.old;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class OldTest extends TestCase {
	
	private final Old old;
	
	public OldTest(){
		super();
		old = Old.create();
		assertNotNull(old);
		old.setLastName("Wise");
	}
	
	@Test
	public void testCopy(){
		Old copy = (Old) old.copy();
		
		assertEquals(old, copy);
		
		copy.setLastName("Calm");
		
		assertNotEquals(old, copy);
	}
	
	@Test
	public void testGetFemale(){
		assertTrue(old.getFemale().isFemale());
		assertTrue(old.getFemale() instanceof OldWoman);
		assertEquals(old, old.getFemale());
	}
	
	@Test
	public void testGetMale(){
		assertTrue(old.getMale().isMale());
		assertTrue(old.getMale() instanceof OldMan);
		assertEquals(old, old.getMale());
	}
	
	@Test
	public void testIsAlive(){
		assertTrue(old.isAlive());
	}
	
	@Test
	public void testIsAdult(){
		assertTrue(old.isAdult());
	}
}