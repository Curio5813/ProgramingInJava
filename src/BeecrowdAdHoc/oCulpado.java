package BeecrowdAdHoc;

import java.util.Scanner;


public class oCulpado {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			
			int n = teclado.nextInt();
			
			if(n == 0) {
				break;
			}
			int[] alunos = new int[n];
			for(int j = 0; j < n; j++) {
				alunos[j] = teclado.nextInt();
			}
			int i = teclado.nextInt() - 1;
			while(i < alunos.length) {
				if(i == alunos.length - 1) {
					if(alunos[i] == i + 1) {
						System.out.println(alunos[i]);
						break;
					}
					else {
						i = alunos[i] - 1;
					}
				}
				if(alunos[i] == i + 1) {
					System.out.println(alunos[i]);
					break;
				}
				i = alunos[i] - 1;
			}
			
		}
		
		teclado.close();
	}

}
