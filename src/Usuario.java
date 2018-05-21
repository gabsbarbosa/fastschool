
public class Usuario {
	private String login;
	private char[] senha;
	
	public Usuario(String login, char[] senha) {
		this.login = login;
		this.senha = senha;
	}
	public String getlogin() {
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
	public String getLogin() {
		return login;
	}
	

}
