
public class fatorialRecursive {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(fact(5));
	}
	

	
	
	public static int fact(int n) {
		
		
		/*
		 * Caso base � quando a fun��o
		 * n�o chama a si mesmo e quando
		 * acaba a recurs�o.
		 * 
		 * �  tamb�m o m�nimo problema na qual podemos
		 * resolver 
		 * 
		 * 
		 */
		if(n==0) {
			
			return 1;
			
		}else {
			
			return n*fact(n-1);
			
		}
	
	
	}
	
}
	
	
	


