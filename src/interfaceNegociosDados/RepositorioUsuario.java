package interfaceNegociosDados;

import negocios.Usuario;

public interface RepositorioUsuario {
	public void inserir(Usuario usuario);
	public void atualizar(Usuario usuario);
	public Usuario procurar(String nome);
	public Usuario procurar(long cpf);
	public void remover(Usuario usuario);

}
