package negocios;

public class Prova {
	private float unidade1, unidade2, unidade3, unidade4;
	private int unidade;
	private Aluno aluno;
	
	public Prova(float nota, char unidade, Aluno aluno) {		
		if(unidade == 1) {
			setUnidade1(nota);
		}
		else if(unidade == 2) {
			setUnidade2(nota);
		}
		else if(unidade == 3) {
			setUnidade3(nota);
		}
		else if(unidade == 4) {
			setUnidade4(nota);
		}
		setAluno(aluno);
	}

	public float getUnidade1() {
		return unidade1;
	}

	public void setUnidade1(float unidade1) {
		this.unidade1 = unidade1;
	}

	public float getUnidade2() {
		return unidade2;
	}

	public void setUnidade2(float unidade2) {
		this.unidade2 = unidade2;
	}

	public float getUnidade3() {
		return unidade3;
	}

	public void setUnidade3(float unidade3) {
		this.unidade3 = unidade3;
	}

	public float getUnidade4() {
		return unidade4;
	}

	public void setUnidade4(float unidade4) {
		this.unidade4 = unidade4;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
