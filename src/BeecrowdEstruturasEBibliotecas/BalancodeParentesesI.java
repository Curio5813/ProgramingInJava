package BeecrowdEstruturasEBibliotecas;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class BalancodeParentesesI {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		while(teclado.hasNextLine()) {
			
			Stack<Character> pilha = new Stack<Character>();
			
			ArrayList<Character> expressao = new ArrayList<Character>();
			
			String entrada = teclado.nextLine();
			
			for (char c : entrada.toCharArray()) {
	            expressao.add(c);
	        }
			
			int flag = 1;
			
			for(Character i : expressao) {
				
				if(i == ')' && pilha.size() == 0) {
					System.out.println("incorrect");
					flag = 0;
					break;
				}
				if(i == '(') {
					pilha.push(i);
				}
				else if(i == ')' && pilha.peek() == '(') {
					pilha.pop();
				}
				
			}
			
			if(pilha.size() > 0) {
				System.out.println("incorrect");
			}
			if(flag == 1 && pilha.size() == 0) {
				System.out.println("correct");
			}
			
		}
		
		teclado.close();
		
	}

}
