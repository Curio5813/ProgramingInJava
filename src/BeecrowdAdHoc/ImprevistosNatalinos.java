package BeecrowdAdHoc;

import java.util.Scanner;


public class ImprevistosNatalinos {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] entrada = new int[4];
		
		for(int i = 0; i < 4; i++) {
			entrada[i] = Integer.parseInt(teclado.next());
		}
		if((entrada[1] - entrada[2] - entrada[3] - 1) >= entrada[0]) {
			System.out.println("Igor feliz!");
		}
		else if((entrada[1] - entrada[2] - entrada[3] -1) < entrada[0] && entrada[2] <= entrada[3] / 2) {
			System.out.println("Igor bolado!");
		}
		else if((entrada[1] - entrada[2] - entrada[3] - 1) < entrada[0] && entrada[2] > entrada[3] / 2) {
			System.out.println("Caio, a culpa eh sua!");
		}
		
		teclado.close();
		
	}

}
