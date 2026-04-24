package entidade;

public class Aluno extends Candidato {
	private String matricula;
	private int anoIngresso;
	private int anoEgresso;
	private String emailInstitucional;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public int getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	public int getAnoEgresso() {
		return anoEgresso;
	}
	public void setAnoEgresso(int anoEgresso) {
		this.anoEgresso = anoEgresso;
	}
	
	public String getEmailInstitucional() {
		return emailInstitucional;
	}
	public void setEmailInstitucional(String emailInstitucional) {
		this.emailInstitucional = emailInstitucional;
	}
	
}
