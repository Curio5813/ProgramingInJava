package BeecrowdIniciante;


import java.util.Scanner;


public class TesteDeSelecaoUm {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c, d;
		
		a = Integer.parseInt(teclado.next());
		b = Integer.parseInt(teclado.next());
		c = Integer.parseInt(teclado.next());
		d = Integer.parseInt(teclado.next());
		
		if(b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		
		teclado.close();
		
	}

}
