
public class FastSchool {
	public void cadastrarUsuario(String login, char[] senha) {
		Usuario usuario = new Usuario(login, senha);
	}
	public void cadastrarProfessor(String materia, Turma turma, Endereco endereco, Disciplina[] disciplina) {
		Professor professor = new Professor(materia, turma, endereco, disciplina);
	}
	public void cadastrarAluno(InformacaoPessoal informacaoPessoal, Endereco endereco) {
		Aluno aluno = new Aluno(informacaoPessoal, endereco);
	}
	public void cadastrarTurma(String serie, int sala, int id, Aluno[] aluno) {
		Turma turma = new Turma(serie, sala, id, aluno);
	}
	public void cadastrarDisciplina(String nome, int id) {
		Disciplina disciplina = new Disciplina(nome,id);
	}
	public void cadastrarMuralGeral(String informacao) {
		MuralGeral muralGeral = new MuralGeral(informacao);
	}
	public void cadastrarMuralTurma(String informacao) {
		MuralTurma muralTurma = new MuralTurma(informacao);
	}
	public void consultarUsuario(Usuario usuario) {
		usuario.getlogin();
		usuario.getSenha();
	}
	public void consultarProfessor(Professor professor) {
		professor.getMateria();
		professor.getTurma();
		professor.getEndereco();
		professor.getDisciplina();
	}
	public void consultarAluno(Aluno aluno) {
		aluno.getInformacaoPessoal();
		aluno.getEndereco();
		aluno.getProva();
	}
	public void consultarTurma(Turma turma) {
		turma.getSerie();
		turma.getSala();
		turma.getId();
		turma.getAluno();
	}
	public void consultarDisciplina(Disciplina disciplina) {
		disciplina.getNome();
		disciplina.getId();
	}
	public void consultarMuralGeral(MuralGeral muralGeral) {
		muralGeral.getInformacao();
		
	}
	public void consultarMuralTurma(MuralTurma muralTurma) {
		muralTurma.getInformacao();
	}
	public void editarUsuario(Usuario usuario, String login, char[]senha) {
		usuario.setLogin(login);
		usuario.setSenha(senha);
	}
	public void editarProfessor (Professor professor, Turma turma, String materia, Endereco endereco, Disciplina[] disciplina ) {
		professor.setTurma(turma);
		professor.setMateria(materia);
		professor.setEndereco(endereco);
		professor.setDisciplina(disciplina);
	}
	public void editarAluno (Aluno aluno, InformacaoPessoal informacaoPessoal, Endereco endereco, Prova prova) {
		aluno.setInformacaoPessoal(informacaoPessoal);
		aluno.setEndereco(endereco);
		aluno.setProva(prova);
	}
	public void editarTurma(Turma turma, String serie, int sala, int id, Aluno[] aluno) {
		turma.setSerie(serie);
		turma.setSala(sala);
		turma.setId(id);
		turma.setAluno(aluno);
	}
	public void editarDisciplina(Disciplina disciplina, String nome, int id) {
		disciplina.setNome(nome);
		disciplina.setId(id);
	}
	public void editarMuralGeral(MuralGeral muralGeral, String informacao) {
		muralGeral.setInformacao(informacao);
	}
	public void editarMuralTurma(MuralTurma muralTurma, String informacao) {
		muralTurma.setInformacao(informacao);
	}
	public void excluirUsuario(Usuario usuario) {
		usuario = null;
	}
	public void excluirProfessor(Professor professor) {
		professor = null;
	}
	public void excluirAluno(Aluno aluno) {
		aluno = null;
	}
	public void excluirTurma(Turma turma) {
		turma = null;
	}
	public void excluirDisciplina(Disciplina disciplina) {
		disciplina = null;
	}
	public void excluirMuralGeral(MuralGeral muralGeral) {
		muralGeral = null;
	}
	public void excluirMuralTurma(MuralTurma muralTurma) {
		muralTurma = null;
	}
		
	
}
