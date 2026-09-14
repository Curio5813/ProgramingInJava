package BeecrowdMatematica;
import java.util.*;
import java.util.Scanner;

public class ItMiha {
    public static void main(String[] args) {

        ArrayList<Integer> livres = new ArrayList<>();
        livres.add(1);

        int n = 2;
        int cont = 0;

        for (int i = 2; i < 200_000; i++) {
            int num = i;
            int tempI = i;

            while (tempI >= 1 && n <= tempI) {
                if (tempI % n == 0) {
                    tempI /= n;
                    cont += 1;
                    if (cont == 2) {
                        break;
                    }
                } else { // Equivalente a: if (tempI % n != 0)
                    n += 1;
                    if (n > tempI) {
                        break;
                    }
                    cont = 0;
                }
            }

            if (cont < 2) {
                livres.add(num);
            }

            cont = 0;
            n = 2;
        }
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            for (int j = 0; j < t; j++) {
                if (scanner.hasNextInt()) {
                    int entrada = scanner.nextInt();
                    System.out.println(livres.get(entrada - 1));
                }
            }
        }
        scanner.close();

    }
}
