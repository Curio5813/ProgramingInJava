package BeecrowdAdHoc;

import java.util.Scanner;



public class desenhandoOEdificio {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while(teclado.hasNext()) {
			
			int n = teclado.nextInt();
			
			for(int i = 0; i < n; i++) {
				int pisosDisponiveis = teclado.nextInt();
				int[] andares = new int[pisosDisponiveis];
				for(int j = 0; j < pisosDisponiveis; j++) {
					int andar = teclado.nextInt();
					andares[j] = andar;	
				}
				for(int j = 0; j < andares.length; j++) {
					for(int k = 0; k < andares.length; k++) {
						if(Math.abs(andares[j]) < Math.abs(andares[k])) {
							int temp = andares[j];
							andares[j] = andares[k];
							andares[k] = temp;
						}
					}
				}
				int piso = 0, pisos = 0;
				for(int j = 0; j < andares.length; j++) {
					if(j == 0) {
						piso = andares[j];
						pisos += 1;
					}
					if(j > 0 && piso > 0) {
						if(andares[j] < piso) {
							piso = andares[j];
							pisos += 1;
						}
					}
					else if(j > 0 && piso < 0) {
						if(andares[j] > piso) {
							piso = andares[j];
							pisos += 1;
						}
					}
				}
				System.out.println(pisos);
			}
			
		}
		
		teclado.close();
		
	}

}
