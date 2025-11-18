package BeecrowdAdHoc;

import java.util.*;

public class escritaRapidaODuelo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int am, rm, em, av, rv, ev, tempo_m, tempo_v;
        String frase;

        am = teclado.nextInt();
        rm = teclado.nextInt();
        em = teclado.nextInt();
        av = teclado.nextInt();
        rv = teclado.nextInt();
        ev = teclado.nextInt();
        teclado.next();
        frase = teclado.nextLine();

        int tamanho_frase = frase.length();

        tempo_m = tamanho_frase * em + 2 * am + rm;
        tempo_v = tamanho_frase * ev + 2 * av + rv;
        if(tempo_m == tempo_v){
            System.out.println("Empate");
        }
        else if(tempo_m < tempo_v){
            System.out.println("Matheus");
        }
        else {
            System.out.println("Vinicius");
        }

        teclado.close();
    }
}
