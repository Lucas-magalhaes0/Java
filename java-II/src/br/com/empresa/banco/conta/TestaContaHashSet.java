package br.com.empresa.banco.conta;

import java.util.HashSet;
import java.util.Set;

public class TestaContaHashSet {
	public static void main(String[] args) {
		Set<Conta> contas = new HashSet<Conta>();
		
		ContaCorrente c1 = new ContaCorrente("Lu", 234);
		ContaCorrente c2 = new ContaCorrente("Bu", 234);
		
		contas.add(c1);
		contas.add(c2);
		
		
		System.out.println(contas.size());
		System.out.println(contas.toString());
	}
}


//(opcional, avançado) Crie uma classe de teste e verifique se sua classe Conta funciona agora corretamente em um HashSet, isto é, que ela não guarda contas com números repetidos. Depois, remova o método hashCode. Continua funcionando?

//Dominar o uso e o funcionamento do hashCode é fundamental para o bom programador.