package BeecrowdIniciante;

import java.util.Scanner;

import java.util.Locale;


/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não 
um triângulo. Em caso positivo, calcule o perímetro do triângulo 
e apresente a mensagem:


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e 
C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.  
*/


public class Triangulo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		float a, b, c, perimetro, area;
		
		a = Float.parseFloat(teclado.next());
		b = Float.parseFloat(teclado.next());
		c = Float.parseFloat(teclado.nextLine());
		
		if((a + b) > c && (a + c) > b && (c + b) > a) {
			
			perimetro = a + b + c;
			
			System.out.printf("Perimetro = %.1f\n", perimetro);
			
		}
		else {
			
			area = (float) (((a + b) * c) / 2.0);
			
			System.out.printf("Area = %.1f\n", area);
			
		}
		
		teclado.close();
		
	}

}
