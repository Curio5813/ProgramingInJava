package BeecrowdAdHoc;

import java.util.*;

public class roboColecionador {

    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);

        while (true) {
            int n = teclado.nextInt();
            int m = teclado.nextInt();
            int s = teclado.nextInt();
            if (n == 0 && m == 0 && s == 0) break;

            teclado.nextLine();
            ArrayList<String> arena = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String linha = teclado.nextLine();
                arena.add(linha);
            }

            String instrucoes = teclado.nextLine().trim();
            int copas = 0;

            for (int i = 0; i < instrucoes.length(); i++) {
                char comando = instrucoes.charAt(i);
                boolean moveu = false;

                for (int j = 0; j < arena.size(); j++) {
                    String linha = arena.get(j);

                    for (int k = 0; k < linha.length(); k++) {
                        char atual = linha.charAt(k);

                        if (atual == 'N' && comando == 'D') {
                            arena.set(j, linha.substring(0, k) + 'L' + linha.substring(k + 1));
                            moveu = true; break;
                        } else if (atual == 'N' && comando == 'E') {
                            arena.set(j, linha.substring(0, k) + 'O' + linha.substring(k + 1));
                            moveu = true; break;
                        } else if (atual == 'N' && comando == 'F' && j > 0) {
                            if (arena.get(j - 1).charAt(k) != '#') {
                                arena.set(j, linha.substring(0, k) + '.' + linha.substring(k + 1));
                                j--;
                                linha = arena.get(j);
                                if (linha.charAt(k) == '*') copas++;
                                arena.set(j, linha.substring(0, k) + 'N' + linha.substring(k + 1));
                            }
                            moveu = true; break;
                        }
                        else if (atual == 'S' && comando == 'D') {
                            arena.set(j, linha.substring(0, k) + 'O' + linha.substring(k + 1));
                            moveu = true; break;
                        } else if (atual == 'S' && comando == 'E') {
                            arena.set(j, linha.substring(0, k) + 'L' + linha.substring(k + 1));
                            moveu = true; break;
                        } else if (atual == 'S' && comando == 'F' && j < arena.size() - 1) {
                            if (arena.get(j + 1).charAt(k) != '#') {
                                arena.set(j, linha.substring(0, k) + '.' + linha.substring(k + 1));
                                j++;
                                linha = arena.get(j);
                                if (linha.charAt(k) == '*') copas++;
                                arena.set(j, linha.substring(0, k) + 'S' + linha.substring(k + 1));
                            }
                            moveu = true; break;
                        }

                        else if (atual == 'L' && comando == 'D') {
                            arena.set(j, linha.substring(0, k) + 'S' + linha.substring(k + 1));
                            moveu = true; break;
                        } else if (atual == 'L' && comando == 'E') {
                            arena.set(j, linha.substring(0, k) + 'N' + linha.substring(k + 1));
                            moveu = true; break;
                        } else if (atual == 'L' && comando == 'F' && k < m - 1) {
                            if (linha.charAt(k + 1) != '#') {
                                arena.set(j, linha.substring(0, k) + '.' + linha.substring(k + 1));
                                k++;
                                linha = arena.get(j);
                                if (linha.charAt(k) == '*') copas++;
                                arena.set(j, linha.substring(0, k) + 'L' + linha.substring(k + 1));
                            }
                            moveu = true; break;
                        }
                        else if (atual == 'O' && comando == 'D') {
                            arena.set(j, linha.substring(0, k) + 'N' + linha.substring(k + 1));
                            moveu = true; break;
                        } else if (atual == 'O' && comando == 'E') {
                            arena.set(j, linha.substring(0, k) + 'S' + linha.substring(k + 1));
                            moveu = true; break;
                        } else if (atual == 'O' && comando == 'F' && k > 0) {
                            if (linha.charAt(k - 1) != '#') {
                                arena.set(j, linha.substring(0, k) + '.' + linha.substring(k + 1));
                                k--;
                                linha = arena.get(j);
                                if (linha.charAt(k) == '*') copas++;
                                arena.set(j, linha.substring(0, k) + 'O' + linha.substring(k + 1));
                            }
                            moveu = true; break;
                        }
                    }

                    if (moveu) break;
                }
            }

            System.out.println(copas);
        }

        teclado.close();
    }
}
