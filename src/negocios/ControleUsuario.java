package negocios;

import interfaceNegociosDados.RepositorioUsuario;
import interfaceNegociosDados.RepositorioUsuarioArray;

public class ControleUsuario {
	RepositorioUsuario usuario = new RepositorioUsuarioArray();
	
	public void cadastrar(Usuario usuario){
		boolean validar = validarInformacoes(usuario);
		if (usuario == null) {
			//EXCEPTION CAMPO VAZIO
		}
		else if(validar) {
			this.usuario.inserir(usuario);
		}
	}
	
	public void procurar(String nome){
		if (nome.isEmpty()) { 
			this.usuario.procurar(nome);  
		}
		//else EXCEPTION
	}	
	public void atualizar(Usuario usuario) {
		
		this.atualizar(usuario);
	}
	public void remover (Usuario usuario) {
		this.usuario.remover(usuario);
	}

	public boolean validarInformacoes(Usuario usuario) {
		char vazio = ' ';
		if(usuario.getNome() != null) {
			if(usuario.getEstadoCivil() != null) {
				if(usuario.getCpf() > 0) {
					if(usuario.getTelefoneMovel() > 0 ||usuario.getTelefoneFixo() > 0) {
						if(usuario.getSexo() == 'M' || usuario.getSexo() == 'F') {
							if(usuario.getEndereco() != null) {
								if(usuario.getLogin() != null) {
									if(usuario.getSenha() != vazio) {
										return true;
									}else return false;
								}else return false;
							}else return false;
						}else return false;
					}else return false;
				}else return false;
			}else return false;
		}
		else return false;
	}
}
