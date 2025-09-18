package BeecrowdAdHoc;

import java.util.Scanner;

public class torresDeHanoi {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, cont = 1;
		
		n = teclado.nextInt();
		while(n != 0) {
			System.out.println("Teste " + cont);
			long resultado = (long) Math.pow(2, n) - 1;
			System.out.println(resultado);
			System.out.println("");
			cont += 1;
			n = teclado.nextInt();
			
		}
		
		teclado.close();
		
	}

}
