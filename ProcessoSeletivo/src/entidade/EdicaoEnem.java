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

	public void inscreverCandidato(Candidato candidato) {
		candidato.setNumeroInscricao(++ultimaInscricao);
		candidatos.add(candidato);
	}
	
	public void calcularNotaDeCorte(Curso curso) {
		//TODO Calcular a nota de corte do curso nesta edição
	}
	
}