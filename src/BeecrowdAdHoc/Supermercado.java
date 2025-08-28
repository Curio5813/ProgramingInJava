package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;



public class Supermercado {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		
		int m, n;
		
		m = teclado.nextInt();
		n = teclado.nextInt();		
		
		while(m != 0 && n != 00) {
			
			ArrayList<Integer> lista_compras = new ArrayList<>();
			ArrayList<Integer> corredor_supermercado = new ArrayList<>();
			ArrayList<Float> preco = new ArrayList<>();
			ArrayList<Float> montantes = new ArrayList<>();
			int cont = 0;
			
			for(int i = 0; i < m; i++) {
				lista_compras.add(teclado.nextInt());
			}
			for(int i = 0; i < n; i++) {
				corredor_supermercado.add(teclado.nextInt());
				preco.add(teclado.nextFloat());
			}
			for(int i = 0; i < n; i++) {
				int j = 0;
				float maior = 0, montante = 0;
				ArrayList<Integer> usados = new ArrayList<>();
				cont += 1;
				for(int k = 0; k < n; k++) {
					if(corredor_supermercado.get(k) == lista_compras.get(j)) {
						if(usados.size() == 0) {
							maior = preco.get(k);
							montante += preco.get(k);
							usados.add(lista_compras.get(j));
						}
						else if(preco.get(k) > maior || usados.size() == 1) {
							montante += preco.get(k);
							maior = preco.get(k);
							usados.add(lista_compras.get(j));
						}
						else if(j == lista_compras.size() - 1 && preco.get(k) < maior) {
							montante -= maior;
							montante += preco.get(k);
							maior = preco.get(k);
							usados.add(lista_compras.get(j));
						}
						else if(j < lista_compras.size() - 1 && lista_compras.get(j + 1) == lista_compras.get(j) 
								&& preco.get(k) < maior) {
							montante += preco.get(k);
							maior = preco.get(k);
							usados.add(lista_compras.get(j));
							j += 1;
						}
						else if(j < lista_compras.size() - 1 && lista_compras.get(j + 1) != lista_compras.get(j) 
								&& preco.get(k) < maior) {
							montante -= maior;
							montante += preco.get(k);
							maior = preco.get(k);
							usados.add(lista_compras.get(j));
						}
						j += 1;
						if(j == lista_compras.size()) {
							j -= 1;
						}
						int ultimo = usados.get(usados.size() - 1);
						int contLista = Collections.frequency(lista_compras, ultimo);
						int contUsados = Collections.frequency(usados, ultimo);
						if(contLista > contUsados) {
							j -= 1;
						}
						if(cont >= lista_compras.size() && j < 1) {
							j += 1;
							cont = 0;
							if(j == lista_compras.size()) {
								j -= 1;
							}
						}
						else if(cont >= lista_compras.size() && j >= 1) {
							j += 1;
							cont = 0;
							if(j == lista_compras.size()) {
								j -= 1;
							}
						}
					}
					if (usados.size() >= lista_compras.size()) {
					    int p = j;
					    for (int o = 0; o < usados.size() && p < lista_compras.size(); o++) {
					        if (usados.get(o).equals(lista_compras.get(p))) {
					           p++;
					        }
					    }
					    if (p == lista_compras.size()) {
					        montantes.add(montante);
					    }
					}

				}
					
			}
			if(montantes.size() > 0) {
				float minimo = Collections.min(montantes);
				System.out.printf("%.2f%n", minimo);
			}
			else {
				System.out.println("Impossible");
			}
			m = teclado.nextInt();
			n = teclado.nextInt();
		}
				
		teclado.close();
		
	}
	
}
