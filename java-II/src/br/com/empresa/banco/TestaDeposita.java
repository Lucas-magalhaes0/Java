package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaDeposita {
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente("Lucas",123,500);
		try {
			conta.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.err.println("Erro");
			System.err.println(e.getMessage());
		}
	}
}
