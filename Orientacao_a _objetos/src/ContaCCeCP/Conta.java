package ContaCCeCP;

public class Conta {
	protected double saldo = 0;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) throws Exception {
		if (valor < 0) {
			throw new ValorInvalidoException("Voce tentou depositar um valor negativo");
		} else
			this.saldo += valor - 0.10;
	}

	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;

			System.out.println("Saque efetuado com sucesso");
			return true;
		} else
			return false;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
}
