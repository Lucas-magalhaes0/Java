package br.com.empresa.banco.conta;

import java.lang.Comparable;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca(String nome, int numConta, double saldo) {
		super(nome, numConta, saldo);
	}

	public ContaPoupanca(String nome, int numConta) {
		super(nome, numConta, 0);
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	// CompareTo que compara o numero da conta 
	// @Override
	// public int compareTo(ContaPoupanca o) {
	// return this.numero - o.getNumero();
	// }

	//CompareTo que compara o nome atrelado a conta
	@Override
	public int compareTo(ContaPoupanca o) {
		return this.nome.compareTo(o.getNome());
	}
}
