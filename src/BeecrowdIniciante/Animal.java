package BeecrowdIniciante;

import java.util.Scanner;


public class Animal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String filo, classe, habitos;
		
		filo = teclado.nextLine();	
		classe = teclado.nextLine();	
		habitos = teclado.nextLine();
		
		if(filo.equals("vertebrado")) {
			if(classe.equals("ave")) {
				if(habitos.equals("carnivoro")) {
					System.out.println("aguia");
				}
				if(habitos.equals("onivoro")) {
					System.out.println("pomba");
				}
			}
			if(classe.equals("mamifero")) {
				if(habitos.equals("herbivoro")) {
					System.out.println("vaca");
				}
				if(habitos.equals("onivoro")) {
					System.out.println("homem");
				}
			}
		}
		if(filo.equals("invertebrado")) {
			if(classe.equals("inseto")) {
				if(habitos.equals("hematofago")) {
					System.out.println("pulga");
				}
				if(habitos.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			}
			if(classe.equals("anelideo")) {
				if(habitos.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				if(habitos.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
		
		teclado.close();
		
	}
	
}
