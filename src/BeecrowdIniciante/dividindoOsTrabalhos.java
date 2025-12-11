package BeecrowdIniciante;

import java.util.*;

public class dividindoOsTrabalhos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNextInt()){
            int n = teclado.nextInt();
            List<Integer> trabalhos = new ArrayList<>();
            for(int i = 0; i < n; i++){
                trabalhos.add(teclado.nextInt());
            }
            int somaTotal = 0;
            for (int x : trabalhos) somaTotal += x;

            int rangel = 0;
            int melhor = Integer.MAX_VALUE;

            for (int i = 0; i < trabalhos.size(); i++) {
                rangel += trabalhos.get(i);
                int gugu = somaTotal - rangel;
                int diff = Math.abs(rangel - gugu);

                if (diff < melhor)
                    melhor = diff;

                if (diff == 0)
                    break;
            }
            System.out.println(melhor);
        }
        teclado.close();
    }
}
