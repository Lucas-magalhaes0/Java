package ContaComAtalhosMelhorados;

public class TestaConta {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente("Lucas", 1001);

		System.out.println(conta.getNome());
		conta.imprime();
	}

}
