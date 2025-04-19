package BeecrowdIniciante;

import java.util.Scanner;

import java.util.Locale;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 
2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, 
respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de 
deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser 
apresentado com 2 casas após o ponto. 
*/



public class CalculoSimples {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		int cod, qt;
		
		double valor, total = 0;
		
		for(int i = 0; i <= 1; i++) {
			cod = Integer.parseInt(teclado.next());
			qt = Integer.parseInt(teclado.next());
			valor = Double.parseDouble(teclado.next());
			
			total += qt * valor;
			
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		teclado.close();

	}

}
