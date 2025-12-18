package BeecrowdIniciante;

import java.util.*;

public class fervendoVegetais {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double t = teclado.nextDouble();
        int n = teclado.nextInt();

        List<Integer> w = new ArrayList<>();

        for(int i = 0; i < n; i++){
            w.add(teclado.nextInt());
        }
        int wSoma = 0;
        for(int i = 0; i < w.size(); i++){
            wSoma += w.get(i);
        }
        double p = wSoma - wSoma * t;
        int cortes = 0, pedacos = 0;
        for(int i = 2; i <= wSoma; i++){
            while(wSoma % i == 0 && wSoma > p){
                wSoma /= i;
                cortes += i - 1;
                pedacos += i;
            }
            if(wSoma <= p){
                break;
            }

        }
        System.out.println(pedacos - cortes);
        teclado.close();

    }
}
