package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;

public class DistanciaEntreAmigos {

	public static void main(String[] args) {
		
	
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Integer> predios = new ArrayList<>();
		
		int n, maior = 0, distancia;
		
		n = teclado.nextInt();
		
		for(int i = 0; i < n; i++) {
			predios.add(teclado.nextInt());
		}
		
		if(n == 1) {
			maior = predios.get(0) - 1;
		}
		
		else {
			for(int i = 0; i < predios.size() - 1; i++) {
				for(int j = 1; j < predios.size(); j++) {
					distancia = predios.get(i) + (j - i) + predios.get(j);
					if(distancia > maior) {
						maior = distancia;
					}
				}
			}
		}
		
		System.out.println(maior);
		
		teclado.close();

	}
	
}
