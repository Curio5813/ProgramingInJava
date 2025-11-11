package BeecrowdAdHoc;


import java.util.*;


public class estadosDoNorte {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String[] estados = {"roraima", "acre", "amapa", "amazonas", "para", "rondonia", "tocantins"};
		
		boolean flag = false;
		
		String estado;
		
		estado = teclado.next();
		
		for(int i = 0; i < estados.length; i++) {
			if(estado.contentEquals(estados[i])) {
				System.out.println("Regiao Norte");
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Outra regiao");
		}
		
		teclado.close();
		
	}

}

