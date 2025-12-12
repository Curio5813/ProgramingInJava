package BeecrowdIniciante;

import java.util.*;

public class ajudePatatatitu {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int n = teclado.nextInt();
        teclado.nextLine();

        List<String> danger = new ArrayList<>();

        for(int i = 0; i < n; i++){

            int t = teclado.nextInt();;
            teclado.nextLine();

            for(int j = 0; j < t; j++){
                danger.add(teclado.nextLine());
            }

            int u = teclado.nextInt();
            teclado.nextLine();

            for(int k = 0; k < u; k++) {

                String experiencia = teclado.nextLine();
                boolean flag = false;

                for (String m : danger) {

                    if (experiencia.contains(m)) {

                        int idx_1 = experiencia.lastIndexOf(m);
                        int idx_f = idx_1 + m.length() - 1;

                        if (experiencia.length() == m.length() || idx_f == experiencia.length() - 1) {
                            flag = true;
                            break;

                        } else if(idx_f + 1 < experiencia.length()){
                            char c = experiencia.charAt(idx_f + 1);
                            if ("0123456789abcdefghijklmnopqrstuvwxyz".indexOf(c) == -1) {
                                flag = true;
                                break;
                            }
                        }

                    }

                }
                System.out.println(flag ? "Abortar" : "Prossiga");

            }
            if (i < n - 1) System.out.println();
        }
        teclado.close();
    }
}
