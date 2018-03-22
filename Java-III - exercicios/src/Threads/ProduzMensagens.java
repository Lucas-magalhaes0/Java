package Threads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class ProduzMensagens implements Runnable {
	private int comeco;
	private int fim;
	private LinkedList<String> mensagens;

	public ProduzMensagens(int comeco, int fim, LinkedList<String> mensagens2) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens2;
	}

	public void run() {
		for (int i = comeco; i < fim; i++) {

			mensagens.add("Mensagem " + i);

		}
	}
}