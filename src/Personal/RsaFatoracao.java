package Personal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class RsaFatoracao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MathContext mc = new MathContext(40); // Alta precisão para até 40 dígitos

        // 1. INPUT COM BIGINTEGER (Aceita chaves de qualquer tamanho, incluindo 20 dígitos)
        System.out.print("Digite o número da Chave Pública (Ex: 20 dígitos ou mais): ");
        BigInteger chavePublica = teclado.nextBigInteger();

        System.out.println("Calculando o ponto de partida ideal instantaneamente...");
        long tempoInicial = System.currentTimeMillis();

        // 2. FÓRMULA MATEMÁTICA RÁPIDA (Substitui o LongStream antigo)
        // Raiz quadrada da chave pública
        BigDecimal chaveDecimal = new BigDecimal(chavePublica);
        BigDecimal raizChave = chaveDecimal.sqrt(mc);

        // Multiplica a raiz por 2/3 (0.6666666...) para achar o valor exato que a divisão daria
        BigDecimal doisTercos = new BigDecimal("2").divide(new BigDecimal("3"), mc);
        BigDecimal pontoPartidaIdeal = raizChave.multiply(doisTercos, mc);

        // Define o 'divide' (base) e os novos limites do loop de busca
        BigInteger divide = pontoPartidaIdeal.toBigInteger();

        // CORREÇÃO: i começa em divide * 2
        BigInteger i = divide.multiply(BigInteger.TWO);

        // CORREÇÃO: O fim do loop precisa ser maior que o início (ex: divide * 3)
        BigInteger fim = divide.multiply(new BigInteger("3"));

        System.out.println("Resultado aproximado da divisão: " + divide);
        System.out.println("O loop começará em (divide * 2): " + i);
        System.out.println("Buscando fatores primos no intervalo até: " + fim);

        // 3. LOOP DE BUSCA COM BIGINTEGER
        boolean encontrado = false;

        while (i.compareTo(fim) <= 0) {
            // Se o resto da divisão for zero, encontramos o fator!
            if (chavePublica.mod(i).equals(BigInteger.ZERO)) {
                long tempoFinal = System.currentTimeMillis();

                System.out.println("\n--- CHAVES PRIVADAS ENCONTRADAS ---");
                System.out.println("Primo 1 (p): " + i);
                System.out.println("Primo 2 (q): " + chavePublica.divide(i));
                System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + " milissegundos");
                encontrado = true;
                break;
            }
            i = i.add(BigInteger.ONE); // Incrementa o loop com segurança
        }

        if (!encontrado) {
            System.out.println("\nNenhum fator encontrado neste intervalo específico.");
        }
        // O limite do calculo é a soma 1 a 1, mesmo que otimizada por pares e impares de
        // soma de inteiros, um chave publica de 600 digitos levaria um tempo instraponível.
        // Teria que haver uma formula para achar numeros primos, mas mesmo assim, definindo
        // um incio e fim haveria calculo. Mas a ordem dos numeros primos num forma tonaria o
        // Big(O) linear. Mas mesmo assim, o problema tende a exponencialidade.
        // É o eterno problema do 1 + 1, depois 1 + 2, e assim sucessivamente, o problema da
        // soma de 1 unidade a mais. Não há acumulação mas soma de 1 unidade.
        // No meu entender um computador quantico é inviável, pelo simples fato de não prcisar
        // de computadores clássicos para fazer operações aritimeticas elementares.

        teclado.close();
    }
}
