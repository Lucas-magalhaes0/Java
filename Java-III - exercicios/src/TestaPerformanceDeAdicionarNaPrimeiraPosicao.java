import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	
	private static long arrayListCalculaTempoMillis() {
		long inicio = System.currentTimeMillis();

        // trocar depois por ArrayList                
        List<Integer> teste = new ArrayList<>();

        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }

        return System.currentTimeMillis() - inicio;
	}

	private static long linkedListCalculaTempoMillis() {
		 
         long inicio = System.currentTimeMillis();

         // trocar depois por ArrayList                
         List<Integer> teste = new LinkedList<>();

         for (int i = 0; i < 30000; i++) {
             teste.add(0, i);
         }

         return System.currentTimeMillis() - inicio;
	}
	
	
        public static void main(String[] args) {
            System.out.println("Iniciando...");
            
            System.out.println("Tempo gasto LinkedList: " + linkedListCalculaTempoMillis());
            System.out.println("Tempo gasto ArrayList: " + arrayListCalculaTempoMillis());
        }
    }