package Personal;

import java.math.BigInteger;
import java.util.*;

public class TriangularCollatz {
    public static void main(String[] args) {
        long alvoOriginal = 1431655765L; // O ímpar base antes de 2^32
        Queue<Long> fila = new LinkedList<>();
        Set<Long> visitados = new HashSet<>();

        fila.add(alvoOriginal);
        visitados.add(alvoOriginal);

        System.out.println("Buscando números válidos na árvore de Collatz...");
        System.out.println("-------------------------------------------------");

        int iteracoes = 0;
        int encontrados = 0;

        // Aumentamos o limite para 1.000.000 de nós processados para dar profundidade à busca
        while (!fila.isEmpty() && iteracoes < 1_000_000) {
            long atual = fila.poll();
            iteracoes++;

            // Filtro dinâmico: Testa se atende às suas condições estritas
            if (naoTem2Nem3(atual) && ehTriangular(atual)) {
                encontrados++;
                long n = (long)((Math.sqrt(8.0 * atual + 1.0) - 1.0) / 2.0);
                System.out.printf("🎯 [%d] Número Triangular: %d | Gerador (n): %d | Termina em: %d\n",
                        encontrados, atual, n, (atual % 10));
            }

            // 1. CORREÇÃO: Removemos a barreira de 1 Trilhão para permitir que os números reais subam
            // e usem todo o espaço disponível do tipo Long do Java
            long antPar = atual * 2;
            if (antPar > 0 && antPar < Long.MAX_VALUE / 2 && visitados.add(antPar)) {
                fila.add(antPar);
            }

            // 2. Gera o antecessor ímpar (Inverso da regra 3x + 1)
            if ((atual - 1) % 3 == 0) {
                long antImpar = (atual - 1) / 3;
                if (antImpar % 2 != 0 && antImpar > 1 && visitados.add(antImpar)) {
                    fila.add(antImpar);
                }
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Busca finalizada. Total de nós processados: " + iteracoes);
    }

    // Validação matemática rápida sem conversão de texto (String)
    private static boolean naoTem2Nem3(long num) {
        if (num <= 0) return false;
        while (num > 0) {
            long digito = num % 10;
            if (digito == 2 || digito == 3) return false;
            num /= 10;
        }
        return true;
    }

    // CORREÇÃO CRÍTICA: Uso do BigInteger.sqrt() para evitar que falhas de arredondamento
    // do Math.sqrt() barrem números grandes falsamente no seu 'if'
    private static boolean ehTriangular(long x) {
        BigInteger bx = BigInteger.valueOf(x);
        BigInteger teste = bx.multiply(BigInteger.valueOf(8)).add(BigInteger.ONE);
        BigInteger raiz = teste.sqrt();
        return raiz.multiply(raiz).equals(teste);
    }
}
