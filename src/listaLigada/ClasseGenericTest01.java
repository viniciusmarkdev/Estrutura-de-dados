package listaLigada;

import java.util.ArrayList;
import java.util.List;

import Service.CarroRentavelService;
import Service.RentalService;
import dominio.Barco;
import dominio.Carro;

public class ClasseGenericTest01 {
	
	public static void main(String[] args) {
		
		
		 List<Barco> barcoDisponiveis  = new ArrayList<>(List.of(
					new Barco("Lancha") , 	new Barco("Canoa")) );
			

	     List<Carro> carroDisponiveis  = new ArrayList<>(List.of(
					new Carro("BMW") , 	new Carro("Mercedes")) );
		
	     
	    RentalService<Carro> rentalService = new RentalService<>(carroDisponiveis);
	    
		
		Carro carro = rentalService.buscarObjetoDisponivel();
		
		System.out.println("Usando o carro por um mês...");
		
		rentalService.retornarObjetoAlugado(carro);
			
		
		System.out.println("--------------------");
		
		
	   
	    RentalService<Barco> rentalServiceBarco = new RentalService<>(barcoDisponiveis);
	    
		
	    Barco barco= rentalServiceBarco.buscarObjetoDisponivel();
		
		System.out.println("Usando um barco por um mês...");
		
		rentalServiceBarco.retornarObjetoAlugado(barco);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
