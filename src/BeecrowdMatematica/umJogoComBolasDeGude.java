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
            long rodadas = 0;
            long i = 0;

            for (long j = 0; j < n; j++) {
                bacias.add(teclado.nextLong());     // ← lê como long
            }

            long soma = bacias.stream().mapToLong(Long::longValue).sum();

            while (soma > 0) {
                if (i == 0) {
                    rodadas += bacias.get((int) i);
                    bacias.set((int) i, 0L);
                    i += 1;
                }
                else if (i > 0) {

                    if (i >= n) {
                        break;
                    }

                    if (bacias.get((int) i) == 0) {
                        while (bacias.get((int) i) == 0) {
                            i += 1;
                            if (i >= n) {
                                break;
                            }
                        }
                    }

                    if (i >= n) {
                        break;
                    }

                    while (bacias.get((int) i) > 0 && i != 0) {
                        bacias.set((int) i, bacias.get((int) i) - 1);
                        rodadas += 1;

                        for (long k = i - 1; k >= 0; k--) {
                            bacias.set((int) k, bacias.get((int) k) + 1);
                            i = k;
                        }
                    }
                }

                soma = bacias.stream().mapToLong(Long::longValue).sum();
            }

            System.out.println(rodadas);

            n = teclado.nextLong();
        }

        teclado.close();
    }
}
