
public class Aluno extends Usuario{
	private long matricula;
	
	public Aluno(String nome, String estadoCivil, String alergias, String email, int cpf, int telefoneMovel, int telefoneFixo, char sexo, Endereco endereco, String login, char[] senha, long matricula) {
		super(nome,estadoCivil,alergias,email,cpf,telefoneMovel,telefoneFixo,sexo,endereco,login,senha);
		setMatricula(matricula);
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
}
