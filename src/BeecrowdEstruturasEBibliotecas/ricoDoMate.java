package BeecrowdEstruturasEBibliotecas;

import java.util.*;

public class ricoDoMate {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int n, cont = 0;
        float l, q, ultimaCuia = 0;
        List<String> pessoas = new ArrayList<>();

        n = teclado.nextInt();
        l = teclado.nextFloat();
        q = teclado.nextFloat();
        for(int i = 0; i < n; i++){
            pessoas.add(teclado.next());
        }
        while(l > 0){
            l -= q;
            l = Math.round(l * 10f) / 10f;
            if(l <= 0){
                ultimaCuia = l + q;
                break;
            }
            cont += 1;
            if(cont == n){
                cont = 0;
            }
        }
        String saida = String.format("%.1f", ultimaCuia);
        System.out.println(pessoas.get(cont) + " " + saida);

    teclado.close();
    }
}
