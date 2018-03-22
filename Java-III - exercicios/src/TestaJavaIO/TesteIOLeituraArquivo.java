package TestaJavaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteIOLeituraArquivo {
	public static void main(String[] args) throws FileNotFoundException {
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
										new FileInputStream("src/arquivo.txt")));

		try {
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
