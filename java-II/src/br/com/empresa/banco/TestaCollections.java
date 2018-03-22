package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaCollections {
	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();

		ContaCorrente c1 = new ContaCorrente("Lucas", 123, 500);
		ContaCorrente c2 = new ContaCorrente("Bianca",123,500);

		contas.add(c1);

		System.out.println(contas.get(0));

		Set<Conta> arContas = new HashSet<Conta>();
		
		arContas.add(c1);
		arContas.add(c2);
		System.out.println(arContas.size());
		
		Map<String, Conta> acc = new HashMap<String, Conta>();
		acc.put("diretor", c1);
		acc.put("diretor", c2);
		
		System.out.println(acc.get("diretor").getSaldo());
	}
}
