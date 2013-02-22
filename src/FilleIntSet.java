import java.util.Vector;

public class FilleIntSet implements IntSet {

	private Vector<Integer> tab = new Vector();
	
	@Override
	public void add(int x) {
		if(!tab.contains(x))
			tab.add(x);
	}

	@Override
	public boolean contains(int x) {
		return tab.contains(x);
	}

	@Override
	public void remove(int x) {
		tab.removeElement(x);
	}

	@Override
	public int size() {
		return tab.size();
	}

	public static void main(String[] args){
		System.out.println("Hello World !");
	}

}
