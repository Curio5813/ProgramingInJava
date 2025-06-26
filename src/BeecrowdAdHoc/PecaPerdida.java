package BeecrowdAdHoc;

import java.util.ArrayList;
import java.util.Scanner;


public class PecaPerdida {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Integer> pecas = new ArrayList<Integer>();
		
		int n;
		
		n = teclado.nextInt();
		
		for(int i = 0; i < n - 1; i++) {
			pecas.add(teclado.nextInt());
		}
		
		pecas.sort(null);
		
		for(int i = 1; i <= n; i++) {
			if(!pecas.contains(i)) {
				System.out.println(i);
				break;
			}
		}
		
		teclado.close();
	}

}
