package ContaComAtalhosMelhorados;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, double saldo, int agencia) {
		super(nome, saldo, agencia);
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(String nome, int agencia) {
		super(nome, agencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualiza(double taxa) {
		super.atualiza(3*taxa);
	}

}