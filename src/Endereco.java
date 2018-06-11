
public class Endereco {
	private String rua, bairro, complemento, cidade, uf, numero;
	private int cep;
	
	public Endereco(String rua, String bairro, String complemento, String cidade, String uf, String numero, int cep) {
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
		this.numero = numero;
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
}
