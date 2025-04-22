package BeecrowdIniciante;

import java.util.Scanner;


/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima. 
*/


public class Multiplos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		num1 = Integer.parseInt(teclado.next());
		num2 = Integer.parseInt(teclado.next());
		
		if(num1 < 0) {
			num1 = num1 * -1;
		}
		if(num2 < 0) {
			num2 = num2 * -1;
		}
		
		if(num1 >= num2 && num1 % num2 == 0) {
			System.out.println("Sao Multiplos");
		}
		else if (num1 < num2 && num2 % num1 == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		teclado.close();
		
	}

}

