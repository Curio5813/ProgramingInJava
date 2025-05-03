package BeecrowdIniciante;

import java.util.Scanner;


public class Fibonot {
	
	public static void main(String[] args) {
		
		long[] fibnot = new long[100_100];
		long[] fibo = new long[100_100];
		long a = 1, b = 1, c = a + b;
		int idx1 = 0, idx2;

		for(int i = 0; i < 1000; i++) {
			
			fibo[i] = a;
			a = b;
			b = c;
			c = a + b;
			
		}
		for(int i = 1; i < 100_100; i++) {
			final long val  = i;
			int flag = 0;
			for(int j = 0; j < 1000; j++) {
				if(fibo[j] == i) {
					flag = 1;
					break;
				}
				
			}
			if(flag != 1) {
				fibnot[idx1] = val;
				idx1++;
			}
		}
		
		Scanner teclado = new Scanner(System.in);
		
		idx2 = Integer.parseInt(teclado.nextLine());
		
		System.out.println(fibnot[idx2 - 1]);
		
		teclado.close();
	}

}
