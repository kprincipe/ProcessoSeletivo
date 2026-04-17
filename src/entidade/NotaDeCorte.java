package entidade;

public class NotaDeCorte {
	private Curso curso;
	private float[] notas = new float[3];
	
	public void setNota(int dia, float nota) {
		notas[dia-1] = nota;
	}
	
	public float getNota(int dia) {
		return notas[dia-1];
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}