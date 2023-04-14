
public class fatorialRecursive {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(fact(5));
	}
	

	
	
	public static int fact(int n) {
		
		
		/*
		 * Caso base é quando a função
		 * não chama a si mesmo e quando
		 * acaba a recursão.
		 * 
		 * É  também o mínimo problema na qual podemos
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
	
	
	


