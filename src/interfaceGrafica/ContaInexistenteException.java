package interfaceGrafica;

import negocios.Usuario;

public class ContaInexistenteException extends Exception{
	private String nome;
	private long siape;
	
	public ContaInexistenteException(String nome) {
		
	}
	public ContaInexistenteException(long siape) {
		
	}

}
