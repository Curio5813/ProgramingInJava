package BeecrowdMatematica;

import java.util.*;

public class qualEAAltura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int n;
        float a, b, c, x, y;

        n = teclado.nextInt();
        while(n > 0){
            a = teclado.nextInt();
            b = teclado.nextInt();
            c = teclado.nextInt();
            x = - b / (2 * a);
            y = a * x * x + b * x + c;
            System.out.printf("%.2f%n", y);
            n -= 1;
        }
        teclado.close();
    }
}
