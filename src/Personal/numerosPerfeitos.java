package Personal;

public class numerosPerfeitos {

    public static void main(String[] args) {

        for(int i = 1; i < 100000 + 1; i++){
            int soma = 0;
            for(int j = i - 1; j >= 1; j--){
                if(i % j == 0){
                    soma += j;
                    if(soma > i){
                        break;
                    }
                }
            }
            if(soma == i){
                System.out.println(i + " é um numero perfeito.");
            }
        }

    }

}
