package Iniciante;

import java.util.Scanner;

public class ExtremamenteBasico {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, soma;
		
		num1 = Integer.parseInt(teclado.nextLine());
		num2 = Integer.parseInt(teclado.nextLine());
		
		soma = num1 + num2;
		
		System.out.println("X = " + soma);
		
		teclado.close();
		
	}

}
