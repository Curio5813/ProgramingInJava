package BeecrowdAdHoc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class NumerosVirados {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Leitura de N
        int n = scanner.nextInt();

        // Leitura do vetor A usando BigInteger
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            a[i] = new BigInteger(scanner.next());
        }

        // Leitura do vetor B usando BigInteger
        BigInteger[] b = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            b[i] = new BigInteger(scanner.next());
        }

        // Leitura de K e L
        int k = scanner.nextInt();
        int l = scanner.nextInt();

        BigInteger maiorPontuacao = BigInteger.ZERO;

        // Array temporário para guardar os valores de B das K cartas escolhidas
        BigInteger[] escolhidasB = new BigInteger[k];

        // i representa quantas cartas pegamos do lado ESQUERDO
        // (k - i) representa quantas cartas pegamos do lado DIREITO
        for (int i = 0; i <= k; i++) {
            BigInteger somaAtualA = BigInteger.ZERO;
            int indexB = 0;

            // Pegar 'i' cartas da esquerda
            for (int j = 0; j < i; j++) {
                somaAtualA = somaAtualA.add(a[j]);
                escolhidasB[indexB++] = b[j];
            }

            // Pegar 'k - i' cartas da direita
            for (int j = 0; j < (k - i); j++) {
                int idxDireita = n - 1 - j;
                somaAtualA = somaAtualA.add(a[idxDireita]);
                escolhidasB[indexB++] = b[idxDireita];
            }

            // Ordenar o array B para pegar os L maiores valores
            Arrays.sort(escolhidasB);

            // Somar os L maiores elementos de B (que estão no fim do array ordenado)
            BigInteger somaAtualB = BigInteger.ZERO;
            for (int j = 0; j < l; j++) {
                somaAtualB = somaAtualB.add(escolhidasB[k - 1 - j]);
            }

            // Total desta combinação
            BigInteger totalCenario = somaAtualA.add(somaAtualB);

            // Atualizar a maior pontuação encontrada
            if (totalCenario.compareTo(maiorPontuacao) > 0) {
                maiorPontuacao = totalCenario;
            }
        }

        // Imprime o resultado final
        System.out.println(maiorPontuacao);

        scanner.close();
    }
}

