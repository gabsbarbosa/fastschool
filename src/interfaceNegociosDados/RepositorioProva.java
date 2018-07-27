package interfaceNegociosDados;

import negocios.Prova;

public interface RepositorioProva {
	public void inserir(Prova prova);
	public void atualizar(Prova prova);
	//retorna lista de provas do alunos
	public Prova procurar(String nome);
	public void remover(Prova prova);
}
