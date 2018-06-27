package negocios;

import interfaceNegociosDados.RepositorioAluno;
import interfaceNegociosDados.RepositorioAlunoArray;

public class ControleAluno {
	RepositorioAluno aluno = new RepositorioAlunoArray();
	
	public void cadastrar(Aluno aluno){
		this.aluno.inserir(aluno);
	}
	
	public Aluno procurar(String nome){
		return this.aluno.procurar(nome);  
	}	
	public void atualizar(Aluno aluno) {
		//
	}
	public void remover (Aluno aluno) {
		this.aluno.remover(aluno);
	}

	
	
}
