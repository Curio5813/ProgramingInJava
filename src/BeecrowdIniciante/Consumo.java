package BeecrowdIniciante;


import java.util.Scanner;

import java.util.Locale;


/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância 
total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando 
a distância total percorrida (em Km), e um valor real Y representando 
o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas 
após a vírgula, seguido da mensagem "km/l". 
*/


public class Consumo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int distancia;
		
		double consumo, media;
		
		distancia = Integer.parseInt(teclado.nextLine());
		consumo = Double.parseDouble(teclado.nextLine());
		
		media = distancia / consumo;
		
		System.out.printf("%.3f", media);
		System.out.printf(" km/l\n");
		
				
		teclado.close();

	}

}
