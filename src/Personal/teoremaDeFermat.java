package Personal;


public class teoremaDeFermat {
	
	public static void main(String[] args) {
		
		long x = 18867;
		
		for(long i = 18868; i <= 50000; i++) {
			for(long j = 1; j < i; j++) {
				if(Math.pow(x, 53) + Math.pow(j, 53) - Math.pow(i, 53) == 0 && j != x){
					System.out.println(i + " " + j);
					break;
				}
			}
		}
		
	}
	
}
