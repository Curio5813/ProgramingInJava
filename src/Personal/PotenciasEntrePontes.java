package Personal;

import java.math.BigInteger;
import java.util.Scanner;

public class PotenciasEntrePontes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um numero inteiro maior ou igual a 2: ");
        String inputStr = scanner.nextLine();
        scanner.close();

        BigInteger num = new BigInteger(inputStr);

        // 1. Validação rápida de primalidade do input principal
        int flag1 = 0;
        if (num.compareTo(BigInteger.TWO) < 0) {
            flag1 = 1;
        } else {
            // Testa divisores até à raiz quadrada aproximada do número para não travar
            BigInteger limiteSqrt = sqrt(num);
            for (BigInteger i = BigInteger.TWO; i.compareTo(limiteSqrt) <= 0; i = i.add(BigInteger.ONE)) {
                if (num.mod(i).equals(BigInteger.ZERO)) {
                    System.out.println("Não é primo, é divisível por: " + i);
                    flag1 = 1;
                    break;
                }
            }
        }

        if (flag1 == 0) {
            System.out.println("Primo");
        }

        // Acumuladores primitivos de alto desempenho para poupar RAM
        long somaA = 0;
        long maxG = 0;

        // 2. Ciclo de regras lógicas convertidas do 'while' do Python
        // Usamos loops locais eficientes para os contadores numéricos da sequência
        long limiteNum = num.longValueExact(); // Nota: Converte para processamento rápido se couber em long
        long i = 2;

        while (i <= limiteNum) {
            long j = i;
            double raiz = Math.sqrt(i);

            // Regra 1: Raiz quadrada exata
            if (raiz == (int) raiz) {
                i += 7;
                if (i % 2 == 0) {
                    i += 1;
                    somaA += i;
                    if (i > maxG) maxG = i;
                } else {
                    somaA += j;
                    if (j > maxG) maxG = j;
                }
            }

            // Regra 2: Resíduo de 5
            if ((i - 7) > 7 && (i - 7) % 5 == 0) {
                i -= 6;
                if (i % 2 == 0) {
                    long valor = i + 1;
                    somaA += valor;
                    if (valor > maxG) maxG = valor;
                } else {
                    somaA += i;
                    if (i > maxG) maxG = i;
                }
            }

            // Regra 3: Paridade e múltiplos de 5
            if (i % 2 == 0) {
                i += 1;
                if (i % 5 == 0 && i > 6) {
                    i -= 6;
                    if (i % 2 == 0) {
                        long valor = i + 1;
                        somaA += valor;
                        if (valor > maxG) maxG = valor;
                    } else {
                        somaA += i;
                        if (i > maxG) maxG = i;
                    }
                }
            }

            i++; // Avança o contador com segurança
        }

        // 3. Impressão dos resultados acumulados em tempo real
        System.out.println("\n--- RESULTADOS ACUMULADOS (JAVA) ---");
        System.out.println("Soma acumulada (a): " + somaA);
        System.out.println("Maior valor na sequência (g): " + maxG);

        if (somaA % 5 == 0 || somaA % 7 == 0 || somaA % 11 == 0) {
            System.out.println("Propriedade de divisibilidade confirmada (Sim)");
        }

        // 4. Validação rápida de primalidade do maior valor (g)
        int flag = 0;
        if (maxG < 2) {
            flag = 1;
        } else {
            long limiteSqrtG = (long) Math.sqrt(maxG);
            for (long k = 2; k <= limiteSqrtG; k++) {
                if (maxG % k == 0) {
                    System.out.println("g Não é primo, é divisível por: " + k);
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0 && maxG >= 2) {
            System.out.println("g é Primo");
        }
    }

    /**
     * Função auxiliar para calcular a raiz quadrada de um BigInteger (Newton-Raphson)
     */
    private static BigInteger sqrt(BigInteger val) {
        if (val.compareTo(BigInteger.ZERO) == 0 || val.compareTo(BigInteger.ONE) == 0) {
            return val;
        }
        BigInteger de2 = BigInteger.valueOf(2);
        BigInteger x0 = val.divide(de2);
        BigInteger x1 = x0.add(val.divide(x0)).divide(de2);
        while (x1.compareTo(x0) < 0) {
            x0 = x1;
            x1 = x0.add(val.divide(x0)).divide(de2);
        }
        return x0;
    }
}

