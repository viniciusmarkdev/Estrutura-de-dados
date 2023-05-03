import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	
	public static void main(String[] args) {
		
		//List do tipo Object
	    //Aceita qualquer tipo
		//Não é tipe safety
		//Tenho que saber qual é o tipo de dado se caso queira pegar um dado da lista
		//Se o tipo de dado não for exetamento o que queremos ocorre um erro
		//Então sempre temos que fazer o casting de Objetic para o tipo que queremos 
		//ou saber qual tipo que foi instanceado cada elemento
		List lista = new ArrayList();
		
		lista.add("Kakashi");
		lista.add(1);
		
		for(Object o :lista) {
			
			
							
				System.out.println(o);
				
			
			
		}
		
		
		//Para resolver isso definimos em tempo de compilação o tipo de lista que queremos
		//com <>
		
  		//Type erasure é um processo que ocorre no compilador Java em tempo de compilação para garantir a 
		//compatibilidade com versões anteriores 
	    //e reduzir a complexidade de implementação de tipos genéricos
		
		//Quando o código é e compilado  o tipo de uma classe ou atributo genérico 
		//é apagado
		
		//O compilador trata o tipo genérico como um tipo não genérico
		
		//Ou seja , em tempo de execução esse tipo não existe
		
		//Isso serve para manter a compatibilidade com versões do java que não possue suporte 
		//há  generics
		
		//Mas há uma desvantagem , pois o compilador vai apagar o tipo generico
	
		//Se quesermos adicionar um valor na lista por meio de um método
		
		//que receba outro tipo o correrá uma ClassCastException
		
		
		//No exemplo abaixo isso ocorre pois estamos usando uma lista do tipo Object
		//Que irá aceitar objetos do tipo consumidor , porém no for estamos usando
		//Como  parãmetro valores do tipo String.
		
		//Ou seja , todos os métodos que utilizarão a lista  deverão ser do
		//mesmo tipo que a lista para não houver erros.
		
		
		
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
