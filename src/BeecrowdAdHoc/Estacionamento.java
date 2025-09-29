package BeecrowdAdHoc;

import java.util.*;


public class Estacionamento {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNextInt()) {
            int tamanho = teclado.nextInt();
            int eventos = teclado.nextInt();
            teclado.nextLine();
            int espaco = tamanho;
            int faturamento = 0;
            List<String[]> carros = new ArrayList<>();

            for (int i = 0; i < eventos; i++) {
                String linha = teclado.nextLine();
                String[] evento = linha.split(" ");
                carros.add(evento);

                if (evento[0].equals("C") && Integer.parseInt(evento[2]) <= espaco) {
                    espaco -= Integer.parseInt(evento[2]);
                    faturamento += 10;
                } else if (evento[0].equals("S")) {
                    String placaSaida = evento[1];
                    for (int j = 0; j < carros.size(); j++) {
                        String[] c = carros.get(j);
                        if (c[0].equals("C") && c[1].equals(placaSaida)) {
                            espaco += Integer.parseInt(c[2]);
                            carros.remove(j);
                            break;
                        }
                    }
                }
            }

            System.out.println(faturamento);
        }

        teclado.close();
	}

}
