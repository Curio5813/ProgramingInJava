package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


public class Uri {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		n = teclado.nextInt();
		while(n != 0) {
			int u = 0, r = 0, i = 0;
			for(int j = 0; j < n; j++) {
				int[] rodada = new int[3];
				for(int k = 0; k < 3; k++) {
					rodada[k] = teclado.nextInt();
				}
				int maximo = Arrays.stream(rodada).max().getAsInt();
				if((Math.sqrt(rodada[0]) % 2  == 0) || (Math.sqrt(rodada[0]) % Math.sqrt(2) == 0)){
					u += 1;
					if(maximo == rodada[0]) {
						u += 1;
					}
				}
				if((Math.sqrt(rodada[1]) % 2  == 0) || (Math.sqrt(rodada[1]) % Math.sqrt(2) == 0)){
					r += 1;
					if(maximo == rodada[1]) {
						r += 1;
					}
				}
				if((Math.sqrt(rodada[2]) % 2  == 0) || (Math.sqrt(rodada[2]) % Math.sqrt(2) == 0)){
					i += 1;
					if(maximo == rodada[2]) {
						i += 1;
					}
				}
				
			}
			if(u > r && u > i) {
				System.out.println("Uilton");
			}
			else if(r > u && r > i) {
				System.out.println("Rita");
			}
			else if(i > u && i > r) {
				System.out.println("Ingred");
			}
			else {
				System.out.println("URI");
			}
			
			n = teclado.nextInt();
		}
		
		teclado.close();
		
	}

}
