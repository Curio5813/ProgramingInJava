package BeecrowdAdHoc;

import java.util.Scanner;
import java.math.BigInteger;

public class OCriptografoEnvergonhado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        while(teclado.hasNextInt()){

            BigInteger k = new BigInteger(teclado.next());
            int lp;

            lp = teclado.nextInt();

            if(k.equals(BigInteger.ZERO) && lp == 0){
                break;
            }
            boolean flag = true;
            for(int i = 2; i < lp; i++){
                // Converte 'i' para BigInteger e verifica se o resto da divisão é igual a ZERO
                if (k.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    System.out.println("BAD " + i);
                    flag = false;
                }
            if(flag){
                System.out.println("GOOD");
            }
            cont += 1;
            }
        }

        teclado.close();
    }
}
