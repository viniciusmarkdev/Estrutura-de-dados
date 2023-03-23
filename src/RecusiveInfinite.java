
public class RecusiveInfinite {
	
	
	/*
	 * A pilha vai encher e vai gerar um
	 * estouro de memória.
	 * 
	 */
	
	/*
	 * 
	 * */
	 
	
	static void sub(int i) {
		
		System.out.println(i);
		sub(i-1);
		
	}
	
	public static void main(String[] args) {
		
		sub(5);
		
	}

}
