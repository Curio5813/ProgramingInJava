package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class DistribuindoPequis {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, s;
		
		
		n = teclado.nextInt();
		s = teclado.nextInt();
		
		int[] trabalhadores = new int[n];
		ArrayList<Integer> pequis = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			trabalhadores[i] = 0;
		}
		for(int i = 0; i < n; i++) {
			pequis.add(teclado.nextInt());
		}
		for(int i = 0; i < s; i++) {
			for(int j = 0; j < n; j++) {
				trabalhadores[j] += pequis.get(j);
			}
			Collections.rotate(pequis, 1);
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(trabalhadores[i] + " ");
		}
		System.out.println();
		
		teclado.close();
	}

}
