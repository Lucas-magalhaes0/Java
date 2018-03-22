package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Conta;

public class GuardadorDeObjetos {
	private Conta[] contas;
	private int posicaoLivre;
	private static int MAX_POSICOES = 100;
	
	public GuardadorDeObjetos () {
		contas = new Conta[MAX_POSICOES];
		posicaoLivre = 0;
	}
	
	public void adiciona (Conta contaNova) {
		if (posicaoLivre < MAX_POSICOES) {
			contas[posicaoLivre] = contaNova;
			posicaoLivre++;
		}
	}
	
	public Conta busca(int posicao) {
		return contas[posicao];
	}
}
