package interfaceNegociosDados;

import negocios.Professor;

public interface RepositorioProfessor {
	public void inserir(Professor professor);
	public void atualizar(Professor professor);
	public Professor procurar(String nome);
	public Professor procurar(long siape);
	public void remover(Professor professor);

}
