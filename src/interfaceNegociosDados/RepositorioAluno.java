package interfaceNegociosDados;
import negocios.Aluno;
public interface RepositorioAluno {
	public void inserir(Aluno aluno);
	public void atualizar(Aluno aluno);
	public Aluno procurar(String nome);
	public void remover(Aluno aluno);

}
