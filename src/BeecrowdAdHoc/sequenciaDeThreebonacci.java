package BeecrowdAdHoc;

import java.util.*;

public class sequenciaDeThreebonacci {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        while(teclado.hasNextInt()){
            n = teclado.nextInt();
            List<Long> threebonacci = new ArrayList<>();
            long a = 1, b = 1, p = 2;
            int tamLista = 0;
            while(tamLista < n){
                String numStr = Long.toString(a);
                if(a % 3 == 0){
                    threebonacci.add(a);
                    tamLista += 1;
                }
                else if(numStr.contains("3")){
                    threebonacci.add(a);
                    tamLista += 1;
                }
                a = b;
                b = p;
                p = a + b;
            }
            System.out.println(threebonacci.get(threebonacci.size() - 1));
        }
        teclado.close();
    }
}
