package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Simulador {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<ArrayList<String>> instrucoes = new ArrayList<>();

		while (teclado.hasNextLine()) {
		    String linha = teclado.nextLine().trim();
		    if (linha.isEmpty()) break;

		    String[] partes = linha.split(" ");
		    
		    ArrayList<String> entrada = new ArrayList<>();
		    for (String p : partes) {
		        entrada.add(p);
		    }
		    instrucoes.add(entrada);
		}
		
		HashMap<String, Integer> memoria = new HashMap<>();
		for (ArrayList<String> instr : instrucoes) {
		    String var = instr.get(0);
		    int valorInt;

		    if (instr.size() == 3) {
		        valorInt = Integer.parseInt(instr.get(2));
		    } else {
		        String x = instr.get(2);
		        String y = instr.get(4);

		        int valorX = memoria.containsKey(x) ? memoria.get(x) : Integer.parseInt(x);
		        int valorY = memoria.containsKey(y) ? memoria.get(y) : Integer.parseInt(y);

		        valorInt = valorX + valorY;
		    }

		    memoria.put(var, valorInt);
		}

		String ultimaVar = instrucoes.get(instrucoes.size() - 1).get(0);
		System.out.println(memoria.get(ultimaVar));
		
		teclado.close();
	}

}
