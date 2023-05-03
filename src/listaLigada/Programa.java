package listaLigada;

public class Programa {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		
		System.out.println("Tamanho : " +lista.getTamanho());
		
		
		
		
		System.out.println("Primeiro :  " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo   :  " +lista.getUltimo().getValor());
		
         for(int i=0 ; i<lista.getTamanho();i++) {
			
			System.out.println(lista.get(i).getValor());
		}
         
         System.out.println("Mostrar lista : "+lista);
		
	
		
		
        lista.remover("DF");
          
        System.out.println("Removeu estado DF");
        lista.adicionar("SP");
		System.out.println("Adicionou estado SP");
		
		lista.remover("AC");
		lista.remover("BA");
		lista.remover("CE");
		lista.remover("SP");
	
	
		 System.out.println("Mostrar lista : "+lista);
		 
		System.out.println("Tamanho : " + lista.getTamanho());
		
		for(int i=0 ; i<lista.getTamanho();i++) {
			
			System.out.println(lista.get(i).getValor());
		}
	
		
		
		
	
		
		
	}

}
