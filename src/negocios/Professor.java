package negocios;

public class Professor extends Usuario{
	private long siape;

	public Professor(String nome, String estadoCivil, String alergias, String email, int cpf, int telefoneMovel, int telefoneFixo, char sexo, Endereco endereco, String login, char[] senha, long siape) {
		super(nome,estadoCivil,alergias,email,cpf,telefoneMovel,telefoneFixo,sexo,endereco,login,senha);		
		setSiape(siape);		
	}
	public long getSiape() {
		return siape;
	}
	public void setSiape(long siape) {
		this.siape = siape;
	}
}
