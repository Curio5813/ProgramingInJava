package BeecrowdIniciante;


import java.util.Scanner;


/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 
100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas 
necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo 
necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de 
linha após cada linha, caso contrário seu programa apresentará a mensagem: 
“Presentation Error”. 
*/


public class Cedulas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dinheiro, nota100 = 0, nota50 = 0, nota20 = 0, nota10= 0, nota5 = 0, nota2 = 0, nota1 = 0;
		
		dinheiro = Integer.parseInt(teclado.nextLine());
		
		System.out.println(dinheiro);
		while(dinheiro >= 100) {
			dinheiro -= 100;
			nota100 += 1;
		}
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		while(dinheiro >= 50) {
			dinheiro -= 50;
			nota50 += 1;
		}
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		while(dinheiro >= 20) {
			dinheiro -= 20;
			nota20 += 1;
		}
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		while(dinheiro >= 10) {
			dinheiro -= 10;
			nota10 += 1;
		}
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		while(dinheiro >= 5) {
			dinheiro -= 5;
			nota5 += 1;
		}
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		while(dinheiro >= 2) {
			dinheiro -= 2;
			nota2 += 1;
		}
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		while(dinheiro >= 1) {
			dinheiro -= 1;
			nota1 += 1;
		}
		System.out.println(nota1 + " nota(s) de R$ 1,00");
		
		teclado.close();
	}
	

}
