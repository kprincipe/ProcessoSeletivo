package entidade;

public class Candidato {
	private String nome;
	private String cpf;
	private String email;
	private int numeroInscricao;
	private float notaEnem;
	private Curso curso;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroInscricao() {
		return numeroInscricao;
	}
	public void setNumeroInscricao(int numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}
	public float getNotaEnem() {
		return notaEnem;
	}
	public void setNotaEnem(float notaEnem) {
		this.notaEnem = notaEnem;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}