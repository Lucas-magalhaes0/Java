package BancoTributos;

import ContaCCeCP.Conta;

class ContaCorrente extends Conta implements Tributavel {

	// outros atributos e m�todos

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
