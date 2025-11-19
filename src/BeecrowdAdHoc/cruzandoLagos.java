package BeecrowdAdHoc;

import java.util.*;

public class cruzandoLagos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        List<String> gelo = new ArrayList<>();

        n = teclado.nextInt();
        teclado.nextLine();
        for(int i = 0; i < n; i++) {
            gelo.add(teclado.nextLine());
        }
        int largura = 0, pulos = 0;
        boolean flag = false;
        for(int i = 0; i < gelo.size(); i++){
            String c = gelo.get(i);
            if(c.charAt(0) == '-' && flag && largura <= 2){
                pulos += 1;
                largura = 0;
                flag = false;
            }
            else if(c.charAt(0) == '.'){
                largura += 1;
                if(largura >= 3){
                    flag = true;
                    break;
                }
                flag = true;
            }
        }
        if(flag && largura >= 3){
            System.out.println("N");
        }
        if(!flag || largura <= 2){
            if(pulos == 0){
                System.out.println(1);
            }
            else{
                System.out.println(pulos);
            }
        }
        teclado.close();
    }
}
