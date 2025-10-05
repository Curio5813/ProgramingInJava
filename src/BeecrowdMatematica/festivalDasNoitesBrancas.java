package BeecrowdMatematica;

import java.util.Scanner;
import java.math.BigInteger;


public class festivalDasNoitesBrancas {
	
	private static final String Interger = null;

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		while(teclado.hasNextLine()) {
			
			int t = teclado.nextInt();
			for(int i = 0; i < t; i++) {
				String binario = teclado.next();
				BigInteger ordem = new BigInteger(binario, 2);
				BigInteger a = BigInteger.ZERO;
		        BigInteger b = BigInteger.ONE;
		        BigInteger p = BigInteger.ONE;
		        for (BigInteger j = BigInteger.ZERO; j.compareTo(ordem) < 0; j = j.add(BigInteger.ONE)) {
		            a = b;
		            b = p;
		            p = a.add(b);
		        }
		        String strP = p.toString();

		        if (strP.length() == 1) {
	                System.out.println("00" + strP);
	            } else if (strP.length() == 2) {
	                System.out.println("0" + strP);
	            } else if (strP.length() == 3) {
	                System.out.println(strP);
	            } else {
	                String ultimos = strP.substring(strP.length() - 3);
	                System.out.println(ultimos);
	            }
				    
			}
			
		}
		
		teclado.close();
	}

}
