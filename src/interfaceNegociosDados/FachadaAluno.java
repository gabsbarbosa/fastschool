package interfaceNegociosDados;

import negocios.Aluno;
import negocios.ControleAluno;

public class FachadaAluno {
	private ControleAluno alunos;
	private static FachadaAluno instance;
	
	public FachadaAluno() {
		alunos = new ControleAluno();
	}
	
	public static FachadaAluno getInstance(){
		if (FachadaAluno.instance == null){
			FachadaAluno.instance = new FachadaAluno();
		}
		return FachadaAluno.instance;
	}
	
	public void cadastrar(Aluno aluno) {
		alunos.cadastrar(aluno);
	}
	
	public Aluno procurar(String numero) {
		return alunos.procurar(numero);
	}
	
	public void atualizar(Aluno aluno) {
		alunos.atualizar(aluno);
	}
	
	public void remover(Aluno aluno) {
		alunos.remover(aluno);
	}

}
