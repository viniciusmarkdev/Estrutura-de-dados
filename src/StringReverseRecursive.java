
public class StringReverseRecursive {
	
	
	public static void main(String[] args) {
		
	}

	
	public static String reverse(String a) {
		
		

		//Qual é Menor valor que podemos retorna que resolva o problema da recursão
	
	    //Qual é Caso base ?
	
	    //Quando iremos para as chamadas recursivas?
		
		//O caso base é uma String vazia
		
		  if(a.equals("")) {
			  
			  return "";
		  }
		  else {
			  
			   //Depois de fazer essas pergunta para definir o caso base
				
			    //Temos que definir nosso algoritmo de recursão
			
			    //Para isso , perguntamos qual é a menor quantidade 
			   // de trabalho com a qual posso contribuir para chegar ao caso base
			  
			  return reverse(a.substring(1))+a.charAt(0);
			  
			// O   reverse(a.substring(1)) diminui nossa entrada e o a.charAt(0)
		   // Contribui para chegarmos ao caso base até pegar o ultimo caracte.
			  
		  }
		
	}
	
	  
	
	 
	
	
	   
	

}
