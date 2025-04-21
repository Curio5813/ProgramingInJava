package BeecrowdIniciante;

import java.util.Scanner;


public class Distancia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int distancia, tempo;
		
		distancia = Integer.parseInt(teclado.nextLine());
		
		tempo = distancia * 2;
		
		System.out.println(tempo + " minutos");
		
		teclado.close();

	}

}
