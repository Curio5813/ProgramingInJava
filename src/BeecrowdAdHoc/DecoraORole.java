package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.Locale;


public class DecoraORole {
	
	public static void main(String[] args) {
		
	
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n, area, raio_int;
		double pi = 3.14, raio_f, vermelha = 0, azul = 0, amarela = 0;
		
		n = Integer.parseInt(teclado.nextLine());
		
		
		
		for(int i = 0; i < n; i++) {
			
			area = Integer.parseInt(teclado.nextLine());
			raio_f = Math.sqrt(area / (4.0f * pi));
			raio_int = (int) Math.round(raio_f);
			
			if(raio_int < 12) {
				vermelha = area * 0.09;
				System.out.printf("vermelho = R$%.2f\n", vermelha);
			}
			else if(raio_int >= 12 && raio_int <= 15) {
				azul = area * 0.07;
				System.out.printf("azul = R$%.2f\n", azul);
			}
			else if(raio_int > 15) {
				amarela = area * 0.05;
				System.out.printf("amarelo = R$%.2f\n", amarela);
			}
					
		}		
		
		teclado.close();
		
	}
}
