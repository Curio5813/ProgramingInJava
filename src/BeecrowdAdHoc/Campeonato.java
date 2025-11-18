package BeecrowdAdHoc;

import java.util.*;

public class Campeonato {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Integer> oitavas = new ArrayList<>();
        List<List<Integer>> pares = new ArrayList<>();
        int master_kung = 0, master_fu = 0;

        for(int i = 0; i < 16; i++){
            oitavas.add(teclado.nextInt());
        }
        for(int i = 1; i < 16; i+= 2){
            List<Integer> temp = new ArrayList<>();
            temp.add(oitavas.get(i - 1));
            temp.add(oitavas.get(i));
            pares.add(temp);
        }
        for(int i = 0; i < pares.size(); i++){
            if(pares.get(i).contains(1)){
                master_kung = i + 1;
            }
            if(pares.get(i).contains(9)){
                master_fu = i + 1;
            }
        }
        int distancia = Math.abs(master_kung - master_fu);
        if(distancia == 0){
            System.out.println("oitavas");
        }
        else if ((distancia == 1 && master_fu >= 1 && master_fu <= 2 && master_kung >= 1 && master_kung <= 2) ||
                (master_fu >= 3 && master_fu <= 4 && master_kung >= 3 && master_kung <= 4)) {

            System.out.println("quartas");

        } else if ((distancia == 1 && master_fu >= 5 && master_fu <= 6 && master_kung >= 5 && master_kung <= 6) ||
                (master_fu >= 7 && master_fu <= 8 && master_kung >= 7 && master_kung <= 8)) {

            System.out.println("quartas");

        } else if ((distancia >= 2 && distancia <= 3 && master_fu >= 1 && master_fu <= 2 && master_kung >= 3 && master_kung <= 4) ||
                (master_fu >= 5 && master_fu <= 6 && master_kung >= 7 && master_kung <= 8)) {

            System.out.println("semifinal");

        } else if ((distancia >= 2 && distancia <= 3 && master_kung >= 1 && master_kung <= 2 && master_fu >= 3 && master_fu <= 4) ||
                (master_kung >= 5 && master_kung <= 6 && master_fu >= 7 && master_fu <= 8)) {

            System.out.println("semifinal");

        } else if (distancia >= 4) {

            System.out.println("final");

        } else {

            System.out.println("semifinal");
        }

        teclado.close();

    }
}
