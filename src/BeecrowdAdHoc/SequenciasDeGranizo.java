package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SequenciasDeGranizo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int h, cont ;
		
		h = teclado.nextInt();
		while(h != 0) {
			ArrayList<Integer> numeros = new ArrayList<>();
			numeros.add(h);
			while(h != 1) {
				if(h % 2 == 1) {
					h = 3 * h + 1;
					numeros.add(h);
				}
				else if(h % 2 == 0) {
					h = h / 2;
					numeros.add(h);
				}
			}
			int max = Collections.max(numeros);
			System.out.println(max);
			h = teclado.nextInt();
		}
		
		teclado.close();
		
	}

}

