package interfaceNegociosDados;

import negocios.Turma;

public class RepositorioTurmaArray implements RepositorioTurma{

	private Turma[] turmas;
	private int indice;
	
	private final static int TAMANHO=100;
	
	public RepositorioTurmaArray() {
		this.turmas = new Turma[TAMANHO];
		this.indice = 0;
	}
	public void inserir(Turma turmas) {
		this.turmas[indice] = turmas;
		this.indice = this.indice + 1;
	}
	public void atualizar(Turma turma) {
		int i=0;
		while(i<=indice) {
			if(turmas[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(turmas[i].getId() != 0) {
				if(turmas[i].getId() == turma.getId()) {
					turmas[i] = turma;
				}
			}
			i++;
		}
	}		
	public Turma procurar(String serie) {
		int i=0;
		Turma resultado = null;
		while(i<=indice) {
			if(turmas[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(turmas[i].getSerie() != null) {
				if(turmas[i].getSerie().equals(serie)) {
					resultado =  turmas[i];
				}
			}
			i++;
		}
		return resultado;
	}
	public Turma procurar(int id) {
		int i=0;
		Turma resultado = null;
		while(i<=indice) {
			if(turmas[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(turmas[i].getId() != 0) {
				if(turmas[i].getId() == id) {
					resultado =  turmas[i];
				}
			}
			i++;
		}
		return resultado;
	}
	
	public void remover(Turma turma) {
		atualizar(null);
		turma = null;
		
		/*int i= 0;
		while(i<=indice) {
			if(turmas[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(turmas[i].getId() != 0) {
				if(turmas[i].getId() == turma.getId()) {
					turmas[i] = null;
					turma = null;
				}
			}
			i++;
		}*/
	}
}
