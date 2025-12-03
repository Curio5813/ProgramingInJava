package BeecrowdAdHoc;

import java.util.*;

public class fasesDaLua {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int d, p;

        d = teclado.nextInt();
        p = teclado.nextInt();

        if(d <= p && p <= 2){
            System.out.println("nova");
        }
        else if(d <= p && p <= 96){
            System.out.println("crescente");
        }
        else if(d <= p && p <= 100){
            System.out.println("cheia");
        }
        else if(d >= p && 2 < p && p <= 96){
            System.out.println("minguante");
        }
        else if(d >= p && 0 <= p && p <= 2){
            System.out.println("nova");
        }
        else if(d >= p && 97 <= p && p <= 100){
            System.out.println("cheia");
        }

        teclado.close();
    }
}
