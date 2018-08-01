package interfaceNegociosDados;

import negocios.Usuario;

public class RepositorioUsuarioArray implements RepositorioUsuario {
	
	private Usuario[] usuarios;
	private int indice;
	
	private final static int TAMANHO=100;
	
	public RepositorioUsuarioArray() {
		this.usuarios = new Usuario[TAMANHO];
		this.indice = 0;
	}
	public void inserir(Usuario usuario) {
		this.usuarios[indice] = usuario;
		this.indice = this.indice + 1;
	}
	public void atualizar(Usuario usuario) {
		int i=0;
		while(i<=indice) {
			if(usuarios[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(usuarios[i].getCpf() != 0) {
				if(usuarios[i].getCpf() == usuario.getCpf()) {
					usuarios[i] = usuario;
				}
			}
			i++;
		}
	}		
	public Usuario procurar(String nome) {
		int i=0;
		Usuario resultado = null;
		while(i<=indice) {
			if(usuarios[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(usuarios[i].getNome() != null) {
				if(usuarios[i].getNome().equals(nome)) {
					resultado =  usuarios[i];
				}
			}
			i++;
		}
		return resultado;
	}
	public Usuario procurar(long cpf) {
		int i=0;
		Usuario resultado = null;
		while(i<=indice) {
			if(usuarios[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(usuarios[i].getCpf() != 0) {
				if(usuarios[i].getCpf() == cpf) {
					resultado =  usuarios[i];
				}
			}
			i++;
		}
		return resultado;
	}
	
	public void remover(Usuario usuario) {
		atualizar(null);
		usuario = null;
		
		/*int i=0;
		while(i<=indice) {
			if(usuarios[i] == null) {				
				System.out.println("Erro procurar aluno RepositorioAlunoArray");
			}
			else if(usuarios[i].getCpf() != 0) {
				if(usuarios[i].getCpf() == usuario.getCpf()) {
					usuarios[i] = null;
					usuario = null;
				}
			}
			i++;
		}*/
	}
}
