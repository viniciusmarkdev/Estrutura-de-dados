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



	
	//Erro de compilação
	//Uma vez que o código é compilado não se sabe o tipo de List que se 
	//está usando(No java a compilação é feita e tempo real)
	//Por causa do Type erasure
	
	//Não há mais o tipo Cachorro
	
	/**
	 *
	 *Erro de compilaçãp
	 *printConsulta(cachorros);
	 */
	
	
	//Podemos arrumar esse erro extendendo tipo da lista somente  para a classe Animal
	//Assim garantiremos que o tipo que receberemos no método será do tipo Animal
	//Antes disso o compilador não sabia sobre qual era o tipo por qual do Type erasure
   	printConsulta(cachorros);
   	
   
   	printConsultaAnimal(animals);
	printConsultaAnimal(obj);
	
	
		

			
		
	}
	
	//Type erasure 
	
	//Quando utilizamos código parametrizados temos que passar
	//exatamento  o tipo que colocamos
	//No momento que compilamos , já devemos passar ou adicionar o tipo 
	//Após isso esse tipo será esquecido pelo compilador(Ne casso o tipo Animal);
	
	//Wild card ? extends 
	
     //	List<? extends Animal> animals quando eu utilizo o ? extends eu não posso
   	//mais adicionar nenhum elemneto na lista , pois
	//O Compilador não sabe qual é o tipo em tempo de compilação
	
	
	private static void printConsulta(List<? extends Animal> animals) {
		
	
		
		for(Animal animal : animals) {
		
			animal.consulta();
		}
		
	

	
	}
	
	   // Usando o ? super  o parâmetro pode suportar todos as superclasse
	   // de Animal , como a classe  Object 
	   // Se usarmos ? super cachorros só poderemos usar a Lista com o tipo Animal , Cachorro
	   // e Object que são superclasses de Cachorro
	
       //quando tento recuperar um elemento usando <? super> não há uma segurança de tipo ,
	   //pois podemos passar tanto um elemento cachorro ou umelemento animal
	
	  //Assim , nossa opção é usar o Object e o instanceOf para validar o tipo
	
	  //Diferente do <? extends podemos adicionar elemento para lista>
	
	// temos a garantia de que sempre a lista será do tipo Cachorro , Animal ou Object
     
	private static void printConsultaAnimal(List<? super Animal > animals) {
		
		   animals.add(new Cachorro());
	
    	   
    	   for(Object o : animals) {
    		   
    		   if(o instanceof Cachorro) {
    			   
    			   
    		   }
    	   }
    	   
    	   
		
		
	}

}
