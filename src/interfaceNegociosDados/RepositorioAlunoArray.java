package interfaceNegociosDados;

import negocios.Aluno;

public class RepositorioAlunoArray implements RepositorioAluno{

	private Aluno[] alunos;
	private int indice;
	
	private final static int TAMANHO=100;
	
	public RepositorioAlunoArray() {
		this.alunos = new Aluno[TAMANHO];
		this.indice = 0;
	}
		
	@Override
	public void inserir(Aluno aluno) {
		this.alunos[indice] = aluno;
		this.indice = this.indice + 1;
	}

	@Override
	public void atualizar(Aluno aluno) {
		int i=0;
		while(i<=indice) {
			if(alunos[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(alunos[i].getNome() != null) {
				if(alunos[i].getNome().equals(aluno.getNome())) {
					alunos[i] = aluno;
				}
			}
			i++;
		}
		
	}

	@Override
	public Aluno procurar(String nome){
		// TODO Auto-generated method stub
		int i=0;
		Aluno resultado = null;
		while(i<=indice) {
			if(alunos[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(alunos[i].getNome() != null) {
				if(alunos[i].getNome().equals(nome)) {
					resultado =  alunos[i];
				}
			}
			i++;
		}
		return resultado;
	}
	@Override
	public void remover(Aluno aluno) {
		atualizar(null);
		aluno = null;
		/*int i=0;
		while(i<=indice) {
			if(alunos[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(alunos[i].getNome() != null) {
				if(alunos[i].getNome().equals(aluno.getNome())) {
					alunos[i] = null;
					aluno = null;
				}
			}
			i++;
		}*/
	}
}
