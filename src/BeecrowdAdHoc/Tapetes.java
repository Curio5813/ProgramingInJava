package BeecrowdAdHoc;

import java.util.Scanner;


public class Tapetes {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int l, n;
		
		l = Integer.parseInt(teclado.next());
		n = Integer.parseInt(teclado.next());
		
		long tapete = n - 1;
		
		long areas = tapete;
		
		long restante = l - tapete;
		
		areas += restante * restante;
		
		System.out.println(areas);
		
		teclado.close();
		
	}
}

