package interfaceNegociosDados;

import negocios.Prova;

public class RepositorioProvaArray implements RepositorioProva{

	private Prova[] provas;
	private int indice;
	
	private final static int TAMANHO=100;
	
	public RepositorioProvaArray() {
		this.provas = new Prova[TAMANHO];
		this.indice = 0;
	}
	public void inserir(Prova prova) {
		this.provas[indice] = prova;
		this.indice = this.indice + 1;
	}
	public void atualizar(Prova prova) {
		int i=0;
		while(i<=indice) {
			if(provas[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(provas[i].getAluno() != null) {
				if(provas[i].getAluno().getNome().equals(prova.getAluno().getNome())) {
					provas[i] = prova;
				}
			}
			i++;
		}
	}		
	public Prova procurar(String nome) {
		int i=0;
		Prova resultado = null;
		while(i<=indice) {
			if(provas[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(provas[i].getAluno().getNome() != null) {
				if(provas[i].getAluno().getNome().equals(nome)) {
					resultado =  provas[i];
				}
			}
			i++;
		}
		return resultado;
	}
	public void remover(Prova prova) {
		atualizar(null);
		prova = null;
		
		/*int i=0;
		while(i<=indice) {
			if(provas[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(provas[i].getAluno().getNome() != null) {
				if(provas[i].getAluno().getNome().equals(prova.getAluno().getNome())) {
					provas[i] = null;
					prova = null;
				}
			}
			i++;
		}*/
	}
}
