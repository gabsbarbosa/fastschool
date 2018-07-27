package interfaceNegociosDados;

import negocios.Endereco;

public class RepositorioEnderecoArray implements RepositorioEndereco {
	private Endereco[] enderecos;
	private int indice;
	
	private final static int TAMANHO=100;
	
	public RepositorioEnderecoArray() {
		this.enderecos = new Endereco[TAMANHO];
		this.indice = 0;
	}
	
	public void inserir(Endereco endereco) {
		this.enderecos[indice] = endereco;
		this.indice = this.indice + 1;
	}
	public void remover(Endereco endereco) {
		int i=0;
		while(i<=indice) {
			if(enderecos[i] == null) {				
				System.out.println("Erro procurar disciplina RepositorioDisciplinaArray");
			}
			else if(enderecos[i].getCep() != 0) {
				if(enderecos[i].getCep() == endereco.getCep()) {
					enderecos[i] = null;
					endereco = null;
				}
			}
			i++;
		}
	}
}
