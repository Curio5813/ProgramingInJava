package BeecrowdAdHoc;

import java.util.Scanner;


public class relogioBinario {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		while(teclado.hasNextLine()) {
			
			String entrada = teclado.nextLine().trim();
			if (entrada.isEmpty()) { 
                break;
            }
			
			String[] partes = entrada.split(":");
			int horas = Integer.parseInt(partes[0]);
			int minutos = Integer.parseInt(partes[1]);
			String[] marcaHora = {" ", " ", " ", " "};
			String[] marcaMinutos = {" ", " ", " ", " ", " ", " "};
			int[] binarioHoras = {8, 4, 2, 1};
			int[] binarioMinutos = {32, 16, 8, 4, 2, 1};
			int somaHoras = 0;
			int somaMinutos = 0;
			for(int i = 0; i < binarioHoras.length; i++) {
				if(i == 0 && horas >= binarioHoras[i]) {
					marcaHora[0] = "o";
					somaHoras += binarioHoras[0];
					if(somaHoras == horas) {
						break;
					}
				}
				if(i > 0) {
					somaHoras += binarioHoras[i];
					if(somaHoras > horas) {
						somaHoras -= binarioHoras[i];
					}
					else if(somaHoras == horas) {
						marcaHora[i] = "o";
						break;
					}
					else if(somaHoras < horas) {
						marcaHora[i] = "o";
					}
					
				}
			}
			for(int i = 0; i < binarioMinutos.length; i++) {
				if(i == 0 && minutos >= binarioMinutos[i]) {
					marcaMinutos[0] = "o";
					somaMinutos += binarioMinutos[0];
					if(somaMinutos == minutos) {
						break;
					}
				}
				if(i > 0) {
					somaMinutos += binarioMinutos[i];
					if(somaMinutos > minutos) {
						somaMinutos -= binarioMinutos[i];
					}
					else if(somaMinutos == minutos) {
						marcaMinutos[i] = "o";
						break;
					}
					else if(somaMinutos < minutos) {
						marcaMinutos[i] = "o";
					}
					
				}
			}
			
			System.out.println(" ____________________________________________");
			System.out.println("|                                            |");
			System.out.println("|    ____________________________________    |_");
			System.out.println("|   |                                    |   |_)");
			System.out.println("|   |   8         4         2         1  |   |");
			System.out.println("|   |                                    |   |");
			System.out.println("|   |   " + marcaHora[0] + "         " + marcaHora[1] + "         " + marcaHora[2] + "         " + marcaHora[3] + "  |   |");
			System.out.println("|   |                                    |   |");
			System.out.println("|   |                                    |   |");
			System.out.println("|   |   " + marcaMinutos[0] + "     " + marcaMinutos[1] + "     " + marcaMinutos[2] + "     " + marcaMinutos[3] + "     " + marcaMinutos[4] + "     " + marcaMinutos[5] + "  |   |");
			System.out.println("|   |                                    |   |");
			System.out.println("|   |   32    16    8     4     2     1  |   |_");
			System.out.println("|   |____________________________________|   |_)");
			System.out.println("|                                            |");
			System.out.println("|____________________________________________|");
			System.out.println("");
									
		}
		
		teclado.close();
		
	}

}
