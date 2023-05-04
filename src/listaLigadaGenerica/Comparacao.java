package listaLigadaGenerica;

import java.util.ArrayList;

public class Comparacao {
	
	public static void main(String[] args) {
		
		

		
		
		
		//A mem�ria do computador  funciona como gavetas, naqual pode-se  guardar 
		//um valor  e cada gaveta tem um endere�o
		
		
		
		//H� duas estruturas Basicas para armazenar valores  Array e Lista
		
		//Array -> Todas elementos est�o armazenados contiguamente(um ao lado do outro) na mem�ria.
		// N�o tem como adicionar um elemento  no array se ele estiver todo preenchido ou o lugar que voc� quer
		//Adicionar estiver preenchido tamb�m
		
		
		//� como em uma sala de cinema .Se eu estive com 5 amigos senta em uma fileira e chegasse mais 1 , ter�amos
        //que achar uma fileira com 6 lugares livre e mover todos para l�.Se chegar mais um amigo , esse processo 
		//ter� que ser feito novamento.
		
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		
		
		//Lista Ligaga ou Lista encadeada
		
		//A lista encadeada resolve o problema de adi��o(inser��o) de elementos
		
		
		//para inserir um lemento no meio da lista basta mudar o ponteiro do alemento anterior para o que queremos inserir
		
		//A lista encadeada � melhor para inser��es do que o array
		 
		//Para inserir um elemento no meio de um array temos que mover todos os elementos anteriores para baixo
		
		
		//A lista encadeada tamb�m � melhor para deletar elementos �  basta tamb�m mudar o ponteiro do elemento anterior
		
		// O tempo de execu��o para elimina��o  de um  elemento da lista � de O(1) � o do array � O(N)
		
		//O tempo de execu��o para inser��o de um elemento da lista � de 0(1) e do arraay � de 0(N)
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
     //Esse c�digo � ineficiente , pois percorre toda a lista v�rias vezes
      
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
       
      //O vetor � melhor para fazer a leitura dos elementos, pois ele busca o leemnto diretamente onde ele est�
       
       //Complexidade de tempo para ler valores
       
       //Array : O(1) execu��o constante
       
       //Lista : O(n) execu��o linear
       
      //A lista � ineficiente , pois para lermos os segundo elemento , primeiro temos que ler o primeiro 
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
