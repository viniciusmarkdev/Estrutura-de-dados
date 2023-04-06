import java.util.Scanner;

public class BinarySearch {
	
	
	//A complexidade de tempo � de 0(log2  n)
	
	//Ou seja para cada etapa para se buscar o n�mero voc� eliminada pela metade a outras op��es 
	// de compara��o  , at� que reste uma �nica op��o.
	
	
	//A pesquisa precisa de log2 n etapas para retornar o resultado
	
	
	//para cada entrada eu tenho log2 n etapas para retornar o resultado
	
	
	
	
	//A pesquisa bin�ria funciona somente se o array estiver ordenado
	
	
	
	public static void main(String[] args) {
		
		int [] vetor = new int[10];
		
		for(int i=0;i<vetor.length ; i++) {
			
			vetor[i]=i*2;
			
			System.out.println(vetor[i]);
			
			
		}
		
		System.out.println("Qual n�mero voc� busca?");
		Scanner leitor = new Scanner(System.in);
		int buscado = leitor.nextInt();
		
		int contador = 0;
		
		
		boolean achou = false;
		
		int inicio=0; 
		int fim=vetor.length-1;
		int meio;
		
		while(inicio <=fim) {
			
			meio = (int)((inicio+fim)/2);
			contador++; //Quantos testes a busca fez
		
			if(vetor[meio]==buscado) {
				
				achou = true;
				
				break;
				
			}else if(vetor[meio]<buscado) {
				
				inicio = meio+1;
				
			}else { //maior
				
				fim = meio-1;
			}
			
		}
		System.out.println("Quantidade de testes : "+contador);
		
		if(achou==	true) {
			
			System.out.println("Achou");
			
		}else {
			
			System.out.println("N�o achou");
		}
		
	}
 
}
