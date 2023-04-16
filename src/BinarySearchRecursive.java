
public class BinarySearchRecursive {

	
	public static void main(String[] args) {
		
		
		int [] vet = {1,2,4,7};
		
		
		System.out.println(Pesquisa(vet,0,vet.length-1,8));
		
	}
	
	//BinarySearch � um algoritmo  que usa a divis�o � conquista
	
	//O que � divis�o e conquista? 
	
	//A Divis�o e Conquista � baseada nesses passos
	
	//1 Divida o problema em v�rios subproblemas menores Normalmente, 
	//os subproblemas s�o semelhantes ao original.
	
	//2 Conquiste os subproblemas resolvendo-os recursivamente Caso base: 
	//resolva problemas pequenos o suficiente pela for�a bruta.
	
	
	//3 Combine as solu��es para obter uma solu��o para os subproblemas e, 
	//finalmente, uma solu��o para o problema original
	
	//4 Os algoritmos de divis�o e conquista s�o normalmente recursivos
	
	
	
	
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
