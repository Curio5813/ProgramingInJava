package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class oSalaoDoClube {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		while (true) {
            int m = teclado.nextInt();
            int n = teclado.nextInt();
            if (m == 0 && n == 0) break;

            int area = m * n * 100;
            int largura = teclado.nextInt();
            int qtd_tabuas = teclado.nextInt();
            ArrayList<Integer> tabuas = new ArrayList<>();

            for (int i = 0; i < qtd_tabuas; i++) {
                tabuas.add(teclado.nextInt());
            }

            if (area % largura != 0) {
                System.out.println("impossivel");
                continue;
            }

            Collections.sort(tabuas);
            ArrayList<Integer> invertida = new ArrayList<>(tabuas);
            Collections.reverse(invertida);

            Integer resultadoM = tentaPreencher(m, area, largura, tabuas, invertida);
            Integer resultadoN = tentaPreencher(n, area, largura, tabuas, invertida);

            if (resultadoM != null || resultadoN != null) {
                ArrayList<Integer> respostas = new ArrayList<>();
                if (resultadoM != null) respostas.add(resultadoM);
                if (resultadoN != null) respostas.add(resultadoN);
                System.out.println(Collections.min(respostas));
            } else {
                System.out.println("impossivel");
            }
        }

        teclado.close();
    }

	    private static Integer tentaPreencher(int alvo, int area, int largura,
	        ArrayList<Integer> tabuas, ArrayList<Integer> invertida)
	    {
	        int numeroTabuas = 0, soma = 0, idx = 0;
	        for (int i = 0; i < invertida.size(); i++) {
	            for (int j = idx; j < tabuas.size(); j++) {
	                if (invertida.get(i) == alvo) {
	                    numeroTabuas += 1;
	                    soma += invertida.get(i);
	                } else if (invertida.get(i) + tabuas.get(j) == alvo) {
	                    numeroTabuas += 2;
	                    soma += invertida.get(i) + tabuas.get(j);
	                } else {
	                    continue;
	                }

	                if (soma * largura == area) {
	                    return numeroTabuas;
	                }
	                idx = j + 1;
	                break;
	            }
	        }
	        return null;
	}

}
