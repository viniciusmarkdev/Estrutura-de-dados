
public class BinarySearchRecursive {

	
	public static void main(String[] args) {
		
		
		int [] vet = {1,2,4,7};
		
		
		System.out.println(Pesquisa(vet,0,vet.length-1,8));
		
	}
	
	//BinarySearch é um algoritmo  que usa a divisão é conquista
	
	//O que é divisão e conquista? 
	
	//A Divisão e Conquista é baseada nesses passos
	
	//1 Divida o problema em vários subproblemas menores Normalmente, 
	//os subproblemas são semelhantes ao original.
	
	//2 Conquiste os subproblemas resolvendo-os recursivamente Caso base: 
	//resolva problemas pequenos o suficiente pela força bruta.
	
	
	//3 Combine as soluções para obter uma solução para os subproblemas e, 
	//finalmente, uma solução para o problema original
	
	//4 Os algoritmos de divisão e conquista são normalmente recursivos
	
	
	
	
	public static int Pesquisa(int [] vetor , int inicio , int fim 
			, int valor) {
		
		
		int meio = (inicio +fim)/2;
		
		if(inicio>fim) {
			
			return -1;
		}
		
		if(valor==vetor[meio]) {
			
			
			return valor;
		}
		
		if(valor>vetor[meio]) {
			
			return Pesquisa(vetor,meio+1,fim,valor);
		}
		
        
			
	        return Pesquisa(vetor,meio-1,fim,valor);
		
     
	}
}
