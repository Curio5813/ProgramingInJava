package BeecrowdAdHoc;

import java.util.*;
import java.io.*;

public class metroEngenhoso2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            int T = teclado.nextInt();
            int Q = teclado.nextInt();

            if (T == 0 && Q == 0) break;

            int[] t = new int[T];
            for (int i = 0; i < T; i++) {
                t[i] = teclado.nextInt();
            }

            // Calcula o gcd de todos os teletransportadores
            int g = 0;
            for (int i = 0; i < T; i++) {
                g = gcd(g, Math.abs(t[i]));
            }

            int modulo = 2 * g;

            StringBuilder resposta = new StringBuilder();

            for (int i = 0; i < Q; i++) {
                int S = teclado.nextInt();
                int D = teclado.nextInt();

                boolean ok;

                if (g == 0) {
                    // só existe 1 teletransportador
                    ok = ((S - D) % 2 == 0);
                } else {
                    ok = ((S - D) % modulo == 0);
                }

                resposta.append(ok ? 'Y' : 'N');
                if (i < Q - 1) resposta.append(' ');
            }

            System.out.println(resposta.toString());
        }

        teclado.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }
}
