package BeecrowdAdHoc;

import java.util.*;

public class oTabuleiroEsburacado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        List<Integer> movCavalo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            movCavalo.add(teclado.nextInt());
        }

        List<List<Integer>> buracos = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList(1, 3),
                        Arrays.asList(2, 3),
                        Arrays.asList(2, 5),
                        Arrays.asList(5, 4)
                )
        );

        List<Integer> posCavalo = new ArrayList<>(Arrays.asList(4, 3));
        int movimentos = 0;
        boolean caiu = false;

        for (int i = 0; i < movCavalo.size(); i++) {

            int mov = movCavalo.get(i);

            if (mov == 1) {
                posCavalo.set(0, posCavalo.get(0) + 1);
                posCavalo.set(1, posCavalo.get(1) + 2);
            }
            else if (mov == 8) {
                posCavalo.set(0, posCavalo.get(0) - 1);
                posCavalo.set(1, posCavalo.get(1) + 2);
            }
            else if (mov == 2) {
                posCavalo.set(0, posCavalo.get(0) + 2);
                posCavalo.set(1, posCavalo.get(1) + 1);
            }
            else if (mov == 7) {
                posCavalo.set(0, posCavalo.get(0) - 2);
                posCavalo.set(1, posCavalo.get(1) + 1);
            }
            else if (mov == 3) {
                posCavalo.set(0, posCavalo.get(0) + 2);
                posCavalo.set(1, posCavalo.get(1) - 1);
            }
            else if (mov == 6) {
                posCavalo.set(0, posCavalo.get(0) - 2);
                posCavalo.set(1, posCavalo.get(1) - 1);
            }
            else if (mov == 4) {
                posCavalo.set(0, posCavalo.get(0) + 1);
                posCavalo.set(1, posCavalo.get(1) - 2);
            }
            else if (mov == 5) {
                posCavalo.set(0, posCavalo.get(0) - 1);
                posCavalo.set(1, posCavalo.get(1) - 2);
            }

            if (buracos.contains(Arrays.asList(posCavalo.get(0), posCavalo.get(1)))) {
                caiu = true;
                movimentos++;
                break;
            }

            movimentos++;
        }

        System.out.println(movimentos);
        teclado.close();
    }
}
