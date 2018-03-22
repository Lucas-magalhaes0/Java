package TestaTreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<Integer> arvore = new TreeSet<Integer>();

		for (int i = 1; i < 1000; i++) {
			arvore.add(i);
		}
		
		for( Integer elemento: ((TreeSet<Integer>) arvore).descendingSet()) {
			System.out.println(elemento + " ");
		}
		
	}
}
