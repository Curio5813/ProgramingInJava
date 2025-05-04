package BeecrowdAdHoc;

import java.util.*;

public class OsPresentesDoNoel {
    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);

        // Entrada: número de ações
        int n = teclado.nextInt();
        List<Integer> acoesCrianca = new ArrayList<>();

        // Entrada: lista das ações
        for (int i = 0; i < n; i++) {
            acoesCrianca.add(teclado.nextInt());
        }

        // Ordena a lista
        Collections.sort(acoesCrianca);

        List<List<Integer>> pares = new ArrayList<>();
        Set<Integer> jaContados = new HashSet<>();

        for (int i = 0; i < acoesCrianca.size(); i++) {
            int acao = acoesCrianca.get(i);
            if (!jaContados.contains(acao)) {
                int freq = Collections.frequency(acoesCrianca, acao);
                List<Integer> par = new ArrayList<>();
                par.add(acao);
                par.add(freq);
                pares.add(par);
                jaContados.add(acao);
            }
        }

        int presentes = 0;
        int bonus = 1;

        for (int i = 0; i < pares.size(); i++) {
            int freq = pares.get(i).get(1);

            if (i == 0 && freq == 1) {
                presentes += 1;
                bonus += 1;
            } else if (i == 0 && freq > 1) {
                presentes += freq;
                bonus += 1;
            } else if (i > 0 && freq > 1) {
                presentes += freq * bonus;
                bonus += 1;
            } else if (i > 0 && freq == 1) {
                presentes += bonus;
                bonus += 1;
            }
        }

        System.out.println(presentes);

        teclado.close();
    }
}
