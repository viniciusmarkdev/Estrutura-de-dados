
public class CallStack {
	
    static void tchau() {
    	
    	System.out.println("ok, 	tchau");
    }
	
	static void sauda2(String nome) {
		
		System.out.println("como vai"+nome+
				 "?");
	}
	
	
   
	
	static void sauda(String nome) {
		
		//3 print da própria chamada
		System.out.println("Olá"+nome+"!");
		/*
		 * 4
		 * Computador salva novamente o 
		 * nome na memória
		 * 
		 * E aloca um caixa de memória para sauda2
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
		 * quando o método
		 * sauda2 é chamado
		 * o método sauda fica parcialemente
		 * completo
		 * 
		 * quando se chama uma função
		 * a partir de outra, chamada
		 * de função fica  pausada em um
		 * estado parcialmente completo.
		 * 
		 * Todos os valores das 
		 * varíaveis para aquela função sauda
		 * ainda estão armazenados na memória
		 * 
		 *  
		 */
	    sauda2(nome);
		
		/*
		 * 5 retorna a chamada 
		 * sauda2 que é retirada da pilha
		 * agora só temos sauda , que retorna com
		 * seus valores armazenados
		 * 
		 * */
		
		//6 Continuando 
		System.out.println("Preparando"
				+ "para dizer tchau");
		
		//7 O método tchau é chamado e retornado
		tchau();
		
		
	}
	
	
	public static void main(String[] args) {
		
		/*1-
		 *O computador aloca
		 *uma caixa de memória para 
		 *essa chamada sauda()
		 *
		 */
		
		 /*
	     * 2
	     *O valor nome é setado é salvo 
	     *na memória nome: maggie
	     */
		 
		//8 retornamos ao método sauda()
		//A pilha utilizada para guardar 
		//as váriaveis de cada método
		//é chamado pilha de chamada
		sauda("maggie");
	}
}
