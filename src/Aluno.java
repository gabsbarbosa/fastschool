
public class Aluno {
	private InformacaoPessoal informacaoPessoal;
	private Endereco endereco;
	private Prova prova;
	
	public Aluno(InformacaoPessoal informacaoPessoal, Endereco endereco) {
		this.informacaoPessoal = informacaoPessoal;
	}

	public InformacaoPessoal getInformacaoPessoal() {
		return informacaoPessoal;
	}

	public void setInformacaoPessoal(InformacaoPessoal informacaoPessoal) {
		this.informacaoPessoal = informacaoPessoal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}






	

}
