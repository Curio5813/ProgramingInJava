package BeecrowdIniciante;

import java.util.*;


public class JornadaNasEstrelas {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

	    int n, j = 0, idx = 0, sitio = 0;
		
		n = Integer.parseInt(teclado.nextLine());
		
		long x[] = new long[n];
		Integer[] vetor = new Integer[n];
		
		List<Integer> sitios = Arrays.asList(vetor);
		
		for(int i = 0; i < x.length; i++) {
			
			x[i] = Integer.parseInt(teclado.next());
			
		}
		while(j >= 0 && j < x.length) {
			if(x[j] % 2 == 0) {
				if(x[j] > 0) {
					x[j] -= 1;
				}
				if(!sitios.contains(j)) {
					vetor[idx] = j;
					sitio += 1;
					idx += 1;
				}
				j -= 1;
				
			}
			else if(x[j] % 2 == 1) {
				if(x[j] > 0) {
					x[j] -= 1;
				}
				if(!sitios.contains(j)) {
					vetor[idx] = j;
					sitio += 1;
					idx += 1;
				}
				j += 1;
				
			}
		
		}
		long carneiros = Arrays.stream(x).sum(); 
		System.out.println(sitio + " " + carneiros);
		
		teclado.close();
	}

}
