package entidade;

import java.util.ArrayList;

public class EdicaoEnem {
	private int ano;
	private ArrayList<NotaDeCorte> notasDeCorte = new ArrayList<>();
	private ArrayList<Candidato> candidatos = new ArrayList<>();
	private int ultimaInscricao = 0;
	
	public EdicaoEnem(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	private EdicaoEnem() {}

	public void inscreverCandidato(Candidato candidato) {
		candidato.setNumeroInscricao(++ultimaInscricao);
		candidatos.add(candidato);
	}
	
	public void calcularNotaDeCorte(Curso curso) {
		// Determinando uma nota 7 como sendo nota de corte
		// Falta fazer o cálculo correto
		for(Candidato candidato : candidatos) {
			if(candidato.getCurso().equals(curso)) {
				NotaDeCorte notaDeCorte = new NotaDeCorte();
				notaDeCorte.setNota(1, candidato.getNotaEnem());
				notasDeCorte.add(notaDeCorte);
				break;
			}
		}
	}
	
	public float obterNotaDeCortre(Curso curso) {
		for(NotaDeCorte notaDeCorte : notasDeCorte) {
			if(notaDeCorte.getCurso().equals(curso)) {
				return notaDeCorte.getNota(1);
			}
		}
		
		return 0.0f;
	}
	
	
	// Sobrecarga de métodos
	// Dois métodos com mesmo nome, mas com parâmetros diferentes
	public Candidato getCandidato(int numeroInscricao) {
		for(Candidato candidato : candidatos) {
			if (candidato.getNumeroInscricao() == numeroInscricao)
				return candidato;
		}
		return null;
	}
	
	public Candidato getCandidato(String cpf) {
		for (Candidato candidato : candidatos) {
			if (candidato.getCpf().equals(cpf));
				return candidato;
		}
		return null;
	}
}