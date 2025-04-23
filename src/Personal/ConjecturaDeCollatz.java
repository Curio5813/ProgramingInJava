package Personal;

import java.util.Scanner;


/*
CONJETURA DE COLLATZ 
*/

public class ConjecturaDeCollatz {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		long numero, loops = 0;
		
		System.out.println("Digite um número: ");
		numero = Long.parseLong(teclado.next());
		System.out.print(numero + " ");
		
		while(numero != 1) {
			
			if(numero % 2 == 1) {
				numero = 3 * numero + 1;
				loops += 1;
				System.out.print(numero + " ");
			}
			
			if(numero % 2 == 0) {
				numero = numero / 2;
				loops += 1;
				System.out.print(numero + " ");
			}
						
		}
		System.out.println("\n");
		System.out.println("Depois de " + loops + " itereçãoes a Sequência de Collatz entra num loop infinito!");
		
		teclado.close();
	}

}

