package BeecrowdIniciante;

import java.util.Scanner;

import java.util.Locale;


public class AumentoDeSalario {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		int flag = 0;
		float salario, reajuste;
		
		salario = Float.parseFloat(teclado.nextLine());
		reajuste = salario;
		
		if(0 <= salario && salario <= 400.00) {
			salario = (float) (salario * 1.15);
			reajuste = salario - reajuste;
			flag = 1;
		}
		else if(400.01 <= salario && salario <= 800.00) {
			salario = (float) (salario * 1.12);
			reajuste = salario - reajuste;
			flag = 2;

		}
		else if(800.01 <= salario && salario <= 1200.00) {
			salario = (float) (salario * 1.10);
			reajuste = salario - reajuste;
			flag = 3;

		}
		else if(1200.01 <= salario && salario <= 2000.00) {
			salario = (float) (salario * 1.07);
			reajuste = salario - reajuste;
			flag = 4;

		}
		else if(salario > 2000.00) {
			salario = (float) (salario * 1.04);
			reajuste = salario - reajuste;
			flag = 5;

		}
		
		System.out.printf("Novo salario: %.2f\n", salario);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		if(flag == 1) {
			System.out.println("Em percentual: 15 %");
		}
		else if(flag == 2) {
			System.out.println("Em percentual: 12 %");
		}
		else if(flag == 3) {
			System.out.println("Em percentual: 10 %");
		}
		else if(flag == 4) {
			System.out.println("Em percentual: 7 %");
		}
		else if(flag == 5) {
			System.out.println("Em percentual: 4 %");
		}
		
		teclado.close();
		
	}

}

