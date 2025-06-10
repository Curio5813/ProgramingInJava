package BeecrowdAdHoc;

import java.util.Scanner;


public class Dobradura {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int n, pedacos, cont = 1;
		
		n = teclado.nextInt();
		while(n != -1) {
			pedacos = (int) Math.pow((Math.pow(2, n) + 1), 2);
			System.out.println("Teste " + cont);
			System.out.println(pedacos);
			System.out.println();
			n = teclado.nextInt();
			cont += 1;
		}
		
		teclado.close();
		
	}
}
