package BeecrowdMatematica;

import java.util.*;

public class contagemDeDigitos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            int a = teclado.nextInt();
            int b = teclado.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            String digitos = "0123456789";
            List<Long> qtd = new ArrayList<>();

            for (int k = 0; k < digitos.length(); k++) {
                char digito = digitos.charAt(k);
                long cont = 0;

                for (int i = a; i <= b; i++) {
                    String strI = String.valueOf(i);
                    for (int j = 0; j < strI.length(); j++) {
                        if (strI.charAt(j) == digito) {
                            cont++;
                        }
                    }
                }
                qtd.add(cont);
            }
            for (int i = 0; i < qtd.size(); i++) {
                System.out.print(qtd.get(i));
                if (i != qtd.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        teclado.close();
    }
}
