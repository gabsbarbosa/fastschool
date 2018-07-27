package interfaceNegociosDados;

import negocios.Professor;

public class RepositorioProfessorArray implements RepositorioProfessor {
	
	private Professor[] professores;
	private int indice;
	
	private final static int TAMANHO=100;
	
	public RepositorioProfessorArray() {
		this.professores = new Professor[TAMANHO];
		this.indice = 0;
	}
	public void inserir(Professor professor) {
		this.professores[indice] = professor;
		this.indice = this.indice + 1;
	}
	public void atualizar(Professor professor) {
		int i=0;
		while(i<=indice) {
			if(professores[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(professores[i].getNome() != null) {
				if(professores[i].getNome().equals(professor.getNome())) {
					professores[i] = professor;
				}
			}
			i++;
		}
	}		
	public Professor procurar(String nome) {
		int i=0;
		Professor resultado = null;
		while(i<=indice) {
			if(professores[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(professores[i].getNome() != null) {
				if(professores[i].getNome().equals(nome)) {
					resultado =  professores[i];
				}
			}
			i++;
		}
		return resultado;
	}
	public Professor procurar(long siape) {
		int i=0;
		Professor resultado = null;
		while(i<=indice) {
			if(professores[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(professores[i].getSiape() != 0) {
				if(professores[i].getSiape() == siape) {
					resultado =  professores[i];
				}
			}
			i++;
		}
		return resultado;
	}
	
	public void remover(Professor professor) {
		atualizar(null);
		professor = null;
		
		/*int i=0;
		while(i<=indice) {
			if(professores[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(professores[i].getNome() != null) {
				if(professores[i].getNome().equals(professor.getNome())) {
					professores[i] = null;
					professor = null;
				}
			}
			i++;
		}*/
	}
	public void imprimir() {
		for(int i= 0; i<= indice; i++) {
		System.out.println(this.professores[indice]);
		}		
	}


}
