package interfaceNegociosDados;

import negocios.Turma;

public interface RepositorioTurma {
	public void inserir(Turma turma);
	public void atualizar(Turma turma);
	public Turma procurar(String serie);
	public Turma procurar(int id);
	public void remover(Turma turma);
}
