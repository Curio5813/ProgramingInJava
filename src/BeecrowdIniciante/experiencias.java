package BeecrowdIniciante;

import java.util.Scanner;
import java.util.Locale;


public class experiencias {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		int n, qtd, c = 0, r = 0, s = 0, total = 0;
		
		double c_per, r_per, s_per;
		
		char cobaias;
		
		n = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i < n; i++) {
			
			qtd = teclado.nextInt();
			cobaias = teclado.next().charAt(0);
			
			if(cobaias == 'C') {
				c += qtd;				
			}
			else if(cobaias == 'R') {
				r += qtd;
			}
			else if(cobaias == 'S') {
				s += qtd;
			}
			total += qtd;
		}
		
		c_per = ((double) c / (double) total) * 100.00;
		r_per = ((double) r / (double) total) * 100.00;
		s_per = ((double) s / (double) total) * 100.00;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos: " + r);
		System.out.println("Total de sapos: " + s);
		System.out.printf("Percentual de coelhos: %.2f", c_per);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f", r_per);
		System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f", s_per);
		System.out.println(" %");
		
		teclado.close();
		
	}

}
