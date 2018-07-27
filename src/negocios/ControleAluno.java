package negocios;

import interfaceNegociosDados.RepositorioAluno;
import interfaceNegociosDados.RepositorioAlunoArray;

public class ControleAluno {
	//VALIDAÇÃO E REGRAS DE NEGOCIO
	RepositorioAluno aluno = new RepositorioAlunoArray();
	
	public void cadastrar(Aluno aluno){
		if (aluno != null) {
			this.aluno.inserir(aluno);
		}
	/*	else {
	 * System.out.println("Erro no cadastra aluno no controle aluno: Cadastro Vazio");
			
		}*/
	}
	
	public Aluno procurar(String nome){
		return this.aluno.procurar(nome);  
	}	
	public void atualizar(Aluno aluno) {
		
		this.atualizar(aluno);
	}
	public void remover (Aluno aluno) {
		if(aluno != null) {
			this.aluno.remover(aluno);
		}
	}

	
	
}
