package BeecrowdIniciante;

import java.util.Scanner;


public class Grenais {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int gremio = 0, inter = 0, empates = 0, novo_grenal = 1, grenais = 0;
		
		int[] gols = new int[2];	
		
		while(novo_grenal != 2) {
			
			gols[0] = Integer.parseInt(teclado.next());
			gols[1] = Integer.parseInt(teclado.next());
			
			grenais += 1;
			
			if(gols[0] > gols[1]) {
				
				inter += 1;
			}
			else if(gols[0] < gols[1]) {
				
				gremio += 1;
				
			}
			else if(gols[0] == gols[1]) {
				empates += 1;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			novo_grenal = Integer.parseInt(teclado.next());
							
		}
		
		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + inter);
		System.out.println("Gremio:" + gremio);
		System.out.println("Empates:" + empates);
		
		if(inter > gremio) {
			System.out.println("Inter venceu mais");
		}
		else if(inter < gremio) {
			System.out.println("Gremio venceu mais");
		}
		else if(inter == gremio) {
			System.out.println("Nao houve vencedor");
		}
		
		teclado.close();
	}
	
}
