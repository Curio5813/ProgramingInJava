package BeecrowdIniciante;

import java.util.Scanner;


public class QuadradoEAoCubo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		num = Integer.parseInt(teclado.nextLine());
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i + " " + i * i + " " +  i * i * i);
		}
		
	}

}
