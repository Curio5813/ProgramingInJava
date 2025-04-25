package BeecrowdIniciante;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;


public class TempoDeUmEvento {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dias = 0, horas = 0, minutos = 0;
		
        String diaInicioStr = teclado.nextLine(); 
        String horaInicioStr = teclado.nextLine();
        String diaFimStr = teclado.nextLine();
        String horaFimStr = teclado.nextLine();
 
        int diaInicio = Integer.parseInt(diaInicioStr.split(" ")[1]);
        String[] tempoInicio = horaInicioStr.split(" : ");
        int horaInicio = Integer.parseInt(tempoInicio[0].trim());
        int minutoInicio = Integer.parseInt(tempoInicio[1].trim());
        int segundoInicio = Integer.parseInt(tempoInicio[2].trim());

        int diaFim = Integer.parseInt(diaFimStr.split(" ")[1]);
        String[] tempoFim = horaFimStr.split(" : ");
        int horaFim = Integer.parseInt(tempoFim[0].trim());
        int minutoFim = Integer.parseInt(tempoFim[1].trim());
        int segundoFim = Integer.parseInt(tempoFim[2].trim());

        LocalDateTime inicio = LocalDateTime.of(2025, 1, diaInicio, horaInicio, 
        		minutoInicio, segundoInicio);
        LocalDateTime fim = LocalDateTime.of(2025, 1, diaFim, horaFim, 
        		minutoFim, segundoFim);
        
        Duration duracao = Duration.between(inicio, fim);
        
        long tempo = duracao.getSeconds();
        
        while(tempo >= 86400) {
        	tempo -= 86400;
        	dias += 1;
        }
        while(tempo >= 3600) {
        	tempo -= 3600;
        	horas += 1;
        }
        while(tempo >= 60) {
        	tempo -= 60;
        	minutos += 1;
        }
        
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(tempo + " segundo(s)");
        
        teclado.close();
	}

}
