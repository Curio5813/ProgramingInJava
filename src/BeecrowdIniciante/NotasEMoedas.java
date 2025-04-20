package BeecrowdIniciante;


import java.util.Scanner;


/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor 
representa um valor monetário. A seguir, calcule o menor número de 
notas e moedas possíveis no qual o valor pode ser decomposto. As notas 
consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 
0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas 
necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor 
inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
*/

public class NotasEMoedas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, moeda1 = 0;
		
		int moeda050 = 0, moeda025 = 0, moeda010 = 0, moeda005 = 0, moeda001 = 0;
		
		double dinheiro;
		
		dinheiro = Double.parseDouble(teclado.nextLine());
		
		
		System.out.println("NOTAS:");
		while(dinheiro >= 100) {
			dinheiro -= 100;
			nota100 += 1;
		}
		System.out.println(nota100 + " nota(s) de R$ 100.00");
		
		while(dinheiro >= 50) {
			dinheiro -= 50;
			nota50 += 1;
		}
		System.out.println(nota50 + " nota(s) de R$ 50.00");
		while(dinheiro >= 20) {
			dinheiro -= 20;
			nota20 += 1;
		}
		System.out.println(nota20 + " nota(s) de R$ 20.00");
		while(dinheiro >= 10) {
			dinheiro -= 10;
			nota10 += 1;
		}
		System.out.println(nota10 + " nota(s) de R$ 10.00");
		while(dinheiro >= 5) {
			dinheiro -= 5;
			nota5 += 1;
		}
		System.out.println(nota5 + " nota(s) de R$ 5.00");
		while(dinheiro >= 2) {
			dinheiro -= 2;
			nota2 += 1;
		}
		System.out.println(nota2 + " nota(s) de R$ 2.00");
		while(dinheiro >= 1) {
			dinheiro -= 1;
			moeda1 += 1;
		}
		System.out.println("MOEDAS:");
		System.out.println(moeda1 + " moeda(s) de R$ 1.00");
		while(dinheiro >= 0.50) {
			dinheiro -= 0.50;
			moeda050 += 1;
		}
		System.out.println(moeda050 + " moeda(s) de R$ 0.50");
		while(dinheiro >= 0.25) {
			dinheiro -= 0.25;
			moeda025 += 1;
		}
		System.out.println(moeda025 + " moeda(s) de R$ 0.25");
		while(dinheiro >= 0.10) {
			dinheiro -= 0.10;
			moeda010 += 1;
		}
		System.out.println(moeda010 + " moeda(s) de R$ 0.10");
		while(dinheiro >= 0.05) {
			dinheiro -= 0.05;
			moeda005 += 1;
		}
		System.out.println(moeda005 + " moeda(s) de R$ 0.05");
		if(dinheiro > 0) {
			dinheiro *= 100;
		}
		long resultado = Math.round(dinheiro);
		while(resultado >= 1) {
			resultado -= 1;
			moeda001 += 1;
		}
		System.out.println(moeda001 + " moeda(s) de R$ 0.01");
	
		teclado.close();
	}

}
