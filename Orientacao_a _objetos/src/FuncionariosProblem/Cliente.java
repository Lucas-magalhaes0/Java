package FuncionariosProblem;

public class Cliente implements Autenticavel {
	private int senha = 0;
	private String nome;

	public Cliente(String nome) {
		this.nome = nome;

	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
