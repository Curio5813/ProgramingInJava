package BeecrowdAdHoc;

import java.util.Scanner;


public class SomaDeDoisQuadrado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, aprox, quadrado1, quadrado2;
		
		while(teclado.hasNextInt()) {
			
			numero = teclado.nextInt();
			
			int flag = 0;
			
			aprox = (int) Math.abs(Math.sqrt(numero));
			
			for(int i = 0; i <= aprox; i++) {
				for(int j = 0; j <= aprox; j++) {
					quadrado1 = i * i;
					quadrado2 = j * j;
					if(quadrado1 + quadrado2 == numero) {
						System.out.println("YES");
						flag = 1;
						break;
					}
					
				}
				if(flag  == 1) {
					break;
				}
			}
			if(flag == 0) {
				System.out.println("NO");
			}			
			
		}
		
		teclado.close();

	}

}
