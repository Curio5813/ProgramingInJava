package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class ondeEstaoMeusGenes {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int teste = 1;
		
		while(true) {
			int n = teclado.nextInt();
			if(n == 0) {
				break;
			}
			ArrayList<Integer> genes = new ArrayList<>();
			for(int i = 1; i <= n; i++) {
				genes.add(i);
			}
			int numeroInversoes = teclado.nextInt();
			ArrayList<ArrayList<Integer>> inversoes = new ArrayList<>();
			for(int i = 0; i < numeroInversoes; i++) {
				ArrayList<Integer> paridade = new ArrayList<>();
			    paridade.add(teclado.nextInt());
			    paridade.add(teclado.nextInt());
			    inversoes.add(paridade);
			}
			for(int i = 0; i < inversoes.size(); i++) {
			    int a = inversoes.get(i).get(0) - 1;
			    int b = inversoes.get(i).get(1);

			    Collections.reverse(genes.subList(a, b));
			}
			System.out.println("Genome " + teste);
			int query = teclado.nextInt();
			for(int i = 0; i < query; i++) {
				int busca = teclado.nextInt();
				 int pos = genes.indexOf(busca);
				    System.out.println(pos + 1);
				
			}
			teste += 1;
			
		}
		
		teclado.close();
		
	}

}
