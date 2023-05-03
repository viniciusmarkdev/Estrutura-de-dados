package listaLigada;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard02 {
	
	public static void main(String[] args) {
		
	
		
	List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
	List<Gato> gatos = List.of(new Gato() ,  new Gato());
	List<Animal> animals = new ArrayList<>();
	 
	List obj = new ArrayList();



	
	//Erro de compila��o
	//Uma vez que o c�digo � compilado n�o se sabe o tipo de List que se 
	//est� usando(No java a compila��o � feita e tempo real)
	//Por causa do Type erasure
	
	//N�o h� mais o tipo Cachorro
	
	/**
	 *
	 *Erro de compila��p
	 *printConsulta(cachorros);
	 */
	
	
	//Podemos arrumar esse erro extendendo tipo da lista somente  para a classe Animal
	//Assim garantiremos que o tipo que receberemos no m�todo ser� do tipo Animal
	//Antes disso o compilador n�o sabia sobre qual era o tipo por qual do Type erasure
   	printConsulta(cachorros);
   	
   
   	printConsultaAnimal(animals);
	printConsultaAnimal(obj);
	
	
		

			
		
	}
	
	//Type erasure 
	
	//Quando utilizamos c�digo parametrizados temos que passar
	//exatamento  o tipo que colocamos
	//No momento que compilamos , j� devemos passar ou adicionar o tipo 
	//Ap�s isso esse tipo ser� esquecido pelo compilador(Ne casso o tipo Animal);
	
	//Wild card ? extends 
	
     //	List<? extends Animal> animals quando eu utilizo o ? extends eu n�o posso
   	//mais adicionar nenhum elemneto na lista , pois
	//O Compilador n�o sabe qual � o tipo em tempo de compila��o
	
	
	private static void printConsulta(List<? extends Animal> animals) {
		
	
		
		for(Animal animal : animals) {
		
			animal.consulta();
		}
		
	

	
	}
	
	   // Usando o ? super  o par�metro pode suportar todos as superclasse
	   // de Animal , como a classe  Object 
	   // Se usarmos ? super cachorros s� poderemos usar a Lista com o tipo Animal , Cachorro
	   // e Object que s�o superclasses de Cachorro
	
       //quando tento recuperar um elemento usando <? super> n�o h� uma seguran�a de tipo ,
	   //pois podemos passar tanto um elemento cachorro ou umelemento animal
	
	  //Assim , nossa op��o � usar o Object e o instanceOf para validar o tipo
	
	  //Diferente do <? extends podemos adicionar elemento para lista>
	
	// temos a garantia de que sempre a lista ser� do tipo Cachorro , Animal ou Object
     
	private static void printConsultaAnimal(List<? super Animal > animals) {
		
		   animals.add(new Cachorro());
	
    	   
    	   for(Object o : animals) {
    		   
    		   if(o instanceof Cachorro) {
    			   
    			   
    		   }
    	   }
    	   
    	   
		
		
	}

}
