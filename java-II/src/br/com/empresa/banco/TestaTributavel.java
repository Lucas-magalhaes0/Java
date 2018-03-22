package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.Tributavel;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaTributavel {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente("Lucas",123,500);
        try {
			cc.deposita(100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
        System.out.println(cc.calculaTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
	}
}
