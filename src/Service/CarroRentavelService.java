package Service;

import java.util.ArrayList;
import java.util.List;

import dominio.Carro;


public class CarroRentavelService {
	
	
	private List<Carro> carroDisponiveis  = new ArrayList<>(List.of(
			new Carro("BMW") , 	new Carro("Mercedes")) );
	
	
	public Carro buscarCarroDisponivel() {
		
		System.out.println("Buscando carro disponível");
		
		Carro carro =  carroDisponiveis.remove(0);
		System.out.println("Alugando carro "+carro);
		System.out.println("Carros disponíveis para alugar");
		System.out.println(carroDisponiveis);
		return carro;
		
	}
	
	public void retornarCarroAlugado(Carro carro) {
		
		System.out.println("Devolvendo Carro " + carro);
		carroDisponiveis.add(carro);
		System.out.println(carroDisponiveis);
		
	}

}
