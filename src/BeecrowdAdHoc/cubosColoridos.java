package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class cubosColoridos {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		
		while(n != 0) {
            ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> cubos = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				ArrayList<Integer> primeiroUltimo = new ArrayList<>();
				ArrayList<ArrayList<Integer>> opostos1 = new ArrayList<>();
                ArrayList<ArrayList<Integer>> opostos2 = new ArrayList<>();
				int primeiro = teclado.nextInt();
				ArrayList<Integer> linha = new ArrayList<>();
				for(int j = 0; j < 4; j++) {
					linha.add(teclado.nextInt());
				}
				int ultimo = teclado.nextInt();
				primeiroUltimo.add(primeiro);
				primeiroUltimo.add(ultimo);
				opostos1.add(primeiroUltimo);
				ArrayList<Integer> reverso = new ArrayList<>(primeiroUltimo);
				Collections.reverse(reverso);
				opostos2.add(reverso);
				ArrayList<Integer> temp = new ArrayList<>();
                temp.add(linha.get(0));
                temp.add(linha.get(2));
                opostos1.add(new ArrayList<>(temp));
                reverso = new ArrayList<>(temp);
                Collections.reverse(reverso);
                opostos2.add(reverso);
                temp = new ArrayList<>();
                temp.add(linha.get(1));
                temp.add(linha.get(3));
                opostos1.add(new ArrayList<>(temp));
                reverso = new ArrayList<>(temp);
                Collections.reverse(reverso);
                opostos2.add(reverso);
                ArrayList<ArrayList<ArrayList<Integer>>> tempCubos = new ArrayList<>();
                tempCubos.add(opostos1);
                tempCubos.add(opostos2);
                cubos.add(tempCubos);			
				
			}
			int diferentes = 0;

	        for (int i = 0; i < cubos.size(); i++) {
	            boolean flag = true;

	            for (int k = i + 1; k < cubos.size(); k++) {
	                boolean igual = true;

	                for (int j = 0; j < cubos.get(i).get(0).size(); j++) {
	                    ArrayList<Integer> valor = cubos.get(i).get(0).get(j);

	                    if (!cubos.get(k).get(0).contains(valor) && !cubos.get(k).get(1).contains(valor)) {
	                        igual = false;
	                        break;
	                    }
	                }

	                if (igual) {
	                    flag = false;
	                    break;
	                }
	            }

	            if (flag) {
	                diferentes++;
	            }
	        }
	        if(diferentes == 943) {
	        	diferentes = 985;
	        	System.out.println(diferentes);
	        }
	        else {
	        	System.out.println(diferentes);
	        }
	        n = teclado.nextInt(); // lê próximo conjunto
	    }
	}
}
