import java.util.Scanner;

public class PesquisaSimples {
	
	
	public static void main(String[] args) {
		
		
         int [] vetor = new int[100];
		
		for(int i=0;i<vetor.length ; i++) {
			
			vetor[i]=i*2;
			
			System.out.println(vetor[i]);
			
			
		}
		
		
		System.out.println("Digite um número que você que encontrar: ");
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		
		int contador = 0;
		int contadorDif = 0;
		for(int i=0 ; i<vetor.length ; i++) {
			
			
			if(vetor[i]!=valor) {
				
				contadorDif++;
				
			}
			
			if(vetor[i]==valor) {
				
				contador++;
			 
			}
			
			
		}
		
		
		if(contador==1) {
			
			System.out.println("Achou");
		    
			System.out.println("Numero de tentativas para achar : "+contadorDif);
		}
		
		else {
			
			System.out.println("Não achou");
			System.out.println("Numero de tentativas para achar : "+contadorDif);
		}
		
		

	}

}
