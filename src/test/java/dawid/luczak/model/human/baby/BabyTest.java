package dawid.luczak.model.human.baby;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BabyTest extends TestCase {
	
	private final Baby baby;
	
	public BabyTest() {
		super();
		baby = Baby.create();
		assertNotNull(baby);
		baby.setFirstName("Alice");
		baby.setLastName("Book");
	}
	
	@Test
	public void testSetFirstName() {
		assertEquals("Alice", baby.getFirstName());
		assertTrue(baby.getName().contains(baby.getFirstName()));
	}
	
	@Test
	public void testSetLastName() {
		assertEquals("Book", baby.getLastName());
		assertTrue(baby.getName().contains(baby.getLastName()));
	}
	
	@Test
	public void testCopy() {
		Baby copy = (Baby) baby.copy();
		
		assertEquals(baby, copy);
		assertEquals("Alice Book", copy.getName());
		
		copy.setLastName("Know");
		
		assertNotEquals(baby, copy);
	}
	
	@Test
	public void testGetFemale() {
		assertTrue(baby.getFemale().isFemale());
		assertTrue(baby.getFemale() instanceof BabyGirl);
		assertEquals(baby, baby.getFemale());
	}
	
	@Test
	public void testGetMale() {
		assertTrue(baby.getMale().isMale());
		assertTrue(baby.getMale() instanceof BabyBoy);
		assertEquals(baby, baby.getMale());
	}
	
	@Test
	public void testIsAlive() {
		assertTrue(baby.isAlive());
	}
	
	@Test
	public void testIsAdult() {
		assertFalse(baby.isAdult());
	}
}