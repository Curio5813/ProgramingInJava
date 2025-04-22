package BeecrowdIniciante;

import java.util.Scanner;

public class TempoDeJogoComMinutos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int hora_init, min_init, hora_fin, min_fin, horas = 0, minutos = 0;
		
		hora_init = Integer.parseInt(teclado.next());
		min_init = Integer.parseInt(teclado.next());
		hora_fin = Integer.parseInt(teclado.next());
		min_fin = Integer.parseInt(teclado.next());
		
		
		if(hora_init == hora_fin && min_init == min_fin) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)" );
		}
		else if(hora_init == hora_fin && min_init > min_fin) {
			horas = 23;
			minutos = 60 - (min_init - min_fin);
			System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
		}
		else {
			if(hora_init < hora_fin) {
				horas = hora_fin - hora_init;
			}
			else if(hora_init > hora_fin) {
				horas = (24 - (hora_init - hora_fin));
			}
			if(min_init <= min_fin) {
				minutos = min_fin - min_init;
			}
			else if(min_init > min_fin) {
				minutos = (60 - (min_init - min_fin));
				horas -= 1;
			}
			System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
		}
			
		teclado.close();
		
	}

}
