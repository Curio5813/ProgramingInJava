package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.Arrays;


public class CoralPerfeito {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while(teclado.hasNextInt()) {
			
			int n, soma = 0, unissono = 0, compasso = 1;
			
			n = teclado.nextInt();
			
			int i = n -1, k = 0;
				
			int[] notas = new int[n];	
			
			for(int j = 0; j < n; j++) {
				notas[j] = Integer.parseInt(teclado.next());
				soma += notas[j];
			}
			if(soma % n == 0) {
				unissono = soma / n;
				while(Arrays.stream(notas).distinct().count() != 1) {
					while(notas[k] != unissono) {
						notas[k] += 1;
						notas[i] -= 1;
						compasso += 1;
						if(notas[k] == unissono) {
							k += 1;							
						}
						if(notas[i] == unissono) {
								i -= 1;
						}
					}
				}
				System.out.println(compasso);
			}
			else {
				System.out.println(-1);
			}
					
		}
		
		teclado.close();
		
	}

}
