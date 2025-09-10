package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class pokerDoRei {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int zeros = 0, posicao;
		
		while(zeros != 3) {
			ArrayList<Integer> mao = new ArrayList<>();
			for(int i = 0; i < 3; i++) {
				mao.add(teclado.nextInt());
			}
			zeros = Collections.frequency(mao, 0);
			if(zeros == 3) {
				break;
			}
			mao.sort(null);
			posicao = Collections.frequency(mao, mao.get(0));
			if(posicao == 3 && mao.get(0) == 13) {
				System.out.println("*");
			}
			else if(mao.get(0) != mao.get(1) && mao.get(1) != mao.get(2) && mao.get(0) != mao.get(2)) {
				System.out.println("1 1 2");
			}
			else if(posicao == 3) {
				System.out.println((mao.get(0) + 1) + " " + (mao.get(0) + 1) + " " + (mao.get(0) + 1));
			}
			else if(posicao == 2 && mao.get(2) == 13) {
				System.out.println(1 + " " + (mao.get(1) + 1) + " " + (mao.get(1) + 1));
			}
			else if(posicao == 2 && mao.get(2) != 13) {
				System.out.println(mao.get(0) + " " + mao.get(0) + " " + (mao.get(2) + 1));
			}
			else if(posicao == 1 && mao.get(0) == 12 && mao.get(1) == 13) {
				System.out.println("1 1 1");
			}
			else if(posicao == 1 && mao.get(0) < 12 && mao.get(1) == 13) {
				System.out.println((mao.get(0) + 1) + " " + mao.get(1) + " " + mao.get(1));
			}
			else if(posicao == 1 && mao.get(1) != 13 && mao.get(1) - mao.get(0) == 1) {
				System.out.println(mao.get(1) + " " + mao.get(1) + " " + (mao.get(1) + 1));
			}
			else if(posicao == 1 && mao.get(1) != 13 && mao.get(1) - mao.get(0) > 1) {
				System.out.println((mao.get(0) + 1) + " " + mao.get(1) + " " + mao.get(1));
			}
			
		}
		
		teclado.close();
	}

}
