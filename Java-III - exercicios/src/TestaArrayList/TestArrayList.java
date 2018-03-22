package TestaArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		List<Integer> conjunto = new ArrayList<>();

		for (int i = 1; i < 1000; i++) {
			conjunto.add(i);
		}

		Collections.reverse(conjunto);

		for (Integer element : conjunto) {
			System.out.println(element + " ");
		}
	}
}
