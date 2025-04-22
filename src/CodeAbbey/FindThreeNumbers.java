package CodeAbbey;

import java.util.Scanner;


public class FindThreeNumbers {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int	m, n;
		
		m = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i < m; i++) {
			
			int flag = 0;
			
			n = Integer.parseInt(teclado.nextLine());
			
			for(int j = 2; j < n; j++) {
				for(int k = 2; k < n; k++) {
					for(int p = 2; p < n; p++) {
						if(j != k && k != p && p != j && n % (j * k) == 0 && n % (j * p) == 0 && n % (k * p) == 0 && (j * k * p) % n == 0) {
							System.out.println(j + " " + k + " " + p);
							flag = 1;
							break;
							
						}
					}
					if(flag == 1) {
						break;
					}
				}
				if(flag == 1) {
					break;
				}
				
			}
			if(flag == 0) {
				System.out.println(0);
			}
			
		}
		
		teclado.close();
		
	}

}
