package Threads;

public class CopiadorDeArquivos implements Runnable{
	public void run () {
		for (int i = 0; i < 10; i ++) {
			System.out.println("copiador de arquivos");
		}
	}
}
