package BeecrowdIniciante;


import java.util.Scanner;


/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre
a diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo
abaixo, com um espaço em branco antes e depois da igualdade. 
*/


public class Diferenca {

	public static void main(String[] args) {
		
		int a, b, c, d, diff;
		
		Scanner teclado = new Scanner(System.in);
		
		a = Integer.parseInt(teclado.nextLine());
		b = Integer.parseInt(teclado.nextLine());
		c = Integer.parseInt(teclado.nextLine());
		d = Integer.parseInt(teclado.nextLine());
		
		diff = (a * b) - (c * d);
		
		System.out.println("DIFERENCA = " + diff);
		
		teclado.close();

	}

}

