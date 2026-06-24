package Personal;

import java.util.*;

public class potencias_entre_pontes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um numero inteiro maior ou igual a 2: ");
        int num = teclado.nextInt();
        List<Integer> lista = new ArrayList<>();

        boolean flag1 = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo " + i);
                flag1 = true;
                break;
            }
        }
        if (!flag1) System.out.println("Primo");

        // O loop roda igual para flag1 ou !flag1 (conforme o Python)
        for (int k = 2; k <= num; k++) {
            int i = k; // 'i' é resetado para o valor do contador a cada volta
            int j = i;

            // Bloco 1: Raiz
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                i += 7;
                if (i % 2 == 0) {
                    i += 1;
                    lista.add(i);
                } else {
                    lista.add(j);
                }
            }

            // Bloco 2: (i-7)
            if ((i - 7) > 7 && (i - 7) % 5 == 0) {
                i -= 6;
                if (i % 2 == 0) {
                    lista.add(i + 1);
                } else {
                    lista.add(i);
                }
            }

            // Bloco 3: i % 2
            if (i % 2 == 0) {
                i += 1;
                if (i % 5 == 0 && i > 6) {
                    i -= 6;
                    if (i % 2 == 0) {
                        lista.add(i + 1);
                    } else {
                        lista.add(i);
                    }
                }
            }
        }

        if (!lista.isEmpty()) {
            // Soma e Máximo
            long a = 0;
            for (int val : lista) a += val;
            int g = Collections.max(lista);

            System.out.println(a + " " + g);

            if (a % 5 == 0 || a % 7 == 0 || a % 11 == 0) {
                System.out.println("Sim");
            }

            boolean flag = false;
            for (int i = 2; i < g; i++) {
                if (g % i == 0) {
                    System.out.println("Não é primo " + i);
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.println("Primo");
        }
    }
}
