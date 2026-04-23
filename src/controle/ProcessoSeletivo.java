package controle;

import java.util.Scanner;

import entidade.Campus;
import entidade.Curso;
import util.Input;

@SuppressWarnings("resource")
public class ProcessoSeletivo {

	private static CampusController campusController = new CampusController();
	private static CursoController cursoController = new CursoController();
	private static Sisu sisu = new Sisu();
	private static int anoSisu = 0;

	public static void main(String[] args) {
		int opcao;
		do {
			System.out.println("PROCESSO SELETIVO");
			System.out.println("SELECIONE A OPÇÃO PELO NUMERO");
			System.out.println("1. Cadastro de Campus");
			System.out.println("2. Cadastro de Curso");
			System.out.println("3. Sair");

			System.out.print("Selecione a opção: ");
			opcao = Integer.parseInt(Input.get());
			
			switch (opcao) {
			case 1:
				cadastrarCampus();
				break;
			case 2:
				cadastrarCurso();
				break;
			}
		} while (opcao < 3);
	}
	
	private static void cadastrarCampus() {
		int opcao;
		do {
			System.out.println("CADASTRO DE CAMPUS");
			System.out.println("SELECIONE A OPÇÃO PELO NUMERO");
			System.out.println("1. Cadastrar Campus.");
			System.out.println("2. Listar Campi.");
			System.out.println("3. Mostrar Campus.");
			System.out.println("4. Sair");
			
			System.out.print("Selecione a opção: ");
			opcao = Integer.parseInt(Input.get());
			
			switch (opcao) {
			case 1:
				campusController.cadastrar();
				break;
			case 2:
				campusController.listar();
				break;
			case 3:
				campusController.listar();
				System.out.print("Selecione um campus: ");
				
				campusController.mostrarCampus(campusController.getCampus(Integer.parseInt(Input.get())));
				break;
			}
			
		} while(opcao < 4);
	}
	
	private static void cadastrarCurso() {
		campusController.listar();
		System.out.print("Selecione um campus: ");
		Campus campus = campusController.getCampus(Integer.parseInt(Input.get()));
		
		int opcao;
		do {
			System.out.println("CADASTRO DE CURSO PARA O CAMPUS ");
			System.out.println(campus.getNome());
			System.out.println("SELECIONE A OPÇÃO PELO NUMERO");
			System.out.println("1. Cadastrar Curso.");
			System.out.println("2. Listar Cursos.");
			System.out.println("3. Sair");
			opcao = Integer.parseInt(Input.get());

			switch(opcao) {
			case 1:
				cursoController.cadastrar(campus);
				break;
			case 2:
				cursoController.listar(campus);
				break;
			}
			
		} while(opcao < 3);
	}
	
	
	
	private static void operarSisu() {
		int opcao;
		do {
			System.out.println("SISU");
			System.out.println("SELECIONE A OPÇÃO PELO NUMERO");
			System.out.println("1. Definir nova edição");
			System.out.println("2. Inscrever candidato.");
			System.out.println("3. Sair");
			opcao = Integer.parseInt(Input.get());

			switch(opcao) {
			case 1:
				cadastrarCampus();
				break;
			case 2:
				cadastrarCurso();
				break;
			}
			
		} while(opcao < 3);
		
	}
	
	private static void solicitarAnoEnem() {
		System.out.println("Informe o ano da nova Edição:");
		anoSisu = Integer.parseInt(Input.get());
	}
	
	private static void fazerInscricao () {
		campusController.listar();
		System.out.println("Escolha o campus pelo número: ");
		int opcaoCampus = Integer.parseInt(Input.get());
		
		Campus campus = campusController.getCampus(opcaoCampus);
		
		cursoController.listar(campus);
		System.out.println("Escolha o curso pelo número: ");
		int opcaoCurso = Integer.parseInt(Input.get());
		sisu.fazerInscricao(cursoController.getCurso(opcaoCurso),anoSisu);

	}

/*
	public static void mostrarCandidato(Candidato candidato) {
		System.out.println("====== CANDIDATO ======");
		System.out.print("Inscrição: ");
		System.out.println(candidato.nInscricao);
		System.out.print("Nome: ");
		System.out.println(candidato.nome);
		System.out.print("Curso: ");
		System.out.print(candidato.curso.sigla);
		System.out.print(" - ");
		System.out.println(candidato.curso.campus.sigla);
		System.out.print("Nota do Enem: ");
		System.out.println(candidato.notaEnem);
		System.out.println();
	}
*/
}