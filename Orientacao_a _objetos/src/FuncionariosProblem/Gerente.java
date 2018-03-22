package FuncionariosProblem;

public class Gerente extends Funcionario implements Autenticavel  {

	public Gerente(String nome) {
		super(nome);
	}

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	public double getBonus() {
		return this.salario * 0.25;
	}
	
	public boolean autentica (int senha) {

		return false;
		
	}

}
