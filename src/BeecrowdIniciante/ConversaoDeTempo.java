
package BeecrowdIniciante;


import java.util.Scanner;


/*
Leia um valor inteiro, que é o tempo de duração em segundos de um 
determinado evento em uma fábrica, e informe-o expresso no formato
horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
horas:minutos:segundos, conforme exemplo fornecido. 
*/


public class ConversaoDeTempo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int segundos, horas = 0, minutos = 0;
		
		segundos = Integer.parseInt(teclado.nextLine());
		
		while(segundos >= 3600) {
			horas += 1;
			segundos -= 3600;
		}
		while(segundos >= 60) {
			minutos += 1;
			segundos -= 60;
		}
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
			
		teclado.close();

	}

}
