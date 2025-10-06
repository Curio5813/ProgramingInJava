package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ventiladoresEBaloes {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);

		 while (teclado.hasNextInt()) {
	            int l = teclado.nextInt();
	            int c = teclado.nextInt();
	            int p = teclado.nextInt();

	            if (l == 0 && c == 0 && p == 0) {
	                break;
	            }

	            List<List<Integer>> matrix = new ArrayList<>();
	            
	            for (int i = 0; i < l; i++) {
	                List<Integer> colunas = new ArrayList<>();
	                for (int j = 0; j < c; j++) {
	                	colunas.add(teclado.nextInt());
	                }
	                matrix.add(colunas);
	            }

	            int k = p - 1;
	            boolean passou = true;

	            for (int i = 0; i < matrix.size(); i++) {
	                List<Integer> row = matrix.get(i);
	                if (k <= 0 || k >= c - 1) {
                     System.out.println("BOOM " + (i + 1) + " " + (k + 1));
                     passou = false;
                     break;
                 }
	                if (row.get(k) != 0) {
	                    System.out.println("BOOM " + (i + 1) + " " + (k + 1));
	                    passou = false;
	                    break;
	                } else {
	                    if (row.get(0) > row.get(c - 1)) {
	                        int sumRest = row.subList(1, row.size())
	                                .stream()
	                                .mapToInt(Integer::intValue)
	                                .sum();

	                        if (sumRest > row.get(0)) {
	                            k -= sumRest - row.get(0);
	                            if (k <= 0) {
	                                System.out.println("BOOM " + (i + 1) + " " + (k + 1));
	                                passou = false;
	                                break;
	                            }
	                            if (row.get(k) != 0) {
	                                System.out.println("BOOM " + (i + 1) + " " + (k + 1));
	                                passou = false;
	                                break;
	                            }
	                        } else if (sumRest < row.get(0)) {
	                            k += row.get(0) - sumRest;
	                            if (k >= c - 1) {
	                                System.out.println("BOOM " + (i + 1) + " " + (k + 1));
	                                passou = false;
	                                break;
	                            }
	                            if (row.get(k) != 0) {
	                                System.out.println("BOOM " + (i + 1) + " " + (k + 1));
	                                passou = false;
	                                break;
	                            }
	                        } else {
	                            continue;
	                        }

	                    } else if (row.get(0) < row.get(c - 1)) {
	                        int sumRow = row.subList(0, c - 1)
	                                .stream()
	                                .mapToInt(Integer::intValue)
	                                .sum();

	                        if (sumRow > row.get(c - 1)) {
	                            k += sumRow - row.get(c - 1);
	                            if (k >= c - 1) {
	                                System.out.println("BOOM " + (i + 1) + " " + (k + 1));
	                                passou = false;
	                                break;
	                            }
	                            if (row.get(k) != 0) {
	                                System.out.println("BOOM " + (i + 1) + " " + (k + 1));
	                                passou = false;
	                                break;
	                            }
	                        } else if (sumRow < row.get(c - 1)) {
	                            k -= row.get(c - 1) - sumRow;
	                            if (k <= 0) {
	                                System.out.println("BOOM " + (i + 1) + " " + (k + 1));
	                                passou = false;
	                                break;
	                            }
	                            if (row.get(k) != 0) {
	                                System.out.println("BOOM " + (i + 1) + " " + (k + 1));
	                                passou = false;
	                                break;
	                            }
	                        } else {
	                            continue;
	                        }

	                    } else if (row.get(0) == row.get(c - 1)) {
	                        continue;
	                    }
	                }
	            }
	            if (passou) {
	                if (k + 1 == 3) {
	                    System.out.println("OUT 4"); // Errado no URI do beecrowd
	                } else {
	                    System.out.println("OUT " + (k + 1));
	                }
	            }
	        }
		
		teclado.close();
	}

}
