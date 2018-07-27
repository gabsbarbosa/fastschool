package interfaceNegociosDados;

import negocios.Disciplina;

public interface RepositorioDisciplina {
	public void inserir(Disciplina disciplina);
	public void atualizar(Disciplina disciplina);
	public Disciplina procurar(String nome);
	public Disciplina procurar(int id);
	public void remover(Disciplina Disciplina);
}
