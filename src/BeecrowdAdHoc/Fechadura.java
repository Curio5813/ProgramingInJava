package BeecrowdAdHoc;


import java.util.Scanner;

public class Fechadura {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, m, mov = 0;
		
		n = teclado.nextInt();
		m = teclado.nextInt();
		
		int[] pinos = new int[n];
		
		for(int i = 0; i < n; i++) {
			pinos[i] = teclado.nextInt();
		}
		for(int i = 0; i < pinos.length; i++) {
			if(pinos[i] < m && i < pinos.length - 1) {
				while(pinos[i] < m) {
					pinos[i] += 1;
					pinos[i + 1] += 1;
					mov += 1;
				}
			}
			else if(pinos[i] > m && i < pinos.length - 1) {
				while(pinos[i] > m) {
					pinos[i] -= 1;
					pinos[i + 1] -= 1;
					mov += 1;
				}
			}
		}
		System.out.println(mov);
		
		teclado.close();
	}

}
