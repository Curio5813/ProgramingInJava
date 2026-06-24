package Personal;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class potenciasEntrePontes {

    public static boolean ehPrimo(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        long limite = (long) Math.sqrt(n);
        for (long i = 3; i <= limite; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void executarBuscaPrimos() {
        long inicio = 300000;
        long fim = 400000;

        long tempoInicial = System.nanoTime();
        int totalPrimos = 0;
        for (long i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                totalPrimos++;
            }
        }
        long tempoFinal = System.nanoTime();
        double tempoGasto = (tempoFinal - tempoInicial) / 1_000_000.0;

        System.out.printf("\n[Resultado] Total de primos encontrados: %d\n", totalPrimos);
        System.out.printf("Tempo de execução: %.2f milissegundos\n\n", tempoGasto);
    }

    public static class ElementoQuadrado {
        BigInteger valor;
        int posI;
        int posF;
        BigInteger raiz;

        public ElementoQuadrado(BigInteger valor, int posI, int posF, BigInteger raiz) {
            this.valor = valor;
            this.posI = posI;
            this.posF = posF;
            this.raiz = raiz;
        }

        @Override
        public String toString() {
            return "[" + valor + ", " + posI + ", " + posF + ", " + raiz + "]";
        }
    }

    public static List<ElementoQuadrado> encontrarQuadradosSubnumeros(String numeroStr) {
        int n = numeroStr.length();
        List<ElementoQuadrado> resultados = new ArrayList<>();

        for (int tamanho = 1; tamanho <= n; tamanho++) {
            for (int inicio = 0; inicio <= n - tamanho; inicio++) {
                String subStr = numeroStr.substring(inicio, inicio + tamanho);
                if (subStr.isEmpty()) continue;

                BigInteger valor = new BigInteger(subStr);

                if (valor.equals(BigInteger.ZERO)) {
                    resultados.add(new ElementoQuadrado(valor, inicio + 1, inicio + tamanho, BigInteger.ZERO));
                } else {
                    BigInteger raiz = valor.sqrt();
                    if (raiz.multiply(raiz).equals(valor)) {
                        resultados.add(new ElementoQuadrado(valor, inicio + 1, inicio + tamanho, raiz));
                    }
                }
            }
        }

        resultados.sort((o1, o2) -> o2.valor.compareTo(o1.valor));
        return resultados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU DE TESTES ===");
        System.out.println("1 - Contar primos no intervalo (300k a 400k)");
        System.out.println("2 - Procurar quadrados perfeitos na chave de 50 dígitos");
        System.out.print("Escolha uma opção (1 ou 2): ");
        String opcao = scanner.nextLine();

        if (opcao.equals("1")) {
            executarBuscaPrimos();
        } else if (opcao.equals("2")) {
            System.out.print("\nDigite a chave pública aqui: ");
            String modulo50Digitos = scanner.nextLine().trim();

            List<ElementoQuadrado> quadradosPerfeitos = encontrarQuadradosSubnumeros(modulo50Digitos);

            System.out.println("\nLista de listas (ordenada por valor decrescente):");

            List<BigInteger> modulacao = new ArrayList<>();
            BigInteger moduloInteiro = new BigInteger(modulo50Digitos);
            int tamChave = modulo50Digitos.length();

            int cont = 0;
            for (int j = 0; j < quadradosPerfeitos.size(); j++) {
                ElementoQuadrado quadradoAtual = quadradosPerfeitos.get(j);

                BigInteger tentativaPrimo = quadradoAtual.raiz
                        .multiply(BigInteger.valueOf(quadradoAtual.posI))
                        .multiply(BigInteger.valueOf(quadradoAtual.posF));

                int rigor = tentativaPrimo.toString().length();
                int expoente = (tamChave / 2) - rigor;

                if (expoente > 0) {
                    BigInteger multiplicador = BigInteger.TEN.pow(expoente);
                    modulacao.add(tentativaPrimo.multiply(multiplicador));
                } else {
                    modulacao.add(tentativaPrimo);
                }

                cont++;
                if (cont >= 5) break;
            }

            BigInteger chaveEncontrada = BigInteger.ZERO;
            cont = 0;

            for (int j = 0; j < modulacao.size(); j++) {
                BigInteger inicioTeste = modulacao.get(j);

                // Força o início a ser no mínimo 2
                if (inicioTeste.compareTo(BigInteger.TWO) < 0) {
                    inicioTeste = BigInteger.TWO;
                }

                // Ajusta para o próximo ímpar se for par e maior que 2
                if (inicioTeste.getLowestSetBit() != 0 && inicioTeste.compareTo(BigInteger.TWO) > 0) {
                    inicioTeste = inicioTeste.add(BigInteger.ONE);
                }

                long limiteBusca = 5000000;
                BigInteger passo = inicioTeste.equals(BigInteger.TWO) ? BigInteger.ONE : BigInteger.TWO;

                BigInteger k = inicioTeste;
                BigInteger limiteFinal = inicioTeste.add(BigInteger.valueOf(limiteBusca));

                while (k.compareTo(limiteFinal) < 0) {
                    // Só testa a divisão se o k for um número que cabe num long para usar a função ehPrimo rápido
                    if (k.bitLength() <= 62) {
                        long kLong = k.longValue();
                        if (ehPrimo(kLong)) {
                            if (moduloInteiro.remainder(k).equals(BigInteger.ZERO)) {
                                chaveEncontrada = k;
                                break;
                            }
                        }
                    } else {
                        // Se k for maior que o limite de um long, usa teste probabilístico nativo do BigInteger
                        if (k.isProbablePrime(15)) {
                            if (moduloInteiro.remainder(k).equals(BigInteger.ZERO)) {
                                chaveEncontrada = k;
                                break;
                            }
                        }
                    }
                    k = k.add(passo);
                }

                if (!chaveEncontrada.equals(BigInteger.ZERO)) break;

                cont++;
                if (cont >= 5) break;
            }

            if (!chaveEncontrada.equals(BigInteger.ZERO)) {
                System.out.println("Chave1: " + chaveEncontrada + " e Chave2: " + moduloInteiro.divide(chaveEncontrada));
            } else {
                System.out.println("Chave1: 0 e Chave2: Fatores não encontrados no raio de busca.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
