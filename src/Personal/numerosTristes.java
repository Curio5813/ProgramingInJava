package Personal;

import java.util.*;

public class numerosTristes {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int limite;

        limite = teclado.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> primos = new ArrayList<>();
        Set<Integer> nao_primo = new HashSet<>();

        for (int i = 2; i <= limite; i++) {
            if(nao_primo.contains(i)){
                continue;
            }
            else{
                primos.add(i);
            }
            for (int j = i * 2; j <= limite; j += i) {
                nao_primo.add(j);
            }
        }
        for (int n = 1; n <= limite; n++) {
            int soma = 0;
            int num = n;
            for (int d = n - 1; d >= 1; d--) {
                if (n % d == 0) {
                    soma += d;
                }
            }
            boolean num2 = primos.contains(soma);
            if (num2) {
                System.out.printf("%d é triste → soma=%d.%n", num, soma);
                if (n % 2 == 0) {
                    pares.add(n);
                }
            }
        }
        System.out.println("===================================================================");
        System.out.println("Diferença entre um numero triste par e o próximo numero triste par:");
        System.out.println("===================================================================");
        List<Integer> diff = new ArrayList<>();
        for (int i = 1; i < pares.size(); i++) {
            diff.add(pares.get(i) - pares.get(i - 1));
            System.out.println(pares.get(i) - pares.get(i - 1));
        }
        int maximo = Collections.max(diff);
        System.out.println(pares.size());
        System.out.println("Maior diferença entre numeros tristes pares: " + maximo);
        teclado.close();
    }
}
