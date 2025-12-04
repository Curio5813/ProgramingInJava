package BeecrowdEstruturasEBibliotecas;

import java.util.*;

public class pontosDeFeno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, m, cont = 0, valor = 0;
        String descricao, texto = "";
        Map<String, Integer> dicionario = new HashMap<>();
        List<String> descricoes = new ArrayList<>();


        n = teclado.nextInt();
        m = teclado.nextInt();

        for(int i = 0; i < n; i++){
            dicionario.put(teclado.next(), teclado.nextInt());
        }
        teclado.nextLine();
        while(cont < m){
            descricao = teclado.nextLine();
            texto += descricao;
            if(texto.contains(".")){
                cont += 1;
                descricoes.add(texto);
                texto = "";
            }
        }
        for(int i = 0; i < descricoes.size(); i++){
            for (String key : dicionario.keySet()) {
                int soma = 0;
                int idx = 0;
                while ((idx = descricoes.get(i).indexOf(key, idx)) != -1) {
                    soma += 1;
                    idx += key.length();
                }

                if (soma >= 1) {
                    valor += dicionario.get(key) * soma;
                }
            }
            System.out.println(valor);
            valor = 0;
        }
        teclado.close();;
    }
}
