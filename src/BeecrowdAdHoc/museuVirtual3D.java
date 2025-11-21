package BeecrowdAdHoc;

import java.util.*;

public class museuVirtual3D {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, m;
        List<Integer> valoresModelos = new ArrayList<>();
        List<Integer> fibonacci = new ArrayList<>();

        n = teclado.nextInt();
        m = teclado.nextInt();

        while (teclado.hasNextInt()) {

            valoresModelos.clear();
            fibonacci.clear();
            for (int i = 0; i < n; i++) {
                valoresModelos.add(teclado.nextInt());
            }
            Collections.reverse(valoresModelos);
            int a = 0, b = 1;
            while (a <= 1000) {
                fibonacci.add(a);
                int prox = a + b;
                a = b;
                b = prox;
            }
            Collections.reverse(fibonacci);

            int total = 0, cont = 0;

            while (cont < m) {
                for (int i = 0; i < valoresModelos.size(); i++) {
                    if (fibonacci.contains(valoresModelos.get(i))) {
                        total += valoresModelos.get(i);
                        valoresModelos.set(i, 0);
                        cont++;
                        if (cont == m) break;
                    }
                }
            }

            System.out.println(total);

            if (!teclado.hasNextInt()) break;

            n = teclado.nextInt();
            m = teclado.nextInt();
        }

        teclado.close();
    }
}
