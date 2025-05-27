package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;


public class OndeEstaoMinhasChaves {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int q, e, escritorio;
		ArrayList<Integer> ultima_semana = new ArrayList<>();
		
		q = teclado.nextInt();
		e = teclado.nextInt();
		
		for(int i = 0; i < e; i++) {
			ultima_semana.add(teclado.nextInt());
		}		
		for(int i = 0; i < q; i++) {
			escritorio = teclado.nextInt();
			if(ultima_semana.contains(escritorio)) {
				System.out.println(0);
			}
			else {
				ultima_semana.add(escritorio);
				System.out.println(1);
			}
		}
		
		teclado.close();
		
	}

}
