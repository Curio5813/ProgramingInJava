package Personal;

public class DeUmAUmBilhao {

	public static void main(String[] args) {
		
		long inicio = System.nanoTime();
		
		int cont = 0;
		
		for(int i = 1; i <= 1_000_000_000; i++) {
			cont += 1;
		}
		
		long fim = System.nanoTime();
		
		long duracaoEmNano = fim - inicio;
		
		System.out.println(cont);
	
		System.out.println("Tempo (millisegundos): " + (duracaoEmNano / 1_000_000));
		
	}

}
