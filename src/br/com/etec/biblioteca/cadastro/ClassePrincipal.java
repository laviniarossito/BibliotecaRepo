package br.com.etec.biblioteca.cadastro;

public class ClassePrincipal {

	public static void main(String[] args) {

		ClasseInformacoes info_Obj1 = new ClasseInformacoes();
		ClasseInformacoes info_Obj2 = new ClasseInformacoes("Dom Casmurro", "Machado de Assis");
		info_Obj1.mostrarDados(); //null 0
		info_Obj2.mostrarDados(); //null 0 autor e titulo
	}

}
