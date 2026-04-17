package entidade;

public class Curso {
	private String nome;
	private String turno;
	private String sigla;
	private int vagas;
	private Grade grade;
	private Campus campus;
	private int numeroDePeriodos;
	private String perfilEgresso;
	
	public float notaDeCorte() {
		return 0.0f;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	public int getNumeroDePeriodos() {
		return numeroDePeriodos;
	}

	public void setNumeroDePeriodos(int numeroDePeriodos) {
		this.numeroDePeriodos = numeroDePeriodos;
	}

	public String getPerfilEgresso() {
		return perfilEgresso;
	}

	public void setPerfilEgresso(String perfilEgresso) {
		this.perfilEgresso = perfilEgresso;
	}
	
	
}