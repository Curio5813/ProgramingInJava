package BeecrowdIniciante;

import java.util.Scanner;

import java.util.Locale;


/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, 
de modo que o lado A representa o maior dos 3 lados. A seguir, determine o 
tipo de triângulo que estes três lados formam, com base nos seguintes casos, 
sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , 
B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.  
*/


public class TiposDeTriangulos {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int flag = 0;
		
		double a, b, c;
		
		a = Double.parseDouble(teclado.next());
		b = Double.parseDouble(teclado.next());
		c = Double.parseDouble(teclado.nextLine());
		
		if(a >= (b + c) || b >= (a + c) || c >= (a + b)) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if((a * a) == (b * b + c * c) || (b * b) == (a * a + c * c) || 
					(c * c) == (a * a + b * b)) {
				System.out.println("TRIANGULO RETANGULO");
				flag = 1;
			}
			else if((a * a) > (b * b + c * c) || (b * b) > (a * a + c * c) || 
					(c * c) > (a * a + b * b)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else if((a * a) < (b * b + c * c) || (b * b) < (a * a + c * c) || 
					(c * c) < (a * a + b * b)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			else {
				if(a == b && b != c || a == c && c != b || b == c && c != a && flag == 0) {
					System.out.println("TRIANGULO ISOSCELES");
				}
			}
		}
		
		teclado.close();
	}

}
