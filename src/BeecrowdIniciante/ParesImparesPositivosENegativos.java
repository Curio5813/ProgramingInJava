package BeecrowdIniciante;

import java.util.Scanner;


public class ParesImparesPositivosENegativos {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, pares = 0, impares = 0, positivos = 0, negativos = 0;
		
		for(int i = 0; i < 5; i++) {
			numero = Integer.parseInt(teclado.nextLine());
			if(numero % 2 == 0) {
				pares += 1;
			}
			else if(numero % 2 != 0) {
				impares += 1;
			}
			if(numero > 0) {
				positivos += 1;
			}
			else if(numero < 0) {
				negativos += 1;
			}
			
		}
		
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");
		
		teclado.close();
		
	}

}
