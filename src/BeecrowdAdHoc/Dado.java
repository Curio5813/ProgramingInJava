package BeecrowdAdHoc;

import java.util.Scanner;


public class Dado {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int p, s;
		
		p = teclado.nextInt();
		s = teclado.nextInt();
		while(p != 0 && s != 0) {
			int[] armadilhas = new int[3];			
			for(int i = 0; i < 3; i++) {
				armadilhas[i] = teclado.nextInt();
			}
			int rodadas = teclado.nextInt();
			int[][] jogadores = new int[p][2];
			for(int i = 0; i < p; i++) {
				jogadores[i][0] = 0;
				jogadores[i][1] = 0;	
			}
			int soma = 0, dado1, dado2, j = 0;
			for(int i = 0; i < rodadas; i++) {
				dado1 = teclado.nextInt();
				dado2 = teclado.nextInt();
				soma = dado1 + dado2;
				if(jogadores[j][1] == 0) {
					jogadores[j][0] += soma;
					boolean contem = false;
					for (int a : armadilhas) {
					    if (a == jogadores[j][0]) {
					        contem = true;
					        break;
					    }
					}
					if(contem) {
						jogadores[j][1] = 1;
	
					}
					else if(jogadores[j][0] > s) {
						System.out.println(j + 1);
						break;
					}
				}
				else if(jogadores[j][1] == 1) {
					jogadores[j][1] = 0;
					j += 1;
					if(j >= p) {
						j = 0;
					}
					while(jogadores[j][1] == 1) {
						jogadores[j][1] = 0;
						j += 1;
						if(j >= p) {
							j = 0;
						}
					}
					jogadores[j][0] += soma;
					if(jogadores[j][0] > s) {
						System.out.println(j + 1);
						break;
					}
	
				}
				j += 1;
				if(j >= p) {
					j = 0;
				}
				
			}
			p = teclado.nextInt();
			s = teclado.nextInt();
			
		}
		
		teclado.close();
		
	}

}
