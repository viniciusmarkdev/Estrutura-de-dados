
public class PalindromeRecursive {

	
	public static void main(String[] args) {
		
		
		
		System.out.println(isPalindrome("ana"));
		
		
	}
	
	
	public static boolean isPalindrome(String str ) {
		
		//Caso base
		
		//Caso em que a recurs�o ir� parar
		
		//Menor valor de entrada ou sa�da 
		
		if(str.length()==1 || str.length()==0) {
			
			return true;
			
		}
		else {
			
	if(str.charAt(0)==str.charAt(str.length()-1)) {
				
				
				//Qual � o menor trabalho que eu preciso fazer
				//chegar mais perto do caso base
				return isPalindrome(str.substring(1 , str.length()-1));
			
		}
		
			
		}
	
		//Caso uma compara��o n�o seja igual 
		//Retoramos falso
		return false;
	}
}
