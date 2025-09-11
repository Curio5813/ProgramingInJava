package BeecrowdAdHoc;

import java.util.Scanner;

public class arremessoDeBolas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, v;
		
		n = teclado.nextInt();
		v = teclado.nextInt();
		
		while(n != 0 && v != 0) {
			int parametro = v;
			Boolean flag = false;
			
			for(int i = parametro; i > 0; i--) {
				v = i;
				int cont = 0, distancia = 0;
				while(v > 0) {
					while(cont < v) {
						distancia += v;
						if(distancia == n) {
							flag = true;
							break;
						}
						cont += 1;
					}
					v -= 1;
					cont = 0;
					if(distancia == n || flag == true) {
						flag = true;
						System.out.println("possivel");
						break;
					}
					
				}
				if(flag) {
					break;
				}
						
			}
			if(!flag) {
				System.out.println("impossivel");
			}
			
			n = teclado.nextInt();
			v = teclado.nextInt();
			
		}
		
		teclado.close();
		
	}

}
