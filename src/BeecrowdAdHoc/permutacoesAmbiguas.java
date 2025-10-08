package BeecrowdAdHoc;

import java.util.Arrays;
import java.util.Scanner;


public class permutacoesAmbiguas {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
            int n = teclado.nextInt();
            if (n == 0) break;

            int[] permutacao = new int[n];
            for (int i = 0; i < n; i++) {
                permutacao[i] = teclado.nextInt();
            }

            int[] lista = new int[n];
            for (int i = 0; i < n; i++) {
                lista[permutacao[i] - 1] = i + 1;
            }

            if (Arrays.equals(lista, permutacao)) {
                System.out.println("ambiguous");
            } else {
                System.out.println("not ambiguous");
            }
        }
        teclado.close();
	}

}
