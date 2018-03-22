package br.com.empresa.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(String nome, int numConta, double saldo) {
		super(nome, numConta, saldo);
	}
	public ContaCorrente(String nome, int numConta) {
		super(nome, numConta, 0);
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
