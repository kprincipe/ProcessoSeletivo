package controle;

import java.util.ArrayList;
import java.util.Scanner;

import entidade.Campus;
import util.Input;

public class CampusController {
	
	private ArrayList<Campus> campi = new ArrayList<>();
	
	public void cadastrar() {
		
		Campus campus = new Campus();
		
		System.out.print("Informe o nome do Campus: ");
		campus.setNome(Input.get());
		System.out.print("Informe a sigla do Campus: ");
		campus.setSigla(Input.get());
		System.out.print("Informe o endereço do Campus: ");
		campus.setEndereco(Input.get());

		campi.add(campus);
	}
	
	public void listar() {
		int i = 0;
		for(Campus campus : campi) {
			System.out.print(i);
			System.out.print(". ");
			mostrarCampus(campus);
			i++;
		}
	}
	
	public void mostrarCampus(Campus campus) {
		System.out.println("====== CAMPUS ======");
		System.out.print("Nome: ");
		System.out.println(campus.getNome());
		System.out.print("Sigla: ");
		System.out.println(campus.getSigla());
		System.out.print("Endereço: ");
		System.out.println(campus.getEndereco());
	}
	
	public Campus getCampus(int i) {
		return campi.get(i);
	}
}