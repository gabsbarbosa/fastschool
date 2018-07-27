package GUI;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import interfaceNegociosDados.RepositorioAluno;
import interfaceNegociosDados.RepositorioAlunoArray;
import negocios.Aluno;
import negocios.Endereco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class TestePrograma {

	@Test
	void testListaAluno() {
		Endereco endereco = new Endereco ("rua esttevao", "varzea", "casa", "cidade", "PE", "205", 50740270);
		Aluno objetoTeste = new Aluno("joao", "solteiro", "nenhuma","exemplo@hotmail.com", 999 , 8999, 333, 's', endereco, "JOAOZINHO123", '1' , 23 );
		RepositorioAluno repositorio = new RepositorioAlunoArray();
		repositorio.inserir(objetoTeste);
		assertTrue(repositorio.procurar("joao").getNome().equals("joao"));
		
		
		fail("Não inserido");
	}
	
	

}
