package BeecrowdIniciante;

import java.util.Scanner;

import java.util.Arrays;


/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, 
mostre os valores em ordem crescente, uma linha em branco e em seguida, 
os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.  
*/


public class SortSimples {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[3];
		int[] ordenado = new int[3];
				
		for(int i = 0; i < 3; i++) {
			numeros[i] = Integer.parseInt(teclado.next());
			ordenado[i] = numeros[i];
		}
		Arrays.sort(ordenado);
		for(int i = 0; i < 3; i++) {
			if(i == 2) {
				System.out.print(ordenado[i]);
				break;
			}
			System.out.println(ordenado[i]);
		}
		System.out.println("\n");
		for(int i = 0; i < 3; i++) {
			System.out.println(numeros[i]);
		}
		
		teclado.close();
		
	}

}
