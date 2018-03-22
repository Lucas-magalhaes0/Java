package ContaComAtalhosMelhorados;

public class ContaCorrente extends Conta {

	public ContaCorrente(String nome, double saldo, int agencia) {
		super(nome, saldo, agencia);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(String nome, int agencia) {
		super(nome, agencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualiza(double taxa) {
		super.atualiza(2*taxa);
	}

}
