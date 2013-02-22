import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCoco {
	
	IntSet is;
	@Before
	public void setUp() throws Exception {
		is = new FilleIntSet();
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testAdd() {
	
		is.add(2);
		assertTrue("number not added",is.contains(2));
		
	}

	@Test
	public void testContains() {
		
		is.add(1);
		assertTrue("ça marche pas",is.contains(1));
			
		
	}

	@Test
	public void testRemove() {
		
		is.add(5);
		assertTrue("aucun chiffre affecte",is.contains(5));
		is.remove(5);
		assertTrue("not removed ", !is.contains(5));
	}

	@Test
	public void testSize() {
		
		
		assertTrue("marche pas ",!(is.size()==2));
		
	}
	

}
