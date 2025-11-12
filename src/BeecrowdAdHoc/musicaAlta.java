package BeecrowdAdHoc;


import java.util.*;
import static java.lang.Math.*;


public class musicaAlta {
	
	public static void main(String[] args) {
		
		   Scanner teclado = new Scanner(System.in);

	        int n = Integer.parseInt(teclado.nextLine().trim());
	        while (n > 0) {
	            String[] linha = teclado.nextLine().trim().split("\\s+");
	            int k = Integer.parseInt(linha[0]);
	            int j = Integer.parseInt(linha[1]);

	            ArrayList<ArrayList<String>> mapa = new ArrayList<>();
	            for (int i = 0; i < j; i++) {
	                String linhaMapa = teclado.nextLine().trim();
	                ArrayList<String> colunas = new ArrayList<>();
	                for (int c = 0; c < linhaMapa.length(); c++) {
	                    colunas.add(String.valueOf(linhaMapa.charAt(c)));
	                }
	                mapa.add(colunas);
	            }
	            ArrayList<ArrayList<Integer>> mapaDist = new ArrayList<>();
	            int dist = 10;
	            for (int i = 0; i < mapa.size(); i++) {
	                ArrayList<Integer> temp = new ArrayList<>();
	                for (int m = 0; m < mapa.get(i).size(); m++) {
	                    temp.add(dist);
	                    dist += 10;
	                }
	                dist = 10;
	                mapaDist.add(temp);
	            }
	            ArrayList<Integer> coord = new ArrayList<>();
	            int altura = 0;
	            boolean flag = false;

	            for (int i = 0; i < mapa.size(); i++) {
	                for (int m = 0; m < mapa.get(i).size(); m++) {
	                    String valor = mapa.get(i).get(m);
	                    if (valor.equals("F") || valor.equals("J")) {
	                        coord.add(mapaDist.get(i).get(m));
	                        flag = true;
	                    }
	                }
	                if (coord.size() == 2) break;
	                if (flag) altura += 10;
	            }

	            if (coord.size() == 2) {
	                int distFJ = (int) sqrt(pow(abs(coord.get(0) - coord.get(1)), 2) + pow(altura, 2));
	                int alturaMaxima = (int) floor(k / pow(0.99, distFJ));
	                System.out.println(alturaMaxima + " dBs");
	            }

	            n--;
	        }

	        teclado.close();
	}

}
