package BeecrowdIniciante;

import java.util.Scanner;


public class NumeroPerfeito {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, numero;
		
		n = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i < n; i++) {
			int soma = 0;
			numero = Integer.parseInt(teclado.nextLine());
			for(int j = 1; j < numero; j++) {
				
				if(numero % j == 0) {
					soma += j;
					
				}
				if(soma > numero) {
					break;
				}
				
			}
			if(soma == numero) {
				System.out.println(numero + " eh perfeito");
				
			}
			else {
				System.out.println(numero + " nao eh perfeito");
			}
			
		}
		
		teclado.close();
	}

}
