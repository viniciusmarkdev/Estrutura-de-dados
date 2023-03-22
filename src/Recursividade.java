
public class Recursividade {

	
	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		
		for(int i=0;i<vetor.length;i++) {
			vetor[i]=(int)(Math.random()*vetor.length);
		}
		
		System.out.println("Vetor");
		for(int i=0;i<vetor.length;i++) {
			
		  System.out.println(vetor[i]);
			
		}
		
		
		System.out.println(somar(0,vetor,0));
		
	}
	
	private static int somar(int posi��o , int[]vetor,int soma) {
		if(posi��o<vetor.length) {
			soma=soma+vetor[posi��o];
			return somar(posi��o+1,vetor,soma);
		}else {
			return soma;
		}
	
	}
}
