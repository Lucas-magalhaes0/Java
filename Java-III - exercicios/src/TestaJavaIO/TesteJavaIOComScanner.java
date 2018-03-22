package TestaJavaIO;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteJavaIOComScanner {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		PrintStream ps;

		ps = new PrintStream("src/arquivo.txt");
		while (sc.hasNext()) {
			ps.println(sc.nextLine());
		}

		sc.close();
		ps.close();

	}

}
