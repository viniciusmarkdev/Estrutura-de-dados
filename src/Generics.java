import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	
	public static void main(String[] args) {
		
		//List do tipo Object
	    //Aceita qualquer tipo
		//N�o � tipe safety
		//Tenho que saber qual � o tipo de dado se caso queira pegar um dado da lista
		//Se o tipo de dado n�o for exetamento o que queremos ocorre um erro
		//Ent�o sempre temos que fazer o casting de Objetic para o tipo que queremos 
		//ou saber qual tipo que foi instanceado cada elemento
		List lista = new ArrayList();
		
		lista.add("Kakashi");
		lista.add(1);
		
		for(Object o :lista) {
			
			
							
				System.out.println(o);
				
			
			
		}
		
		
		//Para resolver isso definimos em tempo de compila��o o tipo de lista que queremos
		//com <>
		
  		//Type erasure � um processo que ocorre no compilador Java em tempo de compila��o para garantir a 
		//compatibilidade com vers�es anteriores 
	    //e reduzir a complexidade de implementa��o de tipos gen�ricos
		
		//Quando o c�digo � e compilado  o tipo de uma classe ou atributo gen�rico 
		//� apagado
		
		//O compilador trata o tipo gen�rico como um tipo n�o gen�rico
		
		//Ou seja , em tempo de execu��o esse tipo n�o existe
		
		//Isso serve para manter a compatibilidade com vers�es do java que n�o possue suporte 
		//h�  generics
		
		//Mas h� uma desvantagem , pois o compilador vai apagar o tipo generico
	
		//Se quesermos adicionar um valor na lista por meio de um m�todo
		
		//que receba outro tipo o correr� uma ClassCastException
		
		
		//No exemplo abaixo isso ocorre pois estamos usando uma lista do tipo Object
		//Que ir� aceitar objetos do tipo consumidor , por�m no for estamos usando
		//Como  par�metro valores do tipo String.
		
		//Ou seja , todos os m�todos que utilizar�o a lista  dever�o ser do
		//mesmo tipo que a lista para n�o houver erros.
		
		
		
        List <String> list = new ArrayList<String>();
		
		list.add("Kakashi");
	
		
		for(String c :list) {
			
			System.out.println(c);
		}
		
		/*
		 * 	add(list , New Consumidor("Naruto"));
		
		
        for(String c :list) {
			
			System.out.println(c);
		}
		
	    
	}	
	
	private static void add(List lista, Consumidor consumidor ) {
		
		lista.add(consumidor);
	}
		 * 
		 * 
		 * 
		 */
		
		
		
	    
	}	
	
	
	

}
