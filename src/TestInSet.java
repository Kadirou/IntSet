import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class TestInSet {

	private IntSet is;
	
	@Before
	public void setUp() {
		is = new FilleIntSet();
	}

	@Test
	public void testAdd() {
		is.contains(4);
		is.add(4);
		assertTrue("4 n'est pas ajouté, il est deja",is.size()==1);
		is.add(3);
		assertTrue("3 a été ajouté",is.size()==2);		
	}

	@Test
	public void testContains() {
		is.add(4);
		assertTrue("4 n'a pas été ajouté",is.contains(4));
		assertTrue("3 n'existe pas",!is.contains(3));
		is.remove(4);
		assertTrue("Il y a rien dedans",is.size()==0);
	}

	@Test
	public void testRemove() {
		is.add(6);
		is.remove(7);
		assertTrue("remove n'a pas supprimer 7, qui n'était pas dedans", is.size() == 1 );
		is.remove(6);
		assertTrue("6 a bien été supprimer", is.size() == 0 );
	}

	@Test
	public void testSize() {
		is.add(1);
		assertTrue("La taille egale 1",is.size()==1);
		is.add(1);
		assertTrue("La taille ne change pas(1 est deja dedans)",is.size()==1);
		is.add(2);
		assertTrue("La taille egale 2",is.size()==2);
	}

}
