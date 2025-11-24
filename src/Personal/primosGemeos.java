package Personal;

import java.util.*;

public class primosGemeos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        System.out.print("Digite o limte: ");
        n = teclado.nextInt();

        List<Integer> primos = new ArrayList<>();
        Set<Integer> nao_primo = new HashSet<>();
        List<List<Integer>> gemeos = new ArrayList<>();
        List<Integer> dist = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if(nao_primo.contains(i)){
                continue;
            }
            else{
                primos.add(i);
            }
            for (int j = i * 2; j <= n; j += i) {
                nao_primo.add(j);
            }
        }
        for (int i = 0; i < primos.size(); i++) {
            for (int j = 0; j < primos.size(); j++) {
                List<Integer> temp = new ArrayList<>();
                if (i != j && primos.get(i) - primos.get(j) == 2) {
                    temp.add(primos.get(j));
                    temp.add(primos.get(i));
                    gemeos.add(temp);
                    break;
                }
            }
        }
        for (int i = 0; i < gemeos.size(); i++) {
            for (int j = 0; j < primos.size(); j++) {
                int maior = gemeos.get(i).get(1);
                if (maior < primos.get(j)) {
                    dist.add(primos.get(j) - gemeos.get(i).get(1));
                    break;
                }

            }
        }
        int tamDist = dist.size();
        int tamGemeo = gemeos.size();
        System.out.println(tamGemeo + " " + tamDist);
        System.out.println("Primo 1 - Primo 2 -> Distância ao próximo número primo:");
        for (int i = 0; i < dist.size(); i++) {
            int maior = gemeos.get(i).get(1);
            int menor = gemeos.get(i).get(0);
            System.out.println(menor + " " + maior + " " + dist.get(i));
        }
        int maiorValor = Collections.max(dist);
        int maior_idx = dist.indexOf(maiorValor);

        System.out.println("Maior distância encontrada:");
        System.out.println(gemeos.get(maior_idx).get(0) + " " + gemeos.get(maior_idx).get(1) + " " + (gemeos.get(maior_idx).get(1) +  dist.get(maior_idx)) + " = " + dist.get(maior_idx));

        teclado.close();
    }
}
