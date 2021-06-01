package dawid.luczak.model.human;

import dawid.luczak.model.human.adult.Adult;
import dawid.luczak.model.human.baby.Baby;
import dawid.luczak.model.human.kid.Kid;
import dawid.luczak.model.human.old.Old;
import dawid.luczak.model.human.teenager.Teenager;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class HumanTest extends TestCase {

	private Human human;

	public HumanTest(){
		super();
		human = Human.create();
		assertNotNull(human);
		human.setFirstName("Same");
	}
	
	@Test
	public void testGrowUp(){
		assertTrue((human = human.growUp()) instanceof Baby);
		assertTrue((human = human.growUp()) instanceof Kid);
		assertTrue((human = human.growUp()) instanceof Teenager);
		assertTrue((human = human.growUp()) instanceof Adult);
		assertTrue((human = human.growUp()) instanceof Old);
		assertTrue((human = human.growUp()) instanceof Corps);
		assertTrue((human = human.growUp()) instanceof Ghost);
	}


}