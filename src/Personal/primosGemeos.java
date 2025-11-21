package Personal;

import java.util.*;

public class primosGemeos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        System.out.print("Digite o limte: ");
        n = teclado.nextInt();

        List<Integer> primos = new ArrayList<>();
        List<List<Integer>> gemeos = new ArrayList<>();
        List<Integer> dist = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                if (i % j == 0 && i != j) {
                    break;
                }
                if (i % j == 0 && i == j) {
                    primos.add(i);
                }
            }
        }
        for (int i = 0; i < primos.size(); i++) {
            for (int j = 0; j < primos.size(); j++) {
                List<Integer> temp = new ArrayList<>();
                if (i != j && primos.get(i) - primos.get(j) == 2) {
                    temp.add(primos.get(i));
                    temp.add(primos.get(j));
                    gemeos.add(temp);
                }
            }
        }
        for (int i = 0; i < gemeos.size(); i++) {
            for (int j = 0; j < primos.size(); j++) {
                if (gemeos.get(i).getFirst() < primos.get(j)) {
                    dist.add(primos.get(j) - gemeos.get(i).getFirst());
                    break;
                }

            }
        }
        System.out.println("Primo 1 - Primo 2 -> Distância ao próximo número primo:");
        for (int i = 0; i < gemeos.size(); i++) {
            System.out.println(gemeos.get(i).getLast() + " " + gemeos.get(i).getFirst() + " " + dist.get(i));
        }
        int maiorValor = Collections.max(dist);
        int maior_idx = dist.indexOf(maiorValor);
        System.out.println("Maior distância encontrada:");
        System.out.println(gemeos.get(maior_idx).get(1) + " " + gemeos.get(maior_idx).get(0) + " = " + dist.get(maior_idx));
    }
}
