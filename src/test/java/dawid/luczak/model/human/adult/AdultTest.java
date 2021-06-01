package dawid.luczak.model.human.adult;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdultTest extends TestCase {
	
	private final Adult adult;
	
	public AdultTest(){
		super();
		adult = Adult.create();
		assertNotNull(adult);
		adult.setName("Valid");
		assertEquals("Valid", adult.getName());
	}
	
	
	@Test
	public void testIsAlive(){
		assertTrue(adult.isAlive());
	}
	
	@Test
	public void testIsAdult(){
		assertTrue(adult.isAdult());
	}
	
	@Test
	public void testCopy(){
		Adult copy = (Adult) adult.copy();
		
		assertEquals(adult, copy);
		
		copy.setFirstName("is");
		
		assertNotEquals(adult, copy);
	}
	
	@Test
	public void testGetFemale(){
		assertTrue(adult.getFemale().isFemale());
		assertTrue(adult.getFemale() instanceof AdultWoman);
		assertEquals(adult, adult.getFemale());
	}
	
	@Test
	public void testGetMale(){
		assertTrue(adult.getMale().isMale());
		assertTrue(adult.getMale() instanceof AdultMan);
		assertEquals(adult, adult.getMale());
	}
	
}