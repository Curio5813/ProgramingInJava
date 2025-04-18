package BeecrowdIniciante;

import java.util.Scanner;

/*
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma 
entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes 
e depois da igualdade seguido pelo valor correspondente à soma de A e B. Como todos os 
problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você 
receberá "Presentation Error".

 */

public class SomaSimples {

	public static void main(String[] args) {
		
		int numero1, numero2, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		numero1 = Integer.parseInt(teclado.nextLine());
		numero2 = Integer.parseInt(teclado.nextLine());
		
		soma = numero1 + numero2;
		
		System.out.println("SOMA = " + soma);
		
		teclado.close();

				
	}

}
