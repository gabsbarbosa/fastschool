
public class Professor {
	
	private String materia;
	private Turma turma;
	private Endereco endereco;
	private Disciplina[] disciplina;
	
	public Professor(String materia, Turma turma, Endereco endereco, Disciplina[] disciplina) {
		this.materia = materia;
		this.turma = turma;
		this.endereco = endereco;
		this.disciplina = disciplina;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Disciplina[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}



	
}
