package Personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class potenciasEntrePontes {

    private static final BigDecimal EULER =
            new BigDecimal("2.718281828459045235360287471352662497757247093699959574966967");

    static class ResultadoQuadrado {
        BigInteger valor;
        int inicio;
        int fim;
        BigInteger raiz;

        public ResultadoQuadrado(BigInteger valor, int inicio, int fim, BigInteger raiz) {
            this.valor = valor;
            this.inicio = inicio;
            this.fim = fim;
            this.raiz = raiz;
        }
    }

    // sqrt manual (compatível com qualquer Java)
    public static BigInteger sqrt(BigInteger x) {
        BigInteger r = BigInteger.ZERO;
        BigInteger bit = BigInteger.ONE.shiftLeft(x.bitLength() / 2 + 1);

        while (bit.compareTo(BigInteger.ZERO) > 0) {
            BigInteger t = r.add(bit);
            if (t.multiply(t).compareTo(x) <= 0) {
                r = t;
            }
            bit = bit.shiftRight(1);
        }
        return r;
    }

    public static List<ResultadoQuadrado> encontrarQuadradosSubnumeros(String numeroStr) {
        int n = numeroStr.length();
        List<ResultadoQuadrado> resultados = new ArrayList<>();

        for (int tamanho = 1; tamanho <= n; tamanho++) {
            for (int inicio = 0; inicio <= n - tamanho; inicio++) {

                String subStr = numeroStr.substring(inicio, inicio + tamanho);
                if (subStr.isEmpty()) continue;

                BigInteger valor = new BigInteger(subStr);
                BigInteger raiz = sqrt(valor);

                if (raiz.multiply(raiz).equals(valor)) {
                    resultados.add(new ResultadoQuadrado(
                            valor,
                            inicio + 1,
                            inicio + tamanho,
                            raiz
                    ));
                }
            }
        }

        resultados.sort((a, b) -> b.valor.compareTo(a.valor));
        return resultados;
    }

    public static BigInteger calcularMediana(List<BigInteger> lista) {
        if (lista == null || lista.isEmpty()) return BigInteger.ZERO;

        List<BigInteger> ordenada = new ArrayList<>(lista);
        Collections.sort(ordenada);

        int n = ordenada.size();

        if (n % 2 == 1) {
            return ordenada.get(n / 2);
        } else {
            return ordenada.get(n / 2 - 1)
                    .add(ordenada.get(n / 2))
                    .divide(BigInteger.TWO);
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("=== MENU ===");
            System.out.println("1 - Processar chave (quadrados + fatoração heurística)");
            System.out.print("Escolha: ");

            String opcao = reader.readLine();

            if (!"1".equals(opcao)) {
                System.out.println("Opção inválida.");
                return;
            }

            System.out.print("\nDigite a chave numérica: ");
            String numero = reader.readLine();

            if (numero == null || numero.trim().isEmpty()) {
                System.out.println("Erro: entrada vazia.");
                return;
            }

            numero = numero.replaceAll("\\s+", "");

            System.out.println("\n[*] A analisar subnúmeros...");

            List<ResultadoQuadrado> quadrados = encontrarQuadradosSubnumeros(numero);

            System.out.println("Quadrados encontrados: " + quadrados.size());

            List<BigInteger> modulacao = new ArrayList<>();

            BigInteger modulo = new BigInteger(numero);
            int tam = numero.length();

            for (ResultadoQuadrado q : quadrados) {

                BigInteger biInicio = BigInteger.valueOf(q.inicio);
                BigInteger biFim = BigInteger.valueOf(q.fim);

                BigInteger base = q.raiz.multiply(biInicio).multiply(biFim);

                BigDecimal val = new BigDecimal(base).add(EULER);

                BigInteger tentativa = val.toBigInteger();

                if (!tentativa.equals(BigInteger.ZERO)) {
                    modulacao.add(tentativa);
                }
            }

            System.out.println("Modulação gerada: " + modulacao.size());

            if (modulacao.isEmpty()) {
                System.out.println("Nenhuma modulação gerada.");
                return;
            }

            BigInteger mediana = calcularMediana(modulacao);
            BigInteger min = Collections.min(modulacao);
            BigInteger max = Collections.max(modulacao);

            System.out.println("\nMin: " + min);
            System.out.println("Mediana: " + mediana);
            System.out.println("Max: " + max);

            BigInteger chave = BigInteger.ZERO;

            BigInteger limInf = min.multiply(BigInteger.TEN);
            BigInteger limMed = mediana;
            BigInteger limSup = max.divide(BigInteger.TEN);

            System.out.println("\n[*] Varredura...");

            // 1 - crescente
            for (BigInteger j = limInf; j.compareTo(limMed) < 0; j = j.add(BigInteger.TWO)) {
                if (!j.equals(BigInteger.ZERO) && modulo.mod(j).equals(BigInteger.ZERO)) {
                    chave = j;
                    break;
                }
            }

            // 2 - decrescente
            if (chave.equals(BigInteger.ZERO)) {
                for (BigInteger j = limSup; j.compareTo(limMed) > 0; j = j.subtract(BigInteger.TWO)) {
                    if (!j.equals(BigInteger.ZERO) && modulo.mod(j).equals(BigInteger.ZERO)) {
                        chave = j;
                        break;
                    }
                }
            }

            if (chave.equals(BigInteger.ZERO)) {
                System.out.println("Nenhum fator encontrado.");
            } else {
                System.out.println("\n✔ Fator encontrado!");
                System.out.println("p = " + chave);
                System.out.println("q = " + modulo.divide(chave));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
