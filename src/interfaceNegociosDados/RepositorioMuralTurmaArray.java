package interfaceNegociosDados;

import negocios.MuralTurma;

public class RepositorioMuralTurmaArray implements RepositorioMuralTurma{
	
	private MuralTurma[] muralturmas;
	private int indice;
	
	private final static int TAMANHO = 100;
	
	public RepositorioMuralTurmaArray() {
		this.muralturmas = new MuralTurma[TAMANHO];
		this.indice = 0;
		
	}
	
	public void inserir(MuralTurma muralturma) {
		
	}
	public void atualizar (MuralTurma muralturma) {
		
	}
	public void remover(String numero) {
		
	}

	

}
