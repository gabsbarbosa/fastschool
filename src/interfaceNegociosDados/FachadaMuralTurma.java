package interfaceNegociosDados;

import negocios.Aluno;
import negocios.MuralTurma;

public class FachadaMuralTurma {
		private ControleMuralTurma murais;
		private static FachadaMuralTurma instance;
		
		public FachadaMuralTurma() {
			murais = new ControleMuralTurma();
		}
		
		public static FachadaMuralTurma getInstance(){
			if (FachadaMuralTurma.instance == null){
				FachadaMuralTurma.instance = new FachadaMuralTurma();
			}
			return FachadaMuralTurma.instance;
		}
		
		public void cadastrar(MuralTurma muralturma) {
			MuralTurma.cadastrar(muralturma);
		}
		
		public Aluno procurar(String numero) {
			return alunos.procurar(numero);
		}
		
		public void atualizar(Aluno aluno) {
			alunos.atualizar(aluno);
		}
		
		public void remover(Aluno aluno) {
			alunos.remover(aluno);
		}

	}


