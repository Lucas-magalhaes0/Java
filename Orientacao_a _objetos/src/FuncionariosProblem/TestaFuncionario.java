package FuncionariosProblem;

public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente joao = new Gerente("Joao", 1000);
		Gerente jose = new Gerente("Jose", 9000);

		System.out.println(joao.getBonus());
		System.out.println(jose.getBonus());
	}
}
