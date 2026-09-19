package BeecrowdIniciante;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class QuantosPrimos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int pergunta = teclado.nextInt();
        for(int i = 0; i < pergunta; i++){
            int num1 = teclado.nextInt();
            int num2 = teclado.nextInt();
            int cont = 0;
            int a = 2;
            boolean flag = false;
            for(int j = num1; j <= num2; j++){
                int limite = (int) sqrt(j);
                for(int k = a; k <= limite; k++){
                    if(j % k == 0 && j != k){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    cont += 1;
                }
            }
            System.out.println(cont);
        }

    teclado.close();

    }
}
