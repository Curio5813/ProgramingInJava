package BeecrowdMatematica;

import java.util.*;

public class umJogoComBolasDeGude {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        long n;   // ← antes era int

        n = teclado.nextLong();
        while (teclado.hasNextLong()) {
            if (n == 0) {
                break;
            }

            List<Long> bacias = new ArrayList<>();   // ← agora é List<Long>
            long rodadas = 0, pDois = 1;
            int i = 0, cont = 0;

            for (long j = 0; j < n; j++) {
                bacias.add(teclado.nextLong());     // ← lê como long
            }
            while(cont < n){
                rodadas += bacias.get(i) * pDois;
                i += 1;
                pDois *= 2;
                cont += 1;
            }
            System.out.println(rodadas);
            n = teclado.nextLong();
        }

        teclado.close();
    }
}
