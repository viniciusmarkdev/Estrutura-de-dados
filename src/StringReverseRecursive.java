
public class StringReverseRecursive {
	
	
	public static void main(String[] args) {
		
	}

	
	public static String reverse(String a) {
		
		

		//Qual � Menor valor que podemos retorna que resolva o problema da recurs�o
	
	    //Qual � Caso base ?
	
	    //Quando iremos para as chamadas recursivas?
		
		//O caso base � uma String vazia
		
		  if(a.equals("")) {
			  
			  return "";
		  }
		  else {
			  
			   //Depois de fazer essas pergunta para definir o caso base
				
			    //Temos que definir nosso algoritmo de recurs�o
			
			    //Para isso , perguntamos qual � a menor quantidade 
			   // de trabalho com a qual posso contribuir para chegar ao caso base
			  
			  return reverse(a.substring(1))+a.charAt(0);
			  
			// O   reverse(a.substring(1)) diminui nossa entrada e o a.charAt(0)
		   // Contribui para chegarmos ao caso base at� pegar o ultimo caracte.
			  
		  }
		
	}
	
	  
	
	 
	
	
	   
	

}
