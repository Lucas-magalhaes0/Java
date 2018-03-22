package FuncionariosProblem;

public class SistemaInterno {
	public static void autentica (Autenticavel f) {
		int senha = 123;
		
		if (f.autentica(senha) == true) {
			System.out.println("Bem vindo ao sistema!");
		} else 
			System.out.println("Falha na autenticação");
	}
	
	public static void main(String[] args) {
		SistemaInterno sistemaInterno = new SistemaInterno(); 
		Gerente ger = new Gerente("Lucas");
		Secretaria sec = new Secretaria("Maria");
		
		autentica (ger);
		//autentica (sec);
		
	}
}
