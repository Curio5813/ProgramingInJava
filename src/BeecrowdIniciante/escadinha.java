package BeecrowdIniciante;

import java.util.*;

public class escadinha {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, escadinhas = 0, i = 1, diferenca;
        List<Integer> numeros = new ArrayList<>();
        List<Integer> diff = new ArrayList<>();

        n = teclado.nextInt();
        for(int k = 0; k < n; k++){
            numeros.add(teclado.nextInt());
        }
        while(i <= numeros.size() - 1){
            for(int j = i; j < numeros.size(); j++){
                diferenca = numeros.get(j) - numeros.get(j - 1);
                if(!diff.isEmpty() && diferenca == diff.get(diff.size() - 1)){
                    diff.add(diferenca);
                    i += 1;
                }
                else {
                    diff.add(diferenca);
                    escadinhas += 1;
                    i += 1;
                    break;
                }
            }
        }
        if(diff.isEmpty()){
            System.out.println(1);
        }
        else{
            System.out.println(escadinhas);
        }
        teclado.close();
    }
}
