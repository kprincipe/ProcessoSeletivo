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
	
	public void verInscricao(int ano) {
		int opcao;
		System.out.println("VER INSCRIÇÃO");
		System.out.println("Digite 1 para fornecer o CPF");
		System.out.println("Digite 2 para fornecer o Número da Inscrição");
		opcao = Integer.parseInt(Input.get());
		
		switch (opcao) {
		case 1:
			System.out.println("Informe o CPF: ");
			mostrarCandidato(obterEdicaoEnem(ano).getCandidato(Input.get()));
			break;
		case 2:
			System.out.println("Informe o Número da Inscrição: ");
			mostrarCandidato(obterEdicaoEnem(ano).getCandidato(Integer.parseInt(Input.get())));
			break;
		}
		
	}
	
	private void mostrarCandidato(Candidato candidato) {
		System.out.println("===== CANDIDATO =====");
		System.out.println("Inscrição: " + candidato.getNumeroInscricao());
		System.out.println("Nome: " + candidato.getNome());
		System.out.println("CPF: " + candidato.getCpf());
		System.out.println("Email: " + candidato.getEmail());
		System.out.println("Curso: " + candidato.getCurso().getSigla());
		System.out.println("Nota do Enem" + candidato.getNotaEnem());
		System.out.println("=====================");
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