package interfaceNegociosDados;

import negocios.Professor;

public class RepositorioProfessorArray implements RepositorioProfessor {
	
	private Professor[] professor;
	private int indice;
	
	private final static int TAMANHO=100;
	
	public RepositorioProfessorArray() {
		this.professor = new Professor[TAMANHO];
		this.indice = 0;
	}
	public void inserir(Professor professor) {
		this.professor[indice] = professor;
		this.indice = this.indice + 1;
	}
	public void atualizar(Professor professor) {

	}		
	public Professor procurar(String nome) {
		int i=0;
		Professor resultado = null;
		while(i<=indice) {
			if(professor[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(professor[i].getNome() != null) {
				if(professor[i].getNome().equals(nome)) {
					resultado =  professor[i];
				}
			}
			i++;
		}
		return resultado;
	}
	
	public void remover(Professor professor) {
		professor = null;
	}


}
