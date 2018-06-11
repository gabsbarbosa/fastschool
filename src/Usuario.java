
public class Usuario {
	private String nome, estadoCivil, alergias, email;
	private int cpf, telefoneMovel, telefoneFixo;
	private char sexo;
	private Endereco endereco;
	private String login;
	private char[] senha;
	
	public Usuario(String nome, String estadoCivil, String alergias, String email, int cpf, int telefoneMovel, int telefoneFixo, char sexo, Endereco endereco, String login, char[] senha) {
		setNome(nome);
		setEstadoCivil(estadoCivil);
		setAlergias(alergias);
		setEmail(email);
		setCpf(cpf);
		setTelefoneMovel(telefoneMovel);
		setTelefoneFixo(telefoneFixo);
		setSexo(sexo);
		setEndereco(endereco);
		setLogin(login);
		setSenha(senha);
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public char[] getSenha() {
		return senha;
	}
	public void setSenha(char[] senha) {
		this.senha = senha;
	}
	
	
}
