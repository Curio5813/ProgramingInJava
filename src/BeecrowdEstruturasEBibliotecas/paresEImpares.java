package BeecrowdEstruturasEBibliotecas;

import java.util.*;

public class paresEImpares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, numero;
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        n = teclado.nextInt();
        for(int i = 0; i < n; i++){
            numero = teclado.nextInt();
            if(numero % 2 == 0){
                pares.add(numero);
            }
            if(numero % 2 == 1){
                impares.add(numero);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);
        for(int i = 0; i < pares.size(); i++){
            System.out.println(pares.get(i));
        }
        for(int i = 0; i < impares.size(); i++){
            System.out.println(impares.get(i));
        }
        teclado.close();
    }
}
