package ContaCCeCP;


public class ContaPoupanca extends Conta {
	public void atualiza (double taxa) {
		this.saldo += this.saldo * 3 * taxa;
	}
	
	public void deposita (double valor) {
		this.saldo += valor - 0.10;
	}
}
