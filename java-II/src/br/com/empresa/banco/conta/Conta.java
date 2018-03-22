package br.com.empresa.banco.conta;

import com.sun.org.apache.xpath.internal.operations.Equals;

public abstract class Conta {

	protected String nome;
	protected double saldo;
	protected int numero;

	public Conta(String nome, int numConta, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public Conta(String nome, int numConta) {
		this.nome = nome;
		this.numero = numConta;
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		}
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	@Override
	public String toString() {
		return "esse objeto é uma conta com saldo R$" + this.saldo + ", " + this.nome + ", " + this.numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public String getNome() {
		return this.nome;
	}

	protected int getNumero() {
		return this.numero;
	}
	
}
