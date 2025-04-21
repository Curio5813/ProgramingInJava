package BeecrowdIniciante;

import java.util.Scanner;


public class IdadeEmDias {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade, anos = 0, meses = 0, dias = 0;
		
		idade = Integer.parseInt(teclado.nextLine());
		
		while(idade >= 365) {
			idade -= 365;
			anos += 1;
		}
		System.out.println(anos + " ano(s)");
		while(idade >= 30) {
			idade -= 30;
			meses += 1;
		}
		dias = idade;
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		teclado.close();
		
	}

}
