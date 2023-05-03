package Service;

import java.util.ArrayList;
import java.util.List;

import dominio.Barco;
import dominio.Carro;


public class BarcoRentavelService {
	
	
	private List<Barco> barcoDisponiveis  = new ArrayList<>(List.of(
			new Barco("Lancha") , 	new Barco("Navio")) );
	
    public Barco buscarCarroDisponivel() {
		
		System.out.println("Buscando barco disponível");
		
		Barco barco = barcoDisponiveis.remove(0);
		System.out.println("Alugando barco "+barco);
		System.out.println("Barcos disponíveis para alugar");
		System.out.println(barcoDisponiveis);
		return barco;
		
	}
	
	public void retornarCarroAlugado(Barco barco) {
		
		System.out.println("Devolvendo Barco " + barco );
		barcoDisponiveis.add(barco);
		System.out.println(barcoDisponiveis);
		
	}
	

}
