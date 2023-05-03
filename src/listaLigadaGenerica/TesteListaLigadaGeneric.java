package listaLigadaGenerica;

public class TesteListaLigadaGeneric {

	
	
	public static void main(String[] args) {
		
		listaLigadaGenerica<Integer> lista = new listaLigadaGenerica<Integer>();
		
		lista.adicionar(1);
		lista.adicionar(2);
		lista.adicionar(3);
		lista.adicionar(4);
		
		System.out.println("Tamanho : " +lista.getTamanho());
		
		
		
		
		System.out.println("Primeiro :  " + lista.getPrimeiro().getValue());
		System.out.println("Ultimo   :  " +lista.getUltimo().getValue());
		
         for(int i=0 ; i<lista.getTamanho();i++) {
			
			System.out.println(lista.get(i).getValue());
		}
         
         System.out.println("Mostrar lista : "+lista);
		
	
		
		
        lista.remover(1);
          
        System.out.println("Removeu estado DF");
        lista.adicionar(1);
		System.out.println("Adicionou estado SP");
		
		lista.remover(2);
		lista.remover(3);
		lista.remover(4);
		lista.remover(5);
	
	
		 System.out.println("Mostrar lista : "+lista);
		 
		System.out.println("Tamanho : " + lista.getTamanho());
		
		for(int i=0 ; i<lista.getTamanho();i++) {
			
			System.out.println(lista.get(i).getValue());
		}
	
		
	}
		
		
		
	
		
		
	
		
	
}
