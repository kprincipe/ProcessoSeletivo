package controle;

import java.util.ArrayList;

import entidade.Candidato;
import entidade.Curso;
import entidade.EdicaoEnem;
import entidade.NotaDeCorte;
import util.Input;

public class Sisu {
	
	private ArrayList<EdicaoEnem> edicoesEnem = new ArrayList<>();
	

	public void definirNovaEdicaoEnem(int ano) {
		EdicaoEnem edicaoEnem = new EdicaoEnem(ano);
		edicoesEnem.add(edicaoEnem);
	}
	
	public void verNotaDeCorte(int numeroInscricao) {
		
	}
	
	public void fazerInscricao(Curso curso, int ano) {
		Candidato candidato = new Candidato();
		System.out.print("Informe o nome do candidato: ");
		candidato.setNome(Input.get());
		System.out.print("Informe o CPF do candidato: ");
		candidato.setCpf(Input.get());
		System.out.print("Informe o e-mail do candidato: ");
		candidato.setEmail(Input.get());
		System.out.print("Informe a nota do Enem: ");
		candidato.setNotaEnem(Float.parseFloat(Input.get()));
		candidato.setCurso(curso);
		
		obterEdicaoEnem(ano).inscreverCandidato(candidato);
		
		System.out.println("INSCRIÇÃO: " + candidato.getNumeroInscricao());
	}
	public void calcularNotaDeCorte(Curso curso, int ano) {
		obterEdicaoEnem(ano).calcularNotaDeCorte(curso);
	}
	
	private EdicaoEnem obterEdicaoEnem(int ano) {
		for (EdicaoEnem edicaoEnem : edicoesEnem) {
			if (edicaoEnem.getAno() == ano) return edicaoEnem;
		}
		return null;
	}
	
	public float obterNotaDeCorte (Curso curso, int ano) {
		EdicaoEnem edicaoEnem = obterEdicaoEnem(ano);
		if (edicaoEnem == null)
			return 0.0f;
		
		return edicaoEnem.obterNotaDeCortre(curso);
	}

}