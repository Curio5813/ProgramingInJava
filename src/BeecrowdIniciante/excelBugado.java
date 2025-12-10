package BeecrowdIniciante;

import java.util.*;

public class excelBugado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<String> colunas = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z");
        String s;

        while(teclado.hasNext()){
            s = teclado.nextLine();
            if(s.length() > 3){
                System.out.println("Essa coluna nao existe Tobias!");
                continue;
            }
            else if(s.length() == 1){
                int idx = colunas.indexOf(s) + 1;
                System.out.println(idx);
            }
            if (s.length() == 2) {
                int a = colunas.indexOf("" + s.charAt(0)) + 1;
                int b = colunas.indexOf("" + s.charAt(1)) + 1;

                int idx = a * 26 + b;
                System.out.println(idx);
            }

            else if (s.length() == 3) {
                int a = colunas.indexOf("" + s.charAt(0)) + 1;
                int b = colunas.indexOf("" + s.charAt(1)) + 1;
                int c = colunas.indexOf("" + s.charAt(2)) + 1;

                int idx = a * 26 * 26 + b * 26 + c;

                if (idx > 16384) {
                    System.out.println("Essa coluna nao existe Tobias!");
                } else {
                    System.out.println(idx);
                }
            }

        }

        teclado.close();
    }
}
