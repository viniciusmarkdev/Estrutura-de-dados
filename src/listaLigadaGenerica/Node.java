package listaLigadaGenerica;

public class Node<T>{

	
	private Node<T> pr�ximo;
	
	
	private  T value;
	
	public Node(T value) {
		
		
		this.value = value;
	}


	public Node<T> getPr�ximo() {
		return pr�ximo;
	}


	public void setPr�ximo(Node<T> pr�ximo) {
		this.pr�ximo = pr�ximo;
	}


	public T getValue() {
		return value;
	}


	public void setValue(T value) {
		this.value = value;
	}
	
	
	
	
	
	

}
