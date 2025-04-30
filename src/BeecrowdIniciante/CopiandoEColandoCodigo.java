package BeecrowdIniciante;

import java.util.Scanner;
import java.util.ArrayList;


public class CopiandoEColandoCodigo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> lista = new ArrayList<>();
		
		while(true) {
			
			String html = teclado.nextLine();
			
			if(html.equals("</html>")) {
				break;
			}
			lista.add(html);

		}
		
        boolean dentroDoBody = false;
		
		for(String linha : lista) {
			
			if(linha.contains("<body>")) {
				
				dentroDoBody = true;
				continue;
			}
			
			if(linha.contains("</body>")) {
				break;
			}
			
			if (dentroDoBody) {
                System.out.println(linha);
            }
			
		}
		
		teclado.close();
	}
	
}
