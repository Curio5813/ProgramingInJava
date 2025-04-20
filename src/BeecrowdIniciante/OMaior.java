package BeecrowdIniciante;


import java.util.Scanner;


/*
Faça um programa que leia três valores e apresente o maior dos três valores 
lidos seguido da mensagem “eh o maior”. Utilize a fórmula:



Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo 
passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

public class OMaior {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		
		num1 = Integer.parseInt(teclado.next());
		num2 = Integer.parseInt(teclado.next());
		num3 = Integer.parseInt(teclado.next());
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " eh o maior");
		}
		
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " eh o maior");
		}
		else if(num3 >= num1 && num3 >= num2) {
			System.out.println(num3 + " eh o maior");
		}
		
		teclado.close();
	}

}
