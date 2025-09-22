package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class oSalaoDoClube {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int m, n, area, largura, qtd_tabuas;
		ArrayList<Integer> tabuas = new ArrayList<>();
		
		m = teclado.nextInt();
		n = teclado.nextInt();
		
		while(m != 0 && n != 0) {
			area = m * n;
			largura = teclado.nextInt();
			qtd_tabuas = teclado.nextInt();
			
			if((m * n * 100) % largura != 0) {
				System.out.println("impossivel");
			}
			else {
				int numeroTabuas = 0, soma = 0, idx = 0;
				boolean caso = false;
				ArrayList<Integer> respostas = new ArrayList<>();
				for(int i = 0; i < qtd_tabuas; i++) {
					tabuas.add(teclado.nextInt());
				}
				
				Collections.sort(tabuas);
				ArrayList<Integer> invertida = new ArrayList<>(tabuas);
				Collections.reverse(invertida);
				for(int i = 0; i < invertida.size(); i++) {
					for(int j = idx; j < tabuas.size(); j++) {
						if(i == 0 && invertida.get(i) == m) {
							numeroTabuas += 1;
							soma += invertida.get(i);
							if(soma == area) {
								respostas.add(numeroTabuas);
								caso = true;
								break;
							}
							break;
						}
						else if(invertida.get(i) == m) {
							numeroTabuas += 1;
							soma += invertida.get(i);
							if(soma == area) {
								respostas.add(numeroTabuas);
								caso = true;
								break;
							}
							idx = j + 1;
							break;
						}
						else if(invertida.get(i) + tabuas.get(j) == m) {
							numeroTabuas += 2;
							soma += invertida.get(i) + tabuas.get(j);
							if(soma == area) {
								respostas.add(numeroTabuas);
								caso = true;
								break;
							}
							idx = j + 1;
							break;
						}
					}
					if(caso) {
						break;
					}
				}
				numeroTabuas = 0;
				soma = 0;
				idx = 0;
				caso = false;
				for(int i = 0; i < invertida.size(); i++) {
					for(int j = idx; j < tabuas.size(); j++) {
						if(i == 0 && invertida.get(i) == n) {
							numeroTabuas += 1;
							soma += invertida.get(i);
							if(soma == area) {
								respostas.add(numeroTabuas);
								caso = true;
								break;
							}
							break;
						}
						else if(invertida.get(i) == n) {
							numeroTabuas += 1;
							soma += invertida.get(i);
							if(soma == area) {
								respostas.add(numeroTabuas);
								caso = true;
								break;
							}
							idx = j + 1;
							break;
						}
						else if(invertida.get(i) + tabuas.get(j) == n) {
							numeroTabuas += 2;
							soma += invertida.get(i) + tabuas.get(j);
							if(soma == area) {
								respostas.add(numeroTabuas);
								caso = true;
								break;
							}
							idx = j + 1;
							break;
						}
					}
					if(caso) {
						break;
					}
				}
				if(!respostas.isEmpty()) {
					System.out.println(Collections.min(respostas));
				} else {
					System.out.println("impossivel");
				}
			}
			m = teclado.nextInt();
			n = teclado.nextInt();
			tabuas.clear();
		}
		
		teclado.close();
	}

}
