package BeecrowdAdHoc;

import java.util.Scanner;


public class Shuffle {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
	
		while(teclado.hasNextInt()) {
			int m = teclado.nextInt();
			int k = teclado.nextInt();
			
			int todasMusicas[] = new int[m];
			int musicasOuvidas[] = new int[m];
			int duracaoMusicas[] = new int[m];
			int ordemAleatoria[] = new int[k];
			int duracaoTotal = 0, cont = 0, flag = 0;
			
			for(int i = 0; i < m; i++) {
				todasMusicas[i] = i + 1;
			}
			for(int i = 0; i < m; i++) {
				duracaoMusicas[i] = teclado.nextInt();
			}
			for(int i = 0; i < k; i++) {
				ordemAleatoria[i] = teclado.nextInt();
			}
			for(int i = 0; i < k; i++) {
				duracaoTotal += duracaoMusicas[ordemAleatoria[i] - 1];
				for(int j = 0; j < cont; j++) {
					if(musicasOuvidas[j] == ordemAleatoria[i]) {
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					musicasOuvidas[cont] = ordemAleatoria[i];
					cont += 1;
					if(cont == m) {
						flag = 2;
						break;
					}
				}
				if(flag == 1) {
					flag = 0;
				}
			
			}
			if(flag == 2) {
				System.out.println(duracaoTotal);
			}
			else {
				System.out.println(-1);
			}
			
		}
		
		teclado.close();
		
	}

}
