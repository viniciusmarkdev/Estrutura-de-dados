package listaLigadaGenerica;

public class listaLigadaGenerica<T> {
	
	
	
    private Node<T> primeiro;
	
	private Node<T> ultimo;
	
	
	
	private int tamanho = 0;
	
	
	

	public Node<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Node<T> primeiro) {
		this.primeiro = primeiro;
	}

	public Node<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(Node<T> ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
	
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		
		this.tamanho= tamanho;
		
	}
	
	@Override
	public String toString() {
		
		StringBuffer conc = new StringBuffer("");
		conc.append("[");
		
		Node<T> novoElemento = this.primeiro;
		while(novoElemento!=null) {
			
			
			conc.append(novoElemento.getValue()+","+" ");
			novoElemento = novoElemento.getPróximo();
			
			
		}
		
	    conc.append("]");
		return conc.toString();
	
	    
		
	}

	public void adicionar(T novoValor) {
		
		
		Node<T> novoElemento = new Node(novoValor);
		
		if(this.primeiro==null && this.ultimo==null) {
			
			this.primeiro = novoElemento;
			
			this.ultimo = novoElemento;
			
			
			
			
		}else {
			
		    
			this.ultimo.setPróximo(novoElemento);
			this.ultimo = novoElemento;
			
			
		}
		
		this.tamanho++;
		
		
		
		
	}
	
	public void remover(T valorProcurado) {
		
		Node<T> anterior = null;
		Node<T> atual = this.primeiro;
		for(int i =0 ; i<this.getTamanho();i++) {
			
			
			
			if(atual.getValue().equals(valorProcurado)) {
				
				if(this.tamanho==1) {
					
					this.primeiro = null;
					this.ultimo = null;
				}
				
				else if(atual==primeiro) {
				   
				   this.primeiro = atual.getPróximo();
				   atual.setPróximo(null);
				   
			   }else if(atual==ultimo){
				   
				   this.ultimo = anterior;
				   anterior.setPróximo(null);
				   
				   
			   }else {
				   
				   anterior.setPróximo(atual.getPróximo());
				   atual = null;
				   
			   }
				
			
			   this.tamanho--;
			   break;
				
			}
			
			anterior = atual;
			atual = atual.getPróximo();
			
		}
		
	}
	
	public Node<T> get(int posicao) {
		
		Node<T> atual = this.primeiro;
		for(int i=0 ; i< posicao ; i++) {
					
			if(atual.getPróximo()!=null) {
				
				atual = atual.getPróximo();
				
			}
		}
		
		return atual;
		
		
	}
	
	

	
	

}
