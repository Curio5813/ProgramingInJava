package BeecrowdMatematica;

import java.util.*;

public class algumaSorte {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNextLong()) {
            Long numero = teclado.nextLong();
            String strNum = String.valueOf(numero);

            boolean sortudo = true;
            for (char c : strNum.toCharArray()) {
                if (c != '4' && c != '7') {
                    sortudo = false;
                    break;
                }
            }

            if (sortudo) {
                System.out.println("sortudo");
            } else {
                boolean quaseSortudo = false;
                for (int i = 1; i <= numero; i++) {
                    String strI = String.valueOf(i);
                    boolean iSortudo = true;

                    for (char c : strI.toCharArray()) {
                        if (c != '4' && c != '7') {
                            iSortudo = false;
                            break;
                        }
                    }
                    if (iSortudo && numero % i == 0) {
                        quaseSortudo = true;
                        break;
                    }
                }
                if (quaseSortudo) {
                    System.out.println("quase sortudo");
                } else {
                    System.out.println("azarado");
                }
            }
        }

        teclado.close();
    }
}
