package interfaceNegociosDados;

import negocios.Disciplina;

public class RepositorioDisciplinaArray implements RepositorioDisciplina {
	
	private Disciplina[] disciplinas;
	private int indice;
	
	private final static int TAMANHO=100;
	
	public RepositorioDisciplinaArray() {
		this.disciplinas = new Disciplina[TAMANHO];
		this.indice = 0;
	}
	
	public void inserir(Disciplina disciplina) {
		this.disciplinas[indice] = disciplina;
		this.indice = this.indice + 1;
	}
	public void atualizar(Disciplina disciplina) {
		int i=0;
		while(i<=indice) {
			if(disciplinas[i] == null) {				
				System.out.println("Erro procurar disciplina RepositorioDisciplinaArray");
			}
			else if(disciplinas[i].getId() != 0) {
				if(disciplinas[i].getId() == disciplina.getId()) {
					disciplinas[i] = disciplina;
				}
			}
			i++;
		}
	}
	public Disciplina procurar(String nome) {
		int i=0;
		Disciplina resultado = null;
		while(i<=indice) {
			if(disciplinas[i] == null) {				
				System.out.println("Erro procurar disciplina RepositorioDisciplinaArray");
			}
			else if(disciplinas[i].getNome() != null) {
				if(disciplinas[i].getNome().equals(nome)) {
					resultado =  disciplinas[i];
				}
			}
			i++;
		}
		return resultado;
	}
	public Disciplina procurar(int id) {
		int i=0;
		Disciplina resultado = null;
		while(i<=indice) {
			if(disciplinas[i] == null) {				
				System.out.println("Erro procurar disciplina RepositorioDisciplinaArray");
			}
			else if(disciplinas[i].getId() != 0) {
				if(disciplinas[i].getId() == id) {
					resultado =  disciplinas[i];
				}
			}
			i++;
		}
		return resultado;
	}
	public void remover(Disciplina disciplina) {
		atualizar(null);
		disciplina = null;
		
		/*int i=0;
		while(i<=indice) {
			if(disciplinas[i] == null) {				
				System.out.println("Erro procurar disciplina RepositorioDisciplinaArray");
			}
			else if(disciplinas[i].getId() != 0) {
				if(disciplinas[i].getId() == disciplina.getId()) {
					disciplinas[i] = null;
					disciplina = null;
				}
			}
			i++;
		}*/
	}
}
