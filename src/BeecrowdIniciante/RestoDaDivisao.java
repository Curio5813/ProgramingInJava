package BeecrowdIniciante;

import java.util.Scanner;


public class RestoDaDivisao {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		num1 = Integer.parseInt(teclado.nextLine());
		num2 = Integer.parseInt(teclado.nextLine());
		
		if(num1 >= num2) {
			for(int i = num2 + 1; i < num1; i++) {
				if(i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		}
		else if(num1 < num2) {
			for(int i = num1 + 1; i < num2; i++) {
				if(i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		}
		
		teclado.close();
	}

}
