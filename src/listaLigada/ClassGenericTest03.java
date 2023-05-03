package listaLigada;

import java.util.ArrayList;
import java.util.List;

import Service.RentalService;
import dominio.Barco;
import dominio.Carro;

public class ClassGenericTest03 {
	
	
	public static void main(String[] args) {
		
		
	 List<Barco> barcoDisponiveis  = new ArrayList<>(List.of(
				new Barco("Lancha") , 	new Barco("Canoa")) );
		

     List<Carro> carroDisponiveis  = new ArrayList<>(List.of(
				new Carro("BMW") , 	new Carro("Mercedes")) );
	
     RentalService<Carro> rentalService = new RentalService<>(carroDisponiveis);
     
     
     
	}

}
