import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SelectionSort {
	
	
	//Esse Algoritmo tem tempo de execução O(N^2)
	
	
	
	public static void main(String[] args) {
		
		int [] vetor = {3,4,2,1};
		
		
		ordenacaoPorSelecao(vetor);
		
		for(int i=0; i <vetor.length;i++) {
			
			System.out.println(vetor[i]);
		}
	
	}
	
	
	
	public static void ordenacaoPorSelecao(int [] arr) {
		
		
		int menorIndice , aux;
		
		
		for(int i=0 ; i<arr.length ; i++) {
			
			menorIndice = i;
			
             for(int j=1+i; j<arr.length ; j++) {
			
			
			
				
				if(arr[j]<arr[menorIndice]) {
					
					menorIndice = j;
					
					
					
				
				
			}
			
		}
             
         
         aux = arr[menorIndice];
         
         arr[menorIndice] = arr[i];
         
         arr[i] = aux;
         
         
       
             
       
			
		
             
				
			}
		
		
		  
		
		
		
		
	}
	

}
