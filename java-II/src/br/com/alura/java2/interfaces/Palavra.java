package br.com.alura.java2.interfaces;

import sun.security.util.Length;

public final class Palavra {

	public static void ImprimeCadaLetraEmUmaLinha(String string) {
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
	}

	public static void ImprimeStringInvertida(String string) {
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println();
	}

	public static void ImprimeStringComPalavrasNaOrdemInversa(String string) {

		String[] Spliter = string.split(" ");

		for (int i = Spliter.length - 1; i >= 0; i--) {
			System.out.print(Spliter[i] + " ");
		}
	}

	public static int ConverteParaInteiro(String string) {
		int valorTotal = 0;
		int multiplicador = 1;
		int intAux;

		for (int i = string.length()-1; i >= 0; i--) {
			intAux = string.charAt(i) - '0';
			valorTotal += intAux * multiplicador;
			
			multiplicador *= 10;
		}
		return valorTotal;
	}

	public static void main(String[] args) {

		// Palavra.ImprimeStringInvertida("anotaram a data da maratona");
		// Palavra.ImprimeStringInvertida("Socorram-me, subi no ônibus em
		// Marrocos");
		//Palavra.ImprimeStringComPalavrasNaOrdemInversa("Socorram-me, subi no ônibus em Marrocos");
		
		System.out.println(Palavra.ConverteParaInteiro("99999999"));
	}
}
