package ContaComAtalhosMelhorados;

abstract class Conta {
	private String nome;
	private int agencia;
	protected double saldo = 0;

	public Conta(String nome, double saldo, int agencia) {
		this.nome = nome;
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public Conta(String nome, int agencia) {
		this.nome = nome;
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	// public void setSaldo(double saldo) {
	// this.saldo = saldo;
	// }
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void imprime() {
		System.out.println(nome);
		System.out.println(agencia);
		System.out.println(saldo);
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public double saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return valor;
		} else
			return 0;
	}

}
