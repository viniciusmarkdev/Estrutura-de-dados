package listaLigadaGenerica;

public class iteratorListaLigada<T> {
	
	
	private Node<T> elemento;
	
	
	
	public iteratorListaLigada(Node<T> atual) {
		
		this.elemento = atual;
	}

	public boolean temProximo() {
		
		if(elemento.getPr�ximo()==null) {
			
			
			return false;
			
		}else {
			
			return true;
			
		}
		
	
	}
	
	
	public  Node<T> getProximo(){
		
		elemento = elemento.getPr�ximo();
		return  elemento;
		
	}

}
