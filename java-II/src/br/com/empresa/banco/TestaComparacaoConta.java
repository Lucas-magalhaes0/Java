package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente("Lucas",123,500);
		Conta c2 = new ContaPoupanca("Lucas",123,400);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		
	}
	
}
