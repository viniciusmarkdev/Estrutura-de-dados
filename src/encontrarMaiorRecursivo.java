
public class encontrarMaiorRecursivo {
	
	public static void main(String[] args) {
		
		
		int [] vet = {1,27,9,23,99};
		
	     System.out.println(maior(vet,0,vet.length-1 , 0));

		
		
		
	}
	
	
	public static int maior(int vet[] , int inicio , int fim , int maior ) {
		
		
	
		if(inicio<=fim) {
			
			
			//Menor unidade de trabalho que preciso fazer
			//para chegar mais proximo ao caso base ou ao
			//resultado
			
	        maior = vet[inicio];
			
			return maior(vet ,inicio+1 , fim , maior);
			
			
		}
		
	     //Caso base
		
		//Menor unidade de entrada 
		
		//Caso em que a recursão irá parar
		else{
			
			
			return maior;
		}
		
		
		
		
			
		
			
			
			
			
		
		
	
		
	}

}
