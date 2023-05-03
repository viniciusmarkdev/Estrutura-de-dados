package listaLigadaGenerica;

public class Node<T>{

	
	private Node<T> próximo;
	
	
	private  T value;
	
	public Node(T value) {
		
		
		this.value = value;
	}


	public Node<T> getPróximo() {
		return próximo;
	}


	public void setPróximo(Node<T> próximo) {
		this.próximo = próximo;
	}


	public T getValue() {
		return value;
	}


	public void setValue(T value) {
		this.value = value;
	}
	
	
	
	
	
	

}
