package controle;

import java.util.ArrayList;

import entidade.Campus;
import entidade.Curso;
import entidade.Grade;
import util.Input;

public class CursoController {
	private ArrayList<Curso> cursos = new ArrayList<>();
	
	public void cadastrar(Campus campus) {
		
		Curso curso = new Curso();
		curso.setCampus(campus);
		
		System.out.print("Informe o nome do Curso: ");
		curso.setNome(Input.get());
		System.out.print("Informe a sigla do Curso: ");
		curso.setSigla(Input.get());
		System.out.print("Informe o Turno do Curso: ");
		curso.setTurno(Input.get());
		System.out.print("Informe o Número de Vagas: ");
		curso.setVagas(Integer.parseInt(Input.get()));
		System.out.print("Informe o Número de Períodos: ");
		curso.setNumeroDePeriodos(Integer.parseInt(Input.get()));
		System.out.print("Informe o Perfil do Egresso: ");
		curso.setPerfilEgresso(Input.get());

		cursos.add(curso);

	}
	
	public void listar(Campus campus) {
		int i = 0;
		for(Curso curso : cursos) {
			if(curso.getCampus().equals(campus)) {
				System.out.print(i);
				System.out.print(". ");
				System.out.println(curso.getNome() + " - " + curso.getSigla());
				i++;
			}
		}
	}
	
	public void cadastrarGrade(Curso curso) {
		
	}
	
	public void listarDisciplinas(Grade grade) {
		
	}
	
	private void cadastrarDisciplinas(Grade grade) {
		
	}
	
	public Curso getCurso(int i) {
		return cursos.get(i);
	}
}