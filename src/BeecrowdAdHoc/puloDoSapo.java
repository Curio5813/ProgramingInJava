package BeecrowdAdHoc;

import java.util.Scanner;

public class puloDoSapo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while(teclado.hasNextInt()) {
			
			int n, m;
			
			n = teclado.nextInt();
			m = teclado.nextInt();
			
			int[] pedrasSapos = new int[n];
			int[] sapo = new int[2];
			int[][] sapos = new int[m][2];
			int posicaoInicial;
			int pulo;
			
			for(int i = 0; i < n; i++) {
				pedrasSapos[i] = 0;
			}
			for(int i = 0; i < m; i++) {
				sapo[0] = teclado.nextInt();
				sapo[1] = teclado.nextInt();
				sapos[i][0] = sapo[0];
				sapos[i][1] = sapo[1];
			}
			for(int i = 0; i < m; i++) {
				posicaoInicial = sapos[i][0] - 1;
				pulo = sapos[i][1];
				for(int k = posicaoInicial; k < n; k+= pulo) {
					pedrasSapos[k] = 1;
				}
				for(int k = posicaoInicial; k >= 0; k-= pulo) {
					pedrasSapos[k] = 1;
				}
			}
			for(int i = 0; i < n; i++) {
				System.out.println(pedrasSapos[i]);
			}
			
		}
		
		teclado.close();
		
	}

}

