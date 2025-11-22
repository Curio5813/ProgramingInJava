package BeecrowdAdHoc;

import java.util.*;

public class museuVirtual3D {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, m;
        List<Integer> valoresModelos = new ArrayList<>();
        List<Integer> fibonacci = new ArrayList<>();

        n = teclado.nextInt();
        m = teclado.nextInt();

        while (teclado.hasNextInt()) {
            valoresModelos.clear();
            for (int i = 0; i < n; i++) {
                valoresModelos.add(teclado.nextInt());
            }
            Collections.reverse(valoresModelos);
            int total = 0, cont = 0;
            for(int i = 0; i < valoresModelos.size(); i++){
                if(cont == m){
                    break;
                }
                total += valoresModelos.get(i);
                cont += 1;
            }
            System.out.println(total);

            if (!teclado.hasNextInt()) break;

            n = teclado.nextInt();
            m = teclado.nextInt();
        }

        teclado.close();
    }
}
