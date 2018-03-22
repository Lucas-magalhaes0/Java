package FuncionariosProblem;

public class Secretaria extends Funcionario {

	public Secretaria(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	public Secretaria(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}


	@Override
	double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
