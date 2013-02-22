import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestIntSet {

	private IntSet is;
	
	@Before
	public void setUp(){
		is = new FilleIntSet();
	}
	
	@Test
	public void testAdd() {
		is.add(14);
		assertTrue("contains != 14", is.contains(14));
		assertTrue("size != 1", is.size()==1);
		is.add(14);
		assertTrue("size != 1", is.size()==1);
	}

	@Test
	public void testContains() {
		is.add(14);
		assertTrue("contains != 14",is.contains(14));
		is.remove(14);
		assertTrue("contains == 14", !is.contains(14));
	}

	@Test
	public void testRemove() {
		is.add(2);
		is.add(14);
		is.remove(2);
		assertTrue("contains != 2", !is.contains(2));
		assertTrue("size != 1", is.size()==1);

	}

	@Test
	public void testSize() {
		is.add(2);
		assertTrue("size != 1", is.size()==1);
		is.add(3);
		assertTrue("size != 2", is.size()==2);
		is.add(3);
		assertTrue("size !=2", is.size()==2);
	}

}
