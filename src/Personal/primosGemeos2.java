package Personal;

import java.util.*;

public class primosGemeos2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o limite: ");
        int n = teclado.nextInt();

        // 1) Gerar todos os primos até n usando crivo (muito mais rápido)
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 2) Criar lista de primos
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primos.add(i);
        }

        // 3) Encontrar pares de primos gêmeos
        List<int[]> gemeos = new ArrayList<>();
        for (int i = 0; i < primos.size() - 1; i++) {
            if (primos.get(i + 1) - primos.get(i) == 2) {
                gemeos.add(new int[]{primos.get(i), primos.get(i + 1)});
            }
        }

        // 4) Para cada par gêmeo, achar o próximo primo
        List<Integer> distancias = new ArrayList<>();

        for (int[] twin : gemeos) {
            int maior = twin[1];
            int proxPrimo = -1;

            for (int p : primos) {
                if (p > maior) {
                    proxPrimo = p;
                    break;
                }
            }

            if (proxPrimo != -1) {
                distancias.add(proxPrimo - maior);
            }
        }

        // 5) Exibir resultados
        System.out.println("\nTotal de pares gêmeos encontrados: " + gemeos.size());
        System.out.println("Total de distâncias calculadas: " + distancias.size());

        System.out.println("\nPrimo1 - Primo2 -> Distância ao próximo primo:");
        for (int i = 0; i < distancias.size(); i++) {
            int[] g = gemeos.get(i);
            System.out.println(g[0] + " " + g[1] + " -> " + distancias.get(i));
        }

        // 6) Maior distância
        int maiorDist = Collections.max(distancias);
        int idx = distancias.indexOf(maiorDist);
        int[] g = gemeos.get(idx);

        System.out.println("\nMaior distância encontrada:");
        System.out.println(g[0] + " " + g[1] + " " + (g[1] + maiorDist) +
                " = " + maiorDist);
    }

}
