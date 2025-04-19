package BeecrowdIniciante;


import java.util.Scanner;


/*
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos 
números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores 
ímpares que estão entre os valores fornecidos na entrada que deverá caber 
em um inteiro. 
*/


public class SomaDeImparesConsecutivosUm {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, soma = 0;
		
		num1 = Integer.parseInt(teclado.nextLine());
		num2 = Integer.parseInt(teclado.nextLine());
		
		if(num1 <= num2) {
			for(int i = num1 + 1; i < num2; i++) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
			
		}
		if(num1 > num2) {
			for(int i = num2 + 1; i < num1; i++) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);
		
		teclado.close();

	}

}
