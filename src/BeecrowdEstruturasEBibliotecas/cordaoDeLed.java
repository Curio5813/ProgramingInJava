package BeecrowdEstruturasEBibliotecas;

import java.util.*;

public class cordaoDeLed {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, l, i = 0, j = 1;
        boolean flag = false;

        n = teclado.nextInt();
        l = teclado.nextInt();

        List<List<Integer>> pedacos = new ArrayList<>();
        for(int k = 0; k < l; k++){
            List<Integer> pedaco = new ArrayList<>();
            pedaco.add(teclado.nextInt());
            pedaco.add(teclado.nextInt());
            pedacos.add(pedaco);
        }
        while(true){
            while (i < pedacos.size()){
                if (j >= pedacos.size()) {
                    break;
                }
                if(pedacos.get(i).get(1).equals(pedacos.get(j).get(0)) && !pedacos.get(j).get(1).equals(n)){
                    pedacos.set(i, pedacos.get(j));
                    i = 0;
                    j = 1;
                    continue;
                }
                else if(pedacos.get(i).get(1).equals(pedacos.get(j).get(0)) && pedacos.get(j).get(1).equals(n)){
                    flag = true;
                    break;
                }
                j += 1;
                if(j > pedacos.size()){
                    break;
                }
            }
            i += 1;
            if(flag){
                System.out.println("COMPLETO");
                break;
            }
            if(i >= pedacos.size()){
                break;
            }
            j = 1;
        }
        if(!flag){
            System.out.println("INCOMPLETO");
        }
        teclado.close();
    }
}
