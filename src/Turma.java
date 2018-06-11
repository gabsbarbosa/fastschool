
public class Turma {
	private String serie;//nome
	private int sala, id;
	private Professor[] professor;
	private Aluno[] aluno;
	private Disciplina[] disciplina;
	
	public Turma(String serie, int sala, int id, Aluno[] aluno) {
		this.serie = serie;
		this.sala = sala;
		this.id = id;
		this.aluno = aluno;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	public Aluno[] getAluno() {
		return aluno;
	}
	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}
	
}


