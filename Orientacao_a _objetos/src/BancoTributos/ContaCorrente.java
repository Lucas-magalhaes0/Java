package BancoTributos;

import ContaCCeCP.Conta;

class ContaCorrente extends Conta implements Tributavel {

	// outros atributos e métodos

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
