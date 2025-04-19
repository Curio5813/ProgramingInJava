package BeecrowdIniciante;


import java.util.Scanner;

import java.util.Locale;


/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e 
o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que 
este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar 
o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores 
de dupla precisão (double) com duas casas decimais, representando o salário 
fixo do vendedor e montante total das vendas efetuadas por este vendedor, 
respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido. 
*/

public class SalarioComBonus {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		
		double salario, vendas, total;
		
		String nome = teclado.nextLine();
		salario = Double.parseDouble(teclado.nextLine());
		vendas = Double.parseDouble(teclado.nextLine());
		
		total = salario + vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
		teclado.close();

	}

}
