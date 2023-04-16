
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int [] vetor = new int[100];
		
			for(int i=0 ; i<vetor.length ; i++) {
				
				vetor[i]=(int)( Math.random()*vetor.length);
				System.out.println(vetor[i]);
			}
			
			long inicio = System.currentTimeMillis();
		    long fim;
			
			//BUBBLE SORT - Os número maiores sobe (bolhas maiores) e o número menores 
			//Descem(Bolhas menores);
			
			for(int i=0 ;i<vetor.length ; i++) {
				
				for(int j=i+1 ; j<vetor.length ; j++) {
					
					int aux ;
					if(vetor[i]>vetor[j]) {
						
						aux = vetor[j];
						
						vetor[j] = vetor[i];
						
						vetor[i] = aux;	
						
						
					}
					
				}
				
			}
			
			fim = System.currentTimeMillis();
			
			System.out.println("Tempo: "+(fim-inicio));
			
			System.out.println("Vetor ordenado");
			System.out.println();
			
			for(int i=0 ; i<vetor.length ; i++) {
				
				System.out.println(vetor[i]);
			}
	}

}
