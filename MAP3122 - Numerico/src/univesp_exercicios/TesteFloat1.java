package univesp_exercicios;

public class TesteFloat1 {
	public static void main(String[] args) {
		float num1 = ((float)1 / 3) + ((float)1 / 3) + ((float)1 / 3);
		float num2 = ((float) 0.1) + ((float) 0.7);
		float num3 = (float) 0.7;

		System.out.println("Primeiro valor deve ser igual a 1. Valor: " + num1);
		System.out.println("Segundo valor deve ser igual a 0.8. Valor: " + num2);

		System.out.println("Terceiro valor é menor que 0.7? Boolean:" + ((float)0.7 < (float)0.7 ));
	}
}
