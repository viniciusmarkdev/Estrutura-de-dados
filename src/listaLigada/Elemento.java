package listaLigada;

public class Elemento {
	
	//Para reaproveitar essa lista para vários tipos
	//eu posso usar o tipo Object naqual todas as classes herdam
	//, porém eu não vou ter o type safety.
	
	//Se eu tiver que acessar um valor na lista eu terei que fazer um cast
	//para converter o Object para o tipo que queremos
	//Eu não tenho a garantia de que o que elemento que queremos está  na lista.
	
	private String valor;
	
	private Elemento proximo;

	public Elemento(String valor) {
	
		
		this.valor = valor;
		
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Elemento getProximo() {
		
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		
		this.proximo = proximo;
	}
	
	
	
	
	
	
	

	
	
	
}
