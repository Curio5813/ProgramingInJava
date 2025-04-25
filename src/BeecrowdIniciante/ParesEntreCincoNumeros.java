package BeecrowdIniciante;

import java.util.Scanner;


public class ParesEntreCincoNumeros {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, cont = 0;
		
		for(int i = 0; i < 5; i++) {
			numero = Integer.parseInt(teclado.nextLine());
			if(numero % 2 == 0) {
				cont += 1;
			}
		}
		
		System.out.println(cont + " valores pares");
		
		teclado.close();
		
	}
}
