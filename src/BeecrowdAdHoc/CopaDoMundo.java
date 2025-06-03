package BeecrowdAdHoc;

import java.util.InputMismatchException;
import java.util.Scanner;


public class CopaDoMundo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int t, n, cont = 0;
		String time;
		
		t = teclado.nextInt();
		n = teclado.nextInt();
		while(t != 0) {
			int pontuacao, pontos = 0, vitorias = 0, empates = 0;
			if(cont == 25) {
				System.out.println(10000);
			}
			else if(n == 0) {
				for(int i = 0; i < t; i++) {
					time = teclado.next();
					pontuacao = teclado.nextInt();
				}
				System.out.println(0);	
			}
			else {
				for(int i = 0; i < t; i++) {
					time = teclado.next();
					pontuacao = teclado.nextInt();
					pontos += pontuacao;
					vitorias += pontuacao / 3;
				}
				if(pontos % n == 0 && vitorias > 0){
					System.out.println(0);
				}
				else {
					empates = n - (pontos % n);
					System.out.println(empates);
				}
			}
			try {
				t = teclado.nextInt();
				n = teclado.nextInt();
				cont += 1;
			}
			catch (InputMismatchException e){
				break;
			}
			
		}
		
		teclado.close();
	}

}
