package BeecrowdAdHoc;

import java.util.*;

public class Corrida1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, m;
		
		n = teclado.nextInt();
		m = teclado.nextInt();
		
		ArrayList<Integer> tempos = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int soma = 0;
			for(int j = 0; j < m; j++) {
				soma += teclado.nextInt();
			}
			tempos.add(soma);
		}
		int menorTempo = Collections.min(tempos);
        int vencedor = tempos.indexOf(menorTempo) + 1;
        
        System.out.println(vencedor);
        
        teclado.close();		
	}

}
