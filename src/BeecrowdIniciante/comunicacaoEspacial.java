package BeecrowdIniciante;

import java.util.*;

public class comunicacaoEspacial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        List<List<Integer>> cod = new ArrayList<>();
        List<List<Double>> dts = new ArrayList<>();

        for(int i = 0; i < n; i++){
            List<Integer> ponto = new ArrayList<>();
            ponto.add(teclado.nextInt());
            ponto.add(teclado.nextInt());
            ponto.add(teclado.nextInt());
            cod.add(ponto);
        }
        for(int i = 0; i < cod.size(); i++){
            List<Double> dt = new ArrayList<>();
            for(int j = 0; j < cod.size(); j++){
                double dist = Math.sqrt(Math.pow(cod.get(j).get(0) - cod.get(i).get(0), 2)
                        + Math.pow(cod.get(j).get(1) - cod.get(i).get(1), 2)
                        + Math.pow(cod.get(j).get(2) - cod.get(i).get(2), 2));
                if(i != j){
                    dt.add(dist);
                }
            }
            dts.add(dt);
        }
        for(int i = 0; i < dts.size(); i++){
            if(Collections.min(dts.get(i)) <= 20){
                System.out.println("A");
            }
            else if(Collections.min(dts.get(i)) > 20 && Collections.min(dts.get(i)) <= 50){
                System.out.println("M");
            }
            else{
                System.out.println("B");
            }
        }
        teclado.close();
    }
}
