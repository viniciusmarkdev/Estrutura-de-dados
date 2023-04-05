public class CaseBaseAndRecursive {
	
	
	static int sub(int i) {
		
		
		System.out.println(i);
		//Caso base é quando a função
		//não chama si mesmo
		if(i<=1) {
			
		
			return i;
			
		}
		/*
		 * Caso recursivo , se 
		 * i for maior que 1.Caso recursivo
		 * é quando o método chama a si mesmo
		 * 
		 * */
		else {
			
			return sub(i-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		sub(1);
		
	}

}
