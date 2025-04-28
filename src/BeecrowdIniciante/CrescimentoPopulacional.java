package BeecrowdIniciante;

import java.util.Scanner;


public class CrescimentoPopulacional {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int t;
		
		t = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i < t; i++) {
			
			int pa, pb, anos = 0, flag = 0;
			
			double g1, g2;
			
			pa = Integer.parseInt(teclado.next());
			pb = Integer.parseInt(teclado.next());
			g1 = Double.parseDouble(teclado.next());
			g2 = Double.parseDouble(teclado.nextLine());
			
			while(pa <= pb) {
				pa = pa + (int) (pa * (g1 / 100.0));
				pb = pb + (int) (pb * (g2 / 100.0));
				anos += 1;
				
				if(anos > 100) {
					System.out.println("Mais de 1 seculo.");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(anos + " anos.");
			}
			
		}
		
		teclado.close();
	}

}
