import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaPerformance {

	private static long arrayListCalculaTempoMillis() {
		List<Integer> teste = new ArrayList<Integer>();
		int TOTAL = 30000;

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < TOTAL; i++) {
			teste.add(i);
		}
		for (int i = 0; i < TOTAL; i++) {
            teste.contains(i);
        }

		return System.currentTimeMillis() - inicio;
	}

	private static long hashSetCalculaTempoMillis() {
		Set<Integer> teste = new HashSet<Integer>();
		int TOTAL = 30000;
		
		long inicio = System.currentTimeMillis();

		for (int i = 0; i < TOTAL; i++) {
			teste.add(i);
		}
		
		for (int i = 0; i < TOTAL; i++) {
            teste.contains(i);
        }

		return System.currentTimeMillis() - inicio;
	}

	private static double mediaTempoArrayList(int numeroDeIteracoes) throws Exception {
		double tempoTotal = 0;

		if (numeroDeIteracoes < 0 || numeroDeIteracoes > 50) {
			throw new Exception("Numero de iteracoes deve ser menor ou igual 50");
		}

		for (int i = 0; i < numeroDeIteracoes; i++) {
			tempoTotal += arrayListCalculaTempoMillis();
		}

		return tempoTotal / numeroDeIteracoes;
	}

	private static double mediaTempoHashSet(int numeroDeIteracoes) throws Exception {
		double tempoTotal = 0;

		if (numeroDeIteracoes < 0 || numeroDeIteracoes > 50) {
			throw new Exception("Numero de iteracoes deve ser menor ou igual 50");
		}

		for (int i = 0; i < numeroDeIteracoes; i++) {
			tempoTotal += hashSetCalculaTempoMillis();
		}

		return tempoTotal / numeroDeIteracoes;
	}

	public static void main(String[] args) {

		try {
			System.out.println("Media tempo do ArrayList: " + mediaTempoArrayList(2));
			System.out.println("Media tempo do HashSet: " + mediaTempoHashSet(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
