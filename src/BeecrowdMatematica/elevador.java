package BeecrowdMatematica;

import java.util.*;

public class elevador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;

        n = teclado.nextInt();

        for(int i = 0; i < n; i++){
            List<Integer> estadoElevador = new ArrayList<>();
            for(int j = 0; j < 4; j++){
                estadoElevador.add(teclado.nextInt());
            }
            for(int j = 0; j < estadoElevador.size(); j++){
                int soma = estadoElevador
                        .subList(1, estadoElevador.size())
                        .stream()
                        .mapToInt(Integer::intValue)
                        .sum();
                if(estadoElevador.get(0) == 1 && estadoElevador.get(1) == 0 &&
                        estadoElevador.get(2) == 0 && estadoElevador.get(3) == 0){
                    System.out.println(0);
                    break;
                }
                else if(estadoElevador.get(0) == 0 && estadoElevador.get(1) == 0 &&
                        estadoElevador.get(2) == 0 && estadoElevador.get(3) == 0) {
                    System.out.println(0);
                    break;
                }
                else if(estadoElevador.get(0) == 0 && soma > 1) {
                    System.out.println("X");
                    break;
                }
                else if(estadoElevador.get(0) == 1 && soma > 1) {
                    System.out.println("X");
                    break;
                }
                else if(estadoElevador.get(0) == 1 && soma == 1) {
                    System.out.println(0);
                    break;
                }
                else if(estadoElevador.get(0) == 0 && soma == 1) {
                    System.out.println(1);
                    break;
                }
            }
        }
        teclado.close();
    }
}
