package BeecrowdAdHoc;

import java.util.*;

public class Elevador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        boolean flag = true;

        n = teclado.nextInt();
        List<Integer> caixas = new ArrayList<>();
        for(int i = 0; i < n; i++){
            caixas.add(teclado.nextInt());
        }
        caixas.sort(null);
        for(int i = 0; i < caixas.size(); i++){
            for(int j = i + 1; j < caixas.size(); j++){
                if(i == 0 && caixas.get(i) > 8){
                    flag = false;
                    break;
                }
                if(caixas.get(j) - caixas.get(i) > 8){
                    flag = false;
                    break;
                }
                if(caixas.get(j) - caixas.get(i) <= 8){
                    break;
                }
            }
            if(!flag){
                System.out.println('N');
                break;
            }
        }
        if(flag) {
            System.out.println('S');
        }

        teclado.close();
    }
}
