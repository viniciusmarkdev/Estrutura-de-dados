package listaLigada;

import java.util.List;

import dominio.Barco;
import dominio.Carro;

//Fazer um método genérico sem fazer a classe inteira genérica

public class MetodoGenericoTest01 {
	
	public static void main(String[] args) {
		
		//sem retorno
		criarArrayComUmObjeto(new Barco("Canoa"));
		
		//Com retorno
		List<Carro> carro = retornaArrayComUmObjeto(new Carro("BMW"));
		
	

}
	
	
	//sem retorno
	private static <T> void criarArrayComUmObjeto(T t) {
		
		List<T> list = List.of(t);
		System.out.println(list);
		
	}
	
	
	//Com retorno
   private static <T> List<T> retornaArrayComUmObjeto(T t) {
		
		List<T> list = List.of(t);
		return list;
		
	}


//Não há limites
	
	/*
	 * 
	 * class DoisAtributos<T,X,I>{
	
	private T t;
	
	private X x;
	
	private I i;
	
	public DoisAtributos(T t ,X x , I i ) {
		
		
		this.x  = x;
		
		this.i = i;
		
		this.t = t;
		
		
	}
	 * 
	 * 
	 * 
	 * 
	 */

	
	
	
	
}