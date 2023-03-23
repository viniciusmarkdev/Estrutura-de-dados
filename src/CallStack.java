
public class CallStack {
	
    static void tchau() {
    	
    	System.out.println("ok, 	tchau");
    }
	
	static void sauda2(String nome) {
		
		System.out.println("como vai"+nome+
				 "?");
	}
	
	
   
	
	static void sauda(String nome) {
		
		//3 print da pr�pria chamada
		System.out.println("Ol�"+nome+"!");
		/*
		 * 4
		 * Computador salva novamente o 
		 * nome na mem�ria
		 * 
		 * E aloca um caixa de mem�ria para sauda2
		 * 
		 * que fica em cima da primeira chamada 
		 * sauda1
		 * 
		 * 
		 */
		
		/*
		 * Print como vai maggie
		 * 
		 * 
		 * */
		
		/*
		 * quando o m�todo
		 * sauda2 � chamado
		 * o m�todo sauda fica parcialemente
		 * completo
		 * 
		 * quando se chama uma fun��o
		 * a partir de outra, chamada
		 * de fun��o fica  pausada em um
		 * estado parcialmente completo.
		 * 
		 * Todos os valores das 
		 * var�aveis para aquela fun��o sauda
		 * ainda est�o armazenados na mem�ria
		 * 
		 *  
		 */
	    sauda2(nome);
		
		/*
		 * 5 retorna a chamada 
		 * sauda2 que � retirada da pilha
		 * agora s� temos sauda , que retorna com
		 * seus valores armazenados
		 * 
		 * */
		
		//6 Continuando 
		System.out.println("Preparando"
				+ "para dizer tchau");
		
		//7 O m�todo tchau � chamado e retornado
		tchau();
		
		
	}
	
	
	public static void main(String[] args) {
		
		/*1-
		 *O computador aloca
		 *uma caixa de mem�ria para 
		 *essa chamada sauda()
		 *
		 */
		
		 /*
	     * 2
	     *O valor nome � setado � salvo 
	     *na mem�ria nome: maggie
	     */
		 
		//8 retornamos ao m�todo sauda()
		//A pilha utilizada para guardar 
		//as v�riaveis de cada m�todo
		//� chamado pilha de chamada
		sauda("maggie");
	}
}
