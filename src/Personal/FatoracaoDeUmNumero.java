package Personal;

import java.util.Scanner;


public class FatoracaoDeUmNumero {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num, n, qtd = 0, cont = 0, j = 0;
		
		int[] fatores = new int[100];
		int[] potencias = new int[100];
		
		num = Integer.parseInt(teclado.nextLine());
		n = num;
		
		for(int i = 2; i < num; i++) {
			if(n % i == 0) {
				fatores[j] = i;
				while(n % i == 0) {
					n = n / i;
					qtd += 1;
				}
				potencias[j] = qtd;
				cont += 1;
				qtd = 0;
				j += 1;
			}
			if(n == 1) {
				break;
			}
			
		}
		System.out.println("Os fatores primos que fatoram o número " + num + " são:");
		for(int i = 0; i < cont ; i++) {
			
			System.out.println(fatores[i] + "^" + potencias[i]);
		}
		
		teclado.close();
	}

}
