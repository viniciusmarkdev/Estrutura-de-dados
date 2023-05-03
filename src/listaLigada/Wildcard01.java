package listaLigada;


//WildCard

abstract class Animal{
	
	public abstract void consulta();
	
	
}


class Cachorro extends Animal{
	
	@Override
	public void consulta() {
		
		System.out.println("Consultando doguinho");
	}
}



class Gato extends Animal{
	
	@Override
	public void consulta() {
		
		System.out.println("Consultando gato");
	}
}
	

public class Wildcard01 {
	
	public static void main(String[] args) {
		
		
	
		Cachorro [] cachorros = {new Cachorro(),new Cachorro()};
		Gato [] gatos = {new Gato(),new Gato()};
	
	
		
		printConsulta(cachorros);
		printConsulta(gatos);
		
		
		
		
	}
	
	private static void printConsulta(Animal [] animals) {
		
		for(Animal animal : animals) {
		
			animal.consulta();
		}
		
	
		
	
		//Erro de execuçãp , pois queremos colocar um tipo Cachorro , na posição 1 
		//de um array do tipo Gato
		animals[1] = new Cachorro();
	}

}
