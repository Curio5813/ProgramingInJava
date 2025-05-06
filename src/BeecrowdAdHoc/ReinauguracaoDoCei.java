package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.Arrays;


public class ReinauguracaoDoCei {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		while(teclado.hasNext()) {
			
			n = teclado.nextInt();
			
			
			int[] festa = new int[n];
			
			int simultaneos = n / 2;
			
			int[] tempo = new int[simultaneos];

			for(int i = 0; i < n; i++) {
				festa[i] = Integer.parseInt(teclado.next());
			}
			Arrays.sort(festa);
			
			for (int i = 0; i < simultaneos; i++) {
			    int j = n - 1 - i;
			    tempo[i] = festa[j] - festa[i];
			    
			}
	
			Arrays.sort(tempo);
						
			System.out.println(simultaneos + " " + tempo[0]);
		}	
		
		teclado.close();
	}

}

