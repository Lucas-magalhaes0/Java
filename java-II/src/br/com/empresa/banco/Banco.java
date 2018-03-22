package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.Conta;

public class Banco {
	Map<String, Conta> contas = new HashMap<String, Conta>();

	void adiciona(Conta c) {
		contas.put(c.getNome(), c);
	}

	Conta pega(int x) {
		return contas.get(x);
	}

	int pegaQuantidadeDeContas() {
		return contas.size();
	}

	Conta buscaPorNome(String nome) {
		return contas.get(nome);
	}
	
	
	public static void main(String[] args) {
		Banco b = new Banco();
		
		
		b.adiciona(new ContaCorrente("Lu", 123, 23));
		System.out.println(b.buscaPorNome("Lu"));
	}
}
