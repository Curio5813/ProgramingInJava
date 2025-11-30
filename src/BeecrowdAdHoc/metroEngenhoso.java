package BeecrowdAdHoc;

import java.util.*;

public class metroEngenhoso {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        while (true) {

            String[] entradaStr = teclado.nextLine().trim().split(" ");
            int t = Integer.parseInt(entradaStr[0]);
            int q = Integer.parseInt(entradaStr[1]);

            int distancia_total = 0;
            List<Integer> divisores = new ArrayList<>();
            List<Integer> somas = new ArrayList<>();
            String resposta = "";
            List<String> respostas = new ArrayList<>();

            if (t == 0 && q == 0) break;

            String[] teleStr = teclado.nextLine().trim().split(" ");
            List<Integer> estacoes_teletransporte = new ArrayList<>();
            for (String s : teleStr) {
                estacoes_teletransporte.add(Math.abs(Integer.parseInt(s)));
            }

            Collections.sort(estacoes_teletransporte);

            for (int i = 0; i < q; i++) {

                String[] sdStr = teclado.nextLine().trim().split(" ");
                int s = Integer.parseInt(sdStr[0]);
                int d = Integer.parseInt(sdStr[1]);

                distancia_total = Math.abs(s + d);

                for (int k = 2; k <= distancia_total; k++) {
                    if (distancia_total % k == 0 && !divisores.contains(k)) {
                        divisores.add(k);
                    }
                }

                for (int a = 0; a < divisores.size(); a++) {
                    for (int b = 0; b < divisores.size(); b++) {
                        int soma = divisores.get(a) + divisores.get(b);
                        if (!somas.contains(soma)) {
                            somas.add(soma);
                        }
                    }
                }

                Collections.sort(somas);

                boolean achou = false;

                for (int k = 0; k < divisores.size(); k++) {
                    int dv = divisores.get(k);

                    if (estacoes_teletransporte.contains(dv)
                            || (somas.contains(dv) && !estacoes_teletransporte.contains(somas.get(k)))) {

                        if (i == q - 1) resposta += "Y";
                        else resposta += "Y ";

                        achou = true;
                        divisores.clear();
                        somas.clear();
                        break;
                    }
                }

                if (!achou) {
                    if (i == q - 1) resposta += "N";
                    else resposta += "N ";
                    divisores.clear();
                    somas.clear();
                }
            }

            respostas.add(resposta);
            System.out.println(resposta);
        }
    }
}
