package br.com.empresa.banco;


import br.com.empresa.banco.conta.Cliente;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.sistema.GuardadorDeObjetos;

public class TestaJavaLang {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente("Lucas",123,500);
		Conta c2 = new ContaPoupanca("Lucas",123,400);
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		
		armario.adiciona(c1);
		armario.adiciona(c2);
		
		Cliente cliente = new Cliente("Lucas");
		//armario.adiciona(cliente);
		
		
		System.out.println(armario.busca(1).getSaldo());
	}
}
