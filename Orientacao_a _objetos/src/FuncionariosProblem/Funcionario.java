package FuncionariosProblem;


public abstract class Funcionario {
	protected String nome;
	protected double salario = 0;
	
	
	public Funcionario (String nome, double salario) {
		this.nome = nome;
		this.setSalario(salario);
	}
	
	public Funcionario (String nome) {
		this.nome = nome;
	}
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	abstract double getBonus();

	protected double getSalario() {
		System.out.println(getBonus());
		return salario;
	}	
}

