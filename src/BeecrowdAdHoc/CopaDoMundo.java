package BeecrowdAdHoc;

import java.util.InputMismatchException;
import java.util.Scanner;


public class CopaDoMundo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		while (true) {
            int t = teclado.nextInt();
            int n = teclado.nextInt();
            
            if (t == 0 && n == 0) break;

            int soma = 0;
            for (int i = 0; i < t; i++) {
                teclado.next();
                soma += teclado.nextInt();
            }

            int empates = 3 * n - soma;
            if (empates >= 0) {
                System.out.println(empates);
            } else {
                System.out.println(0);
            }
        }

		
		teclado.close();
	}

}
