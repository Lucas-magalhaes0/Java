package br.com.empresa.banco;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {
	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca("Lucas", 12399, 322);
		ContaPoupanca c2 = new ContaPoupanca("Lucas", 16, 32);
		ContaPoupanca c3 = new ContaPoupanca("Lucas", 1256, 3232);

		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		Random rd = new Random(12);
		
		for (int i = 0; i < 12; i++) {
			contas.add(new ContaPoupanca("cliente" + i, i, rd.nextInt(10000)));
		}

		Collections.sort(contas);

		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}

	}
}
