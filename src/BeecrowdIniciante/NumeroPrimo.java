package BeecrowdIniciante;

import java.util.Scanner;


/*
Na matemática, um Número Primo é aquele que pode ser dividido somente 
por 1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode 
ser dividido apenas pelo número 1 e pelo número 7.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém 
um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada. 
Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤ 107), que 
pode ser ou não, um número primo.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao 
eh primo”, de acordo com a especificação fornecida. 
*/

public class NumeroPrimo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, numero;
		
		n = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i < n; i++) {
			numero = Integer.parseInt(teclado.nextLine());
			for(int j = 2; j <= numero; j++) {
				if(numero % j == 0 && numero != j) {
					System.out.println(numero + " nao eh primo");
					break;
				}
				else if(numero % j == 0 && numero == j) {
					System.out.println(numero + " eh primo");
				}
			}
		}
		
		teclado.close();
			
	}

}
