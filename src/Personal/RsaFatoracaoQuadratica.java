package Personal;

import java.math.BigInteger;
import java.util.Scanner;

public class RsaFatoracaoQuadratica {

    // Calcula o Máximo Divisor Comum de forma ultra rápida
    public static BigInteger mdc(BigInteger a, BigInteger b) {
        while (!b.equals(BigInteger.ZERO)) {
            BigInteger temp = b;
            b = a.mod(b);
            a = temp;
        }
        return a;
    }

    /*
     * Motor matemático focado em encontrar x^2 - y^2 = n.
     * Altamente eficiente para chaves RSA onde p e q têm tamanhos próximos.
     */
    public static BigInteger[] fatoracaoCongruenciaQuadrados(BigInteger n) {
        System.out.println("[*] A iniciar busca avançada para N = " + n);

        // 1. Começa na raiz quadrada inteira teto de N: x = math.isqrt(n) + 1
        BigInteger x = n.sqrt().add(BigInteger.ONE);
        long ciclos = 0;

        // Salvaguarda para evitar loops infinitos: (n + 1) // 2
        BigInteger limiteMaximo = n.add(BigInteger.ONE).divide(BigInteger.TWO);

        while (true) {
            ciclos++;

            // Calcula a diferença para verificar se mapeia um quadrado perfeito: aux = x * x - n
            BigInteger aux = x.multiply(x).subtract(n);

            // y = math.isqrt(aux)
            BigInteger y = aux.sqrt();

            // Se for um quadrado perfeito, encontrámos a quebra da chave! (if y * y == aux)
            if (y.multiply(y).equals(aux)) {
                BigInteger p = x.add(y);
                BigInteger q = x.subtract(y);
                System.out.println("[+] Sucesso! Encontrado em " + ciclos + " iterações.");
                return new BigInteger[]{p, q};
            }

            // x += 1
            x = x.add(BigInteger.ONE);

            // if x > (n + 1) // 2: break
            if (x.compareTo(limiteMaximo) > 0) {
                break;
            }
        }

        return null;
    }

    // =====================================================================
    // ÁREA DE TESTE COM INPUT
    // =====================================================================
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== PROVEN FACTORIZATION ENGINE (RSA) ===");

        // Teste com uma chave pública gerada anteriormente (20 dígitos)
        // Exemplo estável: 10500000099500000209
        System.out.print("Insira a Chave Pública (Módulo N): ");
        String chaveInput = teclado.nextLine().strip();

        // Validação idêntica ao chave_input.isdigit() do Python
        if (chaveInput.matches("\\d+")) {
            BigInteger n = new BigInteger(chaveInput);

            long tempoInicial = System.currentTimeMillis();
            BigInteger[] resultado = fatoracaoCongruenciaQuadrados(n);
            long tempoFinal = System.currentTimeMillis();

            System.out.println("--------------------------------------------------");
            if (resultado != null && !resultado[0].equals(BigInteger.ONE) && !resultado[1].equals(BigInteger.ONE)) {
                BigInteger p = resultado[0];
                BigInteger q = resultado[1];

                System.out.println("[🎉 SUCESSO] Chaves privadas extraídas!");
                System.out.println("🔑 Fator p: " + p);
                System.out.println("🔑 Fator q: " + q);
                System.out.println("🔍 Validação (p * q == N): " + p.multiply(q).equals(n));
                System.out.println("⏱️ Tempo de execução: " + (tempoFinal - tempoInicial) + " milissegundos");
            } else {
                System.out.println("[-] Não foi possível fatorar com este método.");
            }
        } else {
            System.out.println("[-] Erro: Introduza apenas números.");
        }

        teclado.close();
    }
}

