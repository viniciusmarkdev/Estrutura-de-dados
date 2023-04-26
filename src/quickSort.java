


public class quickSort {

	
	// O QuickSort usa o m�todo dividir para conquistar
	
	
	//O caso base para ordenar um array � 
	//quando temos um array com um elemento ou nenhum elemento
	
	
	//No quickSort temos que escolher um piv�
	
	//E encontrar os elemento menores que esse piv�
	
	//Depois que encontrar o numero menores que o piv�
	//eu deixo todos os numeros a esquerda
	
	 //Encontro outro piv� e fa�o o mesmo processo 
	
	//Depois utilizamos novamente o quickSort para ordenar 
	//os valores do subarray
	
	
	//O Algoritmo quicksort possu� complexidade de temp O(n log n)
	//Para o caso m�dio
	
	//Para o pior caso ele possui tempo de execu��o 0(N^2)
	
	
	//O algoritmo Mergesort tamb�m possu� complexidade de tempo O(n log n)
	
	
	
	/*
	 * Embora tenha a mesma quantidade de tempo, a constante do quicksort
	 * � menor que a constante  do mergesort , tornando o algoritmo
	 * quicksort mais r�pido.
	 * 
	 * Por�m algoritmo merge sort sempre tem a complexidade 
	 * de O(n log n)
	 * 
	 * A constante � o tempo necess�rio para fazer as compara��es
	 * e trocas  em um algoritmo.
	 * 
	 *  assim que se calcula a forma em que o tempo constante 
	 *  atua sobre o algoritmo , onde C � a constante . C*N
	 * 
	 */
	
	public static void main(String[] args) {
		
	int [] vetor = {5 ,2 , 6, 6,8 ,10,9 , 1};
		
	
		
        System.out.println("Desordenado	");
		for(int i = 0 ; i<vetor.length;i++) {
			
			System.out.println(vetor[i]+"");
		}
		
		
		quicksort(vetor , 0 , vetor.length-1);
		
		System.out.println("Vetor ordenado");
		
        for(int i = 0 ; i<vetor.length;i++) {
			
			System.out.println(vetor[i]+"");
		}
		
		
	}
		
		static void quicksort(int vetor [] , int inicio , int fim) {
			
			if(inicio<fim) {
				
				int p = particao(vetor , inicio , fim);
				quicksort(vetor,inicio , p);
				quicksort(vetor, p+1 , fim);
				
			}
		}
			
			
		static int particao(int [] vetor, int inicio , int  fim) {
			
			int meio = (inicio+fim)/2;
			
			int pivo = vetor[meio];
			
			int i= inicio-1;
			
			int j = fim+1;
			
			while(true) {
				
				do {
					
					i++;
					
				}while(vetor[i]<pivo);
				
				do {
					
					j--;
				}while(vetor[j]>pivo);
				

				
				if(i>=j) {
					
						return j;
				}
				
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				
			}
		}
		
		
		
		
	
	
	
	
	

}


