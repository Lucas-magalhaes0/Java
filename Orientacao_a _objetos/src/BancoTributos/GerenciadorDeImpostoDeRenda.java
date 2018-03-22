package BancoTributos;

public class GerenciadorDeImpostoDeRenda {
	private double valorTotal;

	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t);

		valorTotal += t.calculaTributos();
	}

	public double getValorTotal() {
		return valorTotal;
	}


}
