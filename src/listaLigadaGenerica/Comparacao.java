package listaLigadaGenerica;

import java.util.ArrayList;

public class Comparacao {
	
	public static void main(String[] args) {
		
		

		
		
		
		//A memória do computador  funciona como gavetas, naqual pode-se  guardar 
		//um valor  e cada gaveta tem um endereço
		
		
		
		//Há duas estruturas Basicas para armazenar valores  Array e Lista
		
		//Array -> Todas elementos estão armazenados contiguamente(um ao lado do outro) na memória.
		// Não tem como adicionar um elemento  no array se ele estiver todo preenchido ou o lugar que você quer
		//Adicionar estiver preenchido também
		
		
		//É como em uma sala de cinema .Se eu estive com 5 amigos senta em uma fileira e chegasse mais 1 , teríamos
        //que achar uma fileira com 6 lugares livre e mover todos para lá.Se chegar mais um amigo , esse processo 
		//terá que ser feito novamento.
		
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		
		
		//Lista Ligaga ou Lista encadeada
		
		//A lista encadeada resolve o problema de adição(inserção) de elementos
		
		
		//para inserir um lemento no meio da lista basta mudar o ponteiro do alemento anterior para o que queremos inserir
		
		//A lista encadeada é melhor para inserções do que o array
		 
		//Para inserir um elemento no meio de um array temos que mover todos os elementos anteriores para baixo
		
		
		//A lista encadeada também é melhor para deletar elementos é  basta também mudar o ponteiro do elemento anterior
		
		// O tempo de execução para eliminação  de um  elemento da lista é de O(1) é o do array é O(N)
		
		//O tempo de execução para inserção de um elemento da lista é de 0(1) e do arraay é de 0(N)
		listaLigadaGenerica<Integer> lista = new 	listaLigadaGenerica <Integer>();
		
		//Adicionar um valor
		
		int limite=1000000;

		long tempoInicial = System.currentTimeMillis();
		long tempoFinal;
		
		for(int i=0 ; i<limite ; i++) {
			
			vetor.add(i);
		}
		
		tempoFinal=  System.currentTimeMillis();
		System.out.println("Adicionou "+limite+" Elementos no vetor");
		System.out.println(tempoFinal-tempoInicial);
		
		
	
		
	     tempoInicial = System.currentTimeMillis();
		
		
		for(int i=0 ; i<limite ; i++) {
			
			lista.adicionar(i);
		}
		
		tempoFinal=  System.currentTimeMillis();
		System.out.println("Adicionou "+limite+" Elementos na Lista Ligada");
		System.out.println(tempoFinal-tempoInicial);
		
		//ler valores 
	    tempoInicial = System.currentTimeMillis();
       for(int i=0 ; i<vetor.size() ; i++) {
			
    	       vetor.get(i);
                 
		}
       tempoFinal=  System.currentTimeMillis();
       System.out.println("\n\nTempo de leitura dos elementos do vetor ");
       System.out.println(tempoFinal-tempoInicial);
       
       
     //ler valores 
     //Esse código é ineficiente , pois percorre toda a lista várias vezes
      
       /**
        * 
        *   tempoInicial = System.currentTimeMillis();
   
	  for(int i=0 ; i<lista.getTamanho() ; i++) {
	         
    	  
    	  lista.get(i);
                
		}
      tempoFinal=  System.currentTimeMillis();
      System.out.println("\n\nTempo de leitura dos elementos da Lista ");
      System.out.println(tempoFinal-tempoInicial);
        * 
        * 
        */
       
	
      
      //Usando iterator
       
      //O vetor é melhor para fazer a leitura dos elementos, pois ele busca o leemnto diretamente onde ele está
       
       //Complexidade de tempo para ler valores
       
       //Array : O(1) execução constante
       
       //Lista : O(n) execução linear
       
      //A lista é ineficiente , pois para lermos os segundo elemento , primeiro temos que ler o primeiro 
      //para ler o terceiro temos que ler o segunda e assim por diante.
      tempoInicial = System.currentTimeMillis();
      
      iteratorListaLigada<Integer> iterator = lista.getIterator();
      
      while(iterator.temProximo()) {
    	  
    	  iterator.getProximo();
    	  
    	  
      }
      
	
      tempoFinal=  System.currentTimeMillis();
      System.out.println("\n\nTempo de leitura dos elementos da Lista com iterator ");
      System.out.println(tempoFinal-tempoInicial);
      
	
		
		
		

	}
}
