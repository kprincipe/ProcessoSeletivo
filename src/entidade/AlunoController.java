package entidade;

import java.util.List;
import java.util.ArrayList;

public class AlunoController {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void importarCandidatos(List<Candidato> candidatos) {
		//TODO concluir importacao dos dados de candidato em alunos
		for(Candidato candidato : candidatos) {
			Aluno aluno = (Aluno) candidato;
			aluno.getNumeroInscricao();
			Candidato c = new Aluno();
			c.getNome();
			alunos.add(aluno);
		}
		
	}
	
}
