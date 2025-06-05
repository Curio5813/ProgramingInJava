package BeecrowdAdHoc;

import java.util.Scanner;


public class JogoDaEstrategia {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int j, r, rodadas, k = 0, m = 0, maior = 0, jogador = 0;
	
		
		j = teclado.nextInt();
		r = teclado.nextInt();
		rodadas = j * r;
		
		int jogadores[] = new int[j];
		int rodada[] = new int[rodadas];
		
		for(int i = 0; i < j; i++) {
			jogadores[i] = 0;
		}				
		for(int i = 0; i < (j * r); i++) {
			rodada[i] = teclado.nextInt();
		}
		while(m < rodada.length) {
			while(k < j) {
				jogadores[k] += rodada[m];
				k += 1;
				m += 1;
			}
			k = 0;
		}
		for(int i = 0; i < jogadores.length; i++) {
			if(maior <= jogadores[i]) {
				jogador = i + 1;
				maior = jogadores[i];
			}
		}
		
		System.out.println(jogador);
		
		teclado.close();
		
	}

}

