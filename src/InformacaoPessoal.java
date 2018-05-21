
public class InformacaoPessoal {
	private String nome, estadoCivil, alergias, email;
	private int cpf, telefoneMovel, telefoneFixo;
	private char sexo;
	private Usuario usuario;
	
	public InformacaoPessoal(String nome, String estadoCivil, String alergias, String email, int cpf, int telefoneMovel, int telefoneFixo, char sexo, Usuario usuario) {
		this.nome = nome;
		this.estadoCivil = estadoCivil;
		this.alergias = alergias;
		this.email = email;
		this.cpf = cpf;
		this.telefoneMovel = telefoneMovel;
		this.telefoneFixo = telefoneFixo;
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefoneMovel() {
		return telefoneMovel;
	}

	public void setTelefoneMovel(int telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}

	public int getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(int telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
