package GUI;

import interfaceNegociosDados.RepositorioAluno;
import interfaceNegociosDados.RepositorioAlunoArray;
import interfaceNegociosDados.RepositorioProfessor;
import interfaceNegociosDados.RepositorioProfessorArray;
import negocios.Aluno;
import negocios.Disciplina;
import negocios.Endereco;
import negocios.Professor;
import negocios.Turma;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco endereco = new Endereco ("rua esttevao", "varzea", "casa", "cidade", "PE", "205", 50740270);
		Aluno aluno = new Aluno("joao", "solteiro", "nenhuma","exemplo@hotmail.com", 999 , 8999, 333, 's', endereco, "JOAOZINHO123", '1' , 23 );
		Professor professor1 = new Professor ("Carlos", "Casado", "Poeira", "professorexemplo@hotmail.com", 123, 8132 ,8898, 'M', endereco, "CARLOS123", '1' , 1212312);
		Professor professor2 = new Professor ("Joana", "Casado", "Poeira", "professorexemplo2@hotmail.com", 321, 8192 ,8798, 'F', endereco, "JOANA123", '2' , 12312);
		RepositorioAluno alunos = new RepositorioAlunoArray();
		alunos.inserir(aluno);
		RepositorioProfessor professores = new RepositorioProfessorArray();
		professores.inserir(professor1);professores.inserir(professor2);
		
		Turma turma = new Turma("1°ano", 25, 1);
		//Disciplina disciplina = new Disciplina("portugues" , 1);
		
	

}
}
