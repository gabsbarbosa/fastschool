package interfaceNegociosDados;

import negocios.MuralTurma;

public interface RepositorioMuralTurma {
	public void inserir(MuralTurma muralturma);
	public void atualizar (MuralTurma muralturma);
	public void remover(String numero);

}
