package ContaComAtalhosMelhorados;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	void roda (Conta c) {
		System.out.println("==============");
		System.out.println(c.getSaldo());
		c.atualiza(selic);
		System.out.println(c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
	
	double getSaldoTotal() {
		return this.saldoTotal;
	}
}
