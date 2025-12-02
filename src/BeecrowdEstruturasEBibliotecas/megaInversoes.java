package BeecrowdEstruturasEBibliotecas;

import java.util.*;

public class megaInversoes {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, cont = 0;

        n = teclado.nextInt();

        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < n; i++){
            lista.add(teclado.nextInt());
        }
        for(int i = 1; i < lista.size(); i++){
            int maiores = 0;
            int menores = 0;
            for(int j = 0; j < i; j++){
                if(lista.get(j) > lista.get(i)){
                    maiores += 1;
                }
            }
            for(int k = i + 1; k < n; k++){
                if(lista.get(i) > lista.get(k)){
                    menores += 1;
                }
            }
            cont += maiores * menores;
        }
        System.out.println(cont);
        teclado.close();;
    }
}
